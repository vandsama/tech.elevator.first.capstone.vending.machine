package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.*;

public class FileReader {

    List<Item> inventoryList = new ArrayList<>();

    public FileReader() {
    }

    public List<Item> processFile() {

        String path = "vendingmachine.csv";
        File file = new File(path);


        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                String fileLine = fileReader.nextLine();
                String[] attributesArray = fileLine.split("\\|");
                BigDecimal price = new BigDecimal(attributesArray[2]);
                Item item = new Item(attributesArray[0], attributesArray[1], price, attributesArray[3]);
                inventoryList.add(item);
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }

        return inventoryList;
    }

    public Map<Item, Integer> stockMap (List<Item> inventoryList) {
        int initialFullStockAmount = 5;
        Map<Item, Integer> stockAmount = new HashMap<>();
        for (Item item : getInventoryList()) {
            stockAmount.put(item, initialFullStockAmount);
        }
        return stockAmount;
    }

    public Map<String, BigDecimal> getLocationPriceMap (List<Item> inventoryList) {
        String location = "";
        BigDecimal price;
        Map<String, BigDecimal> priceLocationMap = new HashMap<>();
        for (Item item : getInventoryList()) {
             location = item.getItemLocation();
             price = item.getItemPrice();
            priceLocationMap.put(location,price);
        }
        return priceLocationMap;

    }

    public List<Item> getInventoryList() {
        return inventoryList;
    }

    public void printMapDetails() {
        Map<String, BigDecimal> newMap = new HashMap<>();
        newMap = getLocationPriceMap(inventoryList);
        for (Map.Entry<String, BigDecimal> stuff : newMap.entrySet()) {
            System.out.println(stuff.getKey() + " "  + stuff.getValue() + "\n");
        }

    }

}



