package cn.zhicheng233.cloudy.event.events;

import cn.zhicheng233.cloudy.event.Event;

public class EventSendChat extends Event {
    private String message;

    public EventSendChat(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
