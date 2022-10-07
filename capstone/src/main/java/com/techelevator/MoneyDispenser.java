package com.techelevator;

import javax.annotation.processing.Filer;
import javax.swing.*;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MoneyDispenser {

    BigDecimal balance = BigDecimal.ZERO;
    BigDecimal amountToDeposit;
    BigDecimal amountToCharge;
    BigDecimal changeDue;




    public BigDecimal getBalance() {
        return balance;
    }


    public BigDecimal feedMoney(BigDecimal amountToDeposit) {
        balance.add(amountToDeposit);
        return balance;
    }

    public BigDecimal charge(BigDecimal amountToCharge) {
        changeDue = balance.subtract(amountToCharge);
        return balance;
    }

    public String toString() {
        return String.format("%s", this.getBalance());
    }

//    FileReader priceLocation = new FileReader();
//    Map<String, BigDecimal> priceLocationMap = priceLocation.getLocationPriceMap();
//    amountToCharge = priceLocation.getLocationPriceMap();

}

