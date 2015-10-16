package com.doomphantoom.event;

import com.doomphantoom.dto.Refund;

/**
 * Created by Trung on 10/16/2015.
 */
public class RefundEvent extends ApplicationBaseEvent {
    private Refund refund;
    public RefundEvent(Refund source) {
        super(source);
        this.refund=source;
    }

    public Refund getRefund() {
        return refund;
    }

}
