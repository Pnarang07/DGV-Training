package stockmarket;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner=new Scanner(System.in);
		StockControler stockcontroler=new StockControler();
		stockcontroler.stockArray();
		int choice;
		
		do {
			System.out.println("1. Display Stocks");
			System.out.println("2. Display Performace");
			System.out.println("3. Display Search Stock");
			System.out.println("4. Display Sorted Stocks");
			System.out.println("5. Display ROI");
			
			System.out.println("Enter Your Choice");
			choice=scanner.nextInt();
			scanner.nextLine();
		switch(choice) {
		
		case 1:{
			stockcontroler.displayStock();
			break;
		}
		case 2:{
			stockcontroler.dispalyPerformace();
			break;
		}
		case 3:{
			System.out.println("Enter your stock name");
			String getStock=scanner.nextLine();
			stockcontroler.searchStock(getStock);
			break;
		}
		case 4:{
			stockcontroler.displaySortedStock();
			break;
		}
		case 5:{
			System.out.println("Enter your Stock");
			String roiStock=scanner.nextLine();
			System.out.println("Enter Time Duration");
			int time=scanner.nextInt();
			scanner.nextLine();
			stockcontroler.calculateRoi(roiStock,time);
		}
               default:{
                        System.out.println("You have Exited");
                        }
	}
}
		while(choice!=0);

	}

}
