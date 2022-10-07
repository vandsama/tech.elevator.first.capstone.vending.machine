package com.techelevator;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    FileReader displayInventory = new FileReader();
    MoneyDispenser moneyUI = new MoneyDispenser();

    String menu1 = "(1) ";
    String menu2 = "(2) ";
    String menu3 = "(3) ";
    BigDecimal currentMoney = moneyUI.getBalance();



    Scanner userInput = new Scanner(System.in);

    public void mainMenu () {
        System.out.printf("%s Display Vending Machine Items\n%s Purchase\n%s Exit\n\nSelect menu option: \n", menu1,
                menu2, menu3);
        String mainSelection = userInput.nextLine();

        if(mainSelection.equals("1")) {
            displayVendingItems();
        } else if (mainSelection.equals("2")) {
            purchaseMenu();
        }
    }

    public void displayVendingItems() {
        List<Item> items = displayInventory.processFile();
        for(Item item: items) {
            System.out.println(item);
        }
    }

    public void purchaseMenu() {
        System.out.printf("Current Money Provided: $%.2f\n\n%s Feed Money\n%s Select Product\n%s " +
                "FinishTransaction\n\nSelect menu option: \n", currentMoney, menu1, menu2, menu3);

    }

    public void feedMoneyUI() {


    }

    public void selectProduct() {

    }

    public void finishTransaction() {

    }
}
