package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
	static Scanner sc = new Scanner(System.in);
	
	ArrayList<Stock> stockList = new ArrayList<>();
	
/* adding the stock in arraylist*/	
	public void addStock() {
		Stock stock = new Stock();
		System.out.println("Enter the Name of the stock :");
		stock.setStockName(sc.next());
		System.out.println("Enter the Number of shares of the stock : ");
		stock.setNoOfStock(sc.nextInt());
		System.out.println("Enter the Price of the stock : ");
		stock.setSharePrice(sc.nextDouble());
		double stockValue = stock.getNoOfStock() * stock.getSharePrice();
		stock.setStockValue(stockValue);
		
		stockList.add(stock);
		System.out.println("Stock added successfully.");
		System.out.println("Number of total stock present is : " + totalStockPresent());
	}
	
/* Getting the total number of stock present*/
	int totalStockPresent() {
		int count = 0;
		for (int i = 0; i < stockList.size(); i++) {
			count ++;
		}		
		return count;
	}
	
/* showing all the details of the stock*/
	public void showAllStockReport() {
		if(stockList.size() == 0) {
			System.out.println("There is no stock present at this time. So you should add a stock details first.");
			addStock();
			return;
		}else 
			System.out.println(stockList);
		return;
	}

/* showing(getting) the value of a particular stock */
	public void showSingleStockReport() {
		if(stockList.size() == 0) {
			System.out.println("There is no stock present at this time. So you should add a stock details first.");
			addStock();
			return;
		}else {
			System.out.println("Enter the Name of the stock :");
			String stockName = sc.next();
			boolean flag1 = false; 
			for (int i = 0; i < stockList.size(); i++) {
				if(stockList.get(i).getStockName().equals(stockName)) {
					flag1 = true;
					System.out.println("[stockName=" + stockList.get(i).getStockName() +
										", noOfStock=" + stockList.get(i).getNoOfStock() + 
										", sharePrice=" + stockList.get(i).getSharePrice() +
										", stockValue=" + stockList.get(i).getStockValue() + "]");
					return;
				}
			}
			if(flag1 == false) {
				System.out.println("There is no Stock present with this Name(" + stockName+ "). Please check the stock name and try again.");
				return;
			}			
		}

	}
/* this will show(give) total stock value (wallet value)*/	
	double showTotalStockValue() {
		if(stockList.size() == 0) {
			System.out.println("There is no stock present at this time. So you should add a stock details first.");
			addStock();
			return stockList.get(0).getStockValue();
		}else {
			double totalStockValue = 0;
			for (int i = 0; i < stockList.size(); i++) {
				totalStockValue += stockList.get(i).getStockValue();
				System.out.println("Total value of all the stocks : " + totalStockValue);
			}
			return totalStockValue;
		}
	}
	
	

}
