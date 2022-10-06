package com.techelevator;


import java.util.Arrays;
import java.util.List;

public class VendingMachineCLI {


	public VendingMachineCLI() {
	}

	public void run() {
		FileReader displayInventory = new FileReader();
		List<Item> items = displayInventory.processFile();

		for(Item item: items) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}
}
