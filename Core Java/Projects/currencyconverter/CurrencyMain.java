package currencyconverter;

import java.util.Scanner;

public class CurrencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyControler currencycontroler=new CurrencyControler();
		Scanner scanner=new Scanner(System.in);
		int choice;
		int choice1;
		currencycontroler.getData();
		do {
			System.out.println("Select Currency From Given List");
			System.out.println("1.Dollar" + " " + "2.Euro" + " " + "3.Yen" + " " + "4.Pound" + " " + "5.India" + " "+"0.Exit");
			
			choice=scanner.nextInt();	
			
			System.out.println("Please select currency in which you want to convert");
			System.out.println("1.India" + " " + "2.Euro" + " " + "3.Yen" + " " + "4.Pound" + " " + "5.Dollar" + " "+"0.Exit");
			choice1=scanner.nextInt();
			currencycontroler.convertCurrency(choice-1,choice1-1);
			
		}while(choice!=0);

	}

}
