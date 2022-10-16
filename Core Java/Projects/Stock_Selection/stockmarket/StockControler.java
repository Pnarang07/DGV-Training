package stockmarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;

public class StockControler {
	
	ArrayList<Stocks> stockData=new ArrayList<Stocks>();
	Scanner scanner=new Scanner(System.in);
	
	
	public void stockArray() {
		stockData.add(new Stocks("PVR","Movie",1692.55,2000,1456.66,new double[] {1334.55,1400.65,1467.77,1578.33,1633.45},12));
		stockData.add(new Stocks("AxisBank","Bank",400,500,293.45,new double[] {311.44,326.55,322,331.44,356.45},11));
		stockData.add(new Stocks("M&M","Motors",1644.55,2000,1456.66,new double[] {1334.55,1400.65,1467.77,1578.33,1633.45},13));
		stockData.add(new Stocks("Wipro","Tech",600,677,588,new double[] {566.66,588.87,579.55,586.55,592.76},14));
		stockData.add(new Stocks("Apple","Phone",2000,2500,1900,new double[] {2133.45,2266.44,2300.77,2387.33,2465.45},23));
	}
	public void displayStock() {
		
		System.out.println("Name    + Category       + Price        +ROI");
		
		for(Stocks stock : stockData) {
		System.out.println(stock.getName()+"     "+stock.getCategory()+"    " +stock.getPrice()+"     "+stock.getRoi());
		System.out.println();
		}
	}
	
	public void dispalyPerformace() {
	
		for(Stocks stock : stockData) {
			System.out.print(stock.getName()+"    ");
			System.out.print(stock.getCategory()+"   ");
			System.out.print(stock.getPrice()+"   ");
			System.out.print(stock.getHigh52()+"   ");
			System.out.print(stock.getLow52()+"   ");
			for(Double last:stock.getLast5()) {
				System.out.print(last+"   ");
				}
			System.out.print(stock.getRoi()+"   ");
			System.out.println();
		
	}
	}
	
	public void searchStock(String getStock) {
		
		Optional<Stocks> stockFound=stockData.stream().filter((s)->{
			return s.getName().equals(getStock);
		}).findFirst();
		
		System.out.print(stockFound.get().getName()+"    ");
		System.out.print(stockFound.get().getCategory()+"   ");
		System.out.print(stockFound.get().getPrice()+"   ");
		System.out.print(stockFound.get().getHigh52()+"   ");
		System.out.print(stockFound.get().getLow52()+"   ");
		for(Double last:stockFound.get().getLast5()) {
			System.out.print(last+"   ");
			}
		System.out.print(stockFound.get().getRoi()+"   ");
		System.out.println();
		
		
	}
	public void displaySortedStock() {
		Collections.sort(stockData, new SortStock());
		this.displayStock();
		
	}
	public void calculateRoi(String roiStock,int time) {
		Optional<Stocks> stockFoundRoi=stockData.stream().filter((s)->{
			return s.getName().equals(roiStock);
		}).findFirst();
		
		System.out.println("Your profit after is :  "+ (stockFoundRoi.get().getPrice())* (stockFoundRoi.get().getRoi()/100)*time);
	}
}

		
