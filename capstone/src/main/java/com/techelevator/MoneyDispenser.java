package com.techelevator;

import java.math.BigDecimal;

public class MoneyDispenser {

    private BigDecimal balance = BigDecimal.ZERO;
    private BigDecimal amountToDeposit;
    BigDecimal amountToCharge;
    BigDecimal changeDue;




    public BigDecimal getBalance() {
        return balance;
    }


    public BigDecimal deposit(BigDecimal amountToDeposit) {
        balance.add(amountToDeposit);
        return balance;
    }

    public BigDecimal charge(BigDecimal amountToCharge) {

        changeDue = balance.subtract(amountToCharge);
        return balance;
    }
}
