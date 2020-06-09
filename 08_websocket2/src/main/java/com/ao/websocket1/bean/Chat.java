package com.ao.websocket1.bean;

public class Chat {
    private  String from;
    private  String content;
    private  String to;


    public Chat(String from, String content, String to) {
        this.from = from;
        this.content = content;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
