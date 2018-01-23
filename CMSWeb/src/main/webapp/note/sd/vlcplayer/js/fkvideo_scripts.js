
function getCamerasList(){
	$.ajax({
		url: window.location.origin+'/v0/camera/',
		method: 'GET',
		success: function (returndata) {
			console.log(returndata);
			for (var i = 0; i < returndata.length; i++) {
			    $("#camlist").append("<li>"+returndata[i].meta+": "+returndata[i].url+" ("+returndata[i].id+")<button class='camDelete' value='"+returndata[i].id+"'>Delete</button></li>");
			}
		},
		error: function (returndata) {
			console.log(JSON.parse(returndata.responseText));
		}
	});
}

$(document).ready(function(){
	getCamerasList();

	// Buttons handlers
	// $('#play').click(function(){
	// 	var vlc = document.getElementById("player");
	// 	vlc.playlist.items.clear();
	// 	var id = vlc.playlist.add($("#streamPath").val());
	// 	vlc.playlist.playItem(id);
	// });

	$('#camlist').on('click', '.camDelete', function() {
    //console.log("Deleting cam with id "+$(this).val());
		$.ajax({
			url: window.location.origin+'/v0/camera/'+$(this).val(),
			method: 'DELETE',
			success: function (returndata) {
				console.log(returndata);
				$('#camlist').empty();
				getCamerasList();
			},
			error: function (returndata) {
				console.log(JSON.parse(returndata.responseText));
			}
		});
	});


	$('#start_tracking').click(function() {
		if ($("#streamPath").val().indexOf("v4l2://") !=-1) {
			var source = $("#streamPath").val().split("v4l2://")[1];
		} else if ($("#streamPath").val().indexOf("file://") !=-1) {
			var source = $("#streamPath").val().split("file://")[1];
		} else {
			var source = $("#streamPath").val();
		}
		//console.log(source);
		$.ajax({
      url: window.location.origin+'/v0/camera/',
      method: 'POST',
      data: { detector: "detect1", meta: "cam1", url: source },
      success: function (returndata) {
        //console.log(returndata);
				$('#camlist').empty();
				getCamerasList();
      },
      error: function (returndata) {
        console.log(JSON.parse(returndata.responseText));
      }
    });
		var ws = new WebSocket("ws://"+window.location.host+"/v0/websocket/");
		ws.onopen = function() {
			ws.send("Hello, world");
		};
		ws.onmessage = function (evt) {
			var timestamp = new Date().toLocaleString();
			var parsedMessage = JSON.parse(evt.data);
			//var frame = parsedMessage.frame;
			var face = parsedMessage.face;
			// var bbox = parsedMessage.bbox.split("[[")[1].split("]]")[0].split(",");
			// var bbox_left = bbox[0]
			// var bbox_top = bbox[1];
			// var bbox_width = (bbox[2] - bbox[0]);
			// var bbox_height = (bbox[3] - bbox[1]);
			//console.log(bbox_left+", "+bbox_top+", "+bbox_width+", "+bbox_height);
			var result = JSON.parse(parsedMessage.identify);
			var cam_id = parsedMessage.cam_id;
			for (var key in result.results){
				try {
					$("#notifications").prepend("<div class='person'><div class='img video'><img class='frame' src='data:image/jpeg;base64,"+face+"'></div><div class='img'><img class='thumbnail' src='"+result.results[key][0]['face']['thumbnail'].replace("127.0.0.1", window.location.hostname)+"'></div><div class='info'><p>"+timestamp+"</p><p>ID: "+result.results[key][0]['face']['id']+"</p><p>Confidence: "+result.results[key][0]['confidence']+"</p><p>Name: "+result.results[key][0]['face']['meta']+"</p><p>Person ID: "+result.results[key][0]['face']['person_id']+"</p><p>cam_id: "+cam_id+"</p></div></div>");
					//$("#notifications").prepend("<div class='person'><div class='img video'><img class='frame' src='data:image/jpeg;base64,"+face+"'></div><div class='img'><img class='thumbnail' src='"+result.results[key][0]['face']['thumbnail']+"'></div><div class='info'><p>"+timestamp+"</p><p>ID: "+result.results[key][0]['face']['id']+"</p><p>Confidence: "+result.results[key][0]['confidence']+"</p><p>Name: "+result.results[key][0]['face']['meta']+"</p><p>Person ID: "+result.results[key][0]['face']['person_id']+"</p></div></div>");
				} catch(e) {
					$("#notifications").prepend("<div class='person'><div class='img video'><img class='frame' src='data:image/jpeg;base64,"+face+"'></div><p>"+timestamp+"</p><p>Unknown person</p><p>Age: "+parsedMessage.age+"</p><p>Gender: "+parsedMessage.gender+"</p></div>");
					console.log(e);
					console.log(result);
				}
			}
		};
	});
});
