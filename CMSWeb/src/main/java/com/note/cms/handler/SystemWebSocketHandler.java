package com.note.cms.handler;



import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.*;

import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SystemWebSocketHandler implements WebSocketHandler {
    private static final Map<String,WebSocketSession> sessions = new HashMap<String,WebSocketSession>();
    private static ServerSocket ss = null;
    private static final Logger logger = LoggerFactory.getLogger(SystemWebSocketHandler.class);
    public static volatile Map<String,String> sidMap = new HashMap<>();
    private static final Map<String, List<WebSocketSession>> macsession = new ConcurrentHashMap<String, List<WebSocketSession>>();

    public static WebSocketSession getWebSocketSession(String wssId){
        return sessions.get(wssId);
    }


    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.info(session+"connected");
    }

    @Override
    public void handleMessage(WebSocketSession wss, WebSocketMessage<?> wsm) throws Exception {
        String mac ="";
        String flag ="";
        JSONObject msg = JSON.parseObject(wsm.getPayload().toString());
        if (!msg.getString("mac").equals("") && msg.getString("mac") != null) {
            mac = msg.getString("mac");
        }if (!msg.getString("flag").equals("") && msg.getString("flag") != null) {
            flag = msg.getString("flag");
        }
        if(flag.equals("open")){
            if(!macsession.containsKey(mac)){
                List<WebSocketSession> sessionArrayList = new ArrayList<WebSocketSession>();
                sessionArrayList.add(wss);
                macsession.put(mac,sessionArrayList);
            }else{
                List<WebSocketSession> sessionArrayList = macsession.get(mac);
                sessionArrayList.add(wss);
                macsession.put(mac,sessionArrayList);
            }
        }else if(flag.equals("close")){
            if(macsession.containsKey(mac)){
                List<WebSocketSession> sessionArrayList = macsession.get(mac);
                sessionArrayList.remove(wss);
                if(sessionArrayList.size()==0){
                    macsession.remove(mac);
                }
                macsession.put(mac,sessionArrayList);
            }
        }
        WsMessStore.getInstance().setMacsession(macsession);
    }

    @Override
    public void handleTransportError(WebSocketSession wss, Throwable thrwbl) throws Exception {

    }

    @Override
    public void afterConnectionClosed(WebSocketSession wss, CloseStatus cs) throws Exception {
        String mac=null;
        List<WebSocketSession> webSocketSessionList=null;
        for (String key : macsession.keySet()) {
            List<WebSocketSession> sessions = macsession.get(key);
            if (sessions.contains(wss)) {
                webSocketSessionList=sessions;
                webSocketSessionList.remove(wss);
                mac = key;
            }
        }
        if(webSocketSessionList!=null){
            macsession.put(mac,webSocketSessionList);
        }

    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }
}