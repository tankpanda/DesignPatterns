package com.hhd.patterns.observer;

public class Event {
    private String content;
    private Long timestamp;
    private Sender source;

    public Event(String content, Long timestamp, Sender source) {
        this.content = content;
        this.timestamp = timestamp;
        this.source = source;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Sender getSource() {
        return source;
    }

    public void setSource(Sender source) {
        this.source = source;
    }
}
