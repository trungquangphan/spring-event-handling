package com.doomphantoom.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by doomphantom on 16/10/2015.
 */
public class ApplicationBaseEvent extends ApplicationEvent {
    private Object source;

    public ApplicationBaseEvent(Object source) {
        super(source);
    }

    @Override
    public Object getSource() {
        return source;
    }
}
