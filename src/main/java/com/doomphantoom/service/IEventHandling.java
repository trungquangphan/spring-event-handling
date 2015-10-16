package com.doomphantoom.service;

import org.springframework.context.ApplicationEvent;

/**
 * Created by doomphantom on 16/10/2015.
 */
public interface IEventHandling {
    public void handleEvent(ApplicationEvent applicationEvent);
}
