package com.bridgelabz;

import java.util.Scanner;

public class StockAccount {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StockPortfolio stockPortfolio1 = new StockPortfolio();		
		boolean flag = true;

		do {
			System.out.println("Press 1 to Add Stock Details                        ||   Press 2 to see all Stocks Report");
			System.out.println("Press 3 to see Stock report of a particular stock   ||   Press 4 to see the total value of stocks ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1: {
					stockPortfolio1.addStock();
					break;
				}
				case 2: {
					stockPortfolio1.showAllStockReport();
					break;
				}
				case 3: {
					stockPortfolio1.showSingleStockReport();
					break;
				}
				case 4: {
					stockPortfolio1.showTotalStockValue();
					break;
				}
				default:
					System.out.println("Invalid Input.");
				}
			System.out.println("\n\n");
			
		} while (flag);
	}

}
