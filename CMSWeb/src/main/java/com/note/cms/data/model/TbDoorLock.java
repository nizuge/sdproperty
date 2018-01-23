package com.note.cms.data.model;

import java.io.Serializable;
import java.util.Date;

public class TbDoorLock implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.id
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.door_id
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private Integer doorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.ip
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.port
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private Integer port;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.create_time
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.line
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private Integer line;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.time
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private Integer time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_door_lock.name
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_door_lock
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_door_lock
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public TbDoorLock(Integer id, Integer doorId, String ip, Integer port, Date createTime, Integer line, Integer time, String name) {
        this.id = id;
        this.doorId = doorId;
        this.ip = ip;
        this.port = port;
        this.createTime = createTime;
        this.line = line;
        this.time = time;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_door_lock
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public TbDoorLock() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.id
     *
     * @return the value of tb_door_lock.id
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.id
     *
     * @param id the value for tb_door_lock.id
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.door_id
     *
     * @return the value of tb_door_lock.door_id
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public Integer getDoorId() {
        return doorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.door_id
     *
     * @param doorId the value for tb_door_lock.door_id
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.ip
     *
     * @return the value of tb_door_lock.ip
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.ip
     *
     * @param ip the value for tb_door_lock.ip
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.port
     *
     * @return the value of tb_door_lock.port
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.port
     *
     * @param port the value for tb_door_lock.port
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.create_time
     *
     * @return the value of tb_door_lock.create_time
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.create_time
     *
     * @param createTime the value for tb_door_lock.create_time
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.line
     *
     * @return the value of tb_door_lock.line
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public Integer getLine() {
        return line;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.line
     *
     * @param line the value for tb_door_lock.line
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.time
     *
     * @return the value of tb_door_lock.time
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public Integer getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.time
     *
     * @param time the value for tb_door_lock.time
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_door_lock.name
     *
     * @return the value of tb_door_lock.name
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_door_lock.name
     *
     * @param name the value for tb_door_lock.name
     *
     * @mbg.generated Tue Aug 08 16:45:17 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}