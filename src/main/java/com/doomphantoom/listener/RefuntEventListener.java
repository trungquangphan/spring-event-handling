package com.doomphantoom.listener;

import com.doomphantoom.event.RefundEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Trung on 10/16/2015.
 */
@Component
public class RefuntEventListener implements ApplicationListener<RefundEvent> {
    @Override
    public void onApplicationEvent(RefundEvent refundEvent) {
        System.out.println("RefundEvent is listened. Refund Source:  " + refundEvent.getRefund());
    }
}
