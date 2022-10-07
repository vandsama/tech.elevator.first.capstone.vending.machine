package com.techelevator;


import java.util.Arrays;
import java.util.List;

public class VendingMachineCLI {


	public VendingMachineCLI() {
	}

	public void run() {
		UserInterface ui = new UserInterface();
		ui.mainMenu();

	}

	public static void main(String[] args) {
		VendingMachineCLI cli = new VendingMachineCLI();
		cli.run();
	}
}
