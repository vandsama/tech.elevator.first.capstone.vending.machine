package com.techelevator;

import java.math.BigDecimal;

public class Item {

    private String itemName;
    private String itemLocation;
    private BigDecimal itemPrice;
    private String itemType;

    public Item(String itemLocation, String itemName, BigDecimal itemPrice, String itemType) {
        this.itemName = itemName;
        this.itemLocation = itemLocation;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
    }

    public String getItemName() {
        return itemName;
    }


    public String getItemLocation() {
        return itemLocation;
    }


    public BigDecimal getItemPrice() {
        return itemPrice;
    }


    public String getItemType() {
        return itemType;
    }


    public String toString() {

        return String.format("||  %s | %s | %s | %s  ||", this.getItemLocation(), this.getItemName(), this.getItemPrice(), this.getItemType());
    }


}
