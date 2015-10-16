package com.doomphantoom.dto;

/**
 * Created by doomphantom on 16/10/2015.
 */
public class Order {
    private String productName;
    private int numOfProduct;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumOfProduct() {
        return numOfProduct;
    }

    public void setNumOfProduct(int numOfProduct) {
        this.numOfProduct = numOfProduct;
    }
}
