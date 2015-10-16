package com.doomphantoom.dto;

/**
 * Created by Trung on 10/16/2015.
 */
public class Refund {
    private String transactionId;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }


    @Override
    public String toString(){
        return this.getTransactionId();
    }
}
