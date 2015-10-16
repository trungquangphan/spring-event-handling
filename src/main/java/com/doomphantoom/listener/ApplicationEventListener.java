package com.doomphantoom.listener;

import com.doomphantoom.event.ApplicationBaseEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by doomphantom on 16/10/2015.
 */


@Component
public class ApplicationEventListener implements ApplicationListener<ApplicationBaseEvent> {

    @Override
    public void onApplicationEvent(ApplicationBaseEvent baseEvent) {
        System.out.println("Event is received by ApplicationEventListener, class= " + baseEvent.getClass());
    }
}
