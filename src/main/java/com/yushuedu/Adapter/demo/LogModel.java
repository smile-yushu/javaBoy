package com.yushuedu.Adapter.demo;

public class LogModel {
    private String  logId;
    private String  operateUser;
    private String  time;
    private String  content;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LogModel(String logId, String operateUser, String time, String content) {
        this.logId = logId;
        this.operateUser = operateUser;
        this.time = time;
        this.content = content;
    }
}
