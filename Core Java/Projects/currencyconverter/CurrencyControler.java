package currencyconverter;

import java.util.Scanner;

public class CurrencyControler {
	
	Double amount;
	Scanner scanner=new Scanner(System.in);
	
	public void convertDollar() {
		
		System.out.println("Please Enter Your Amount");
		
		amount=scanner.nextDouble();
		
		System.out.println("Your converted ammount is" + " " + (amount*0.0121)+" USD");
		
		
	}
	
	public void convertEuro() {
		
        System.out.println("Please Enter Your Amount");
		
		amount=scanner.nextDouble();
		
		System.out.println("Your converted ammount is" + " " + (amount*0.01228)+" EUR");
		
	}
	
public void convertYen() {
		
        System.out.println("Please Enter Your Amount");
		
		amount=scanner.nextDouble();
		
		System.out.println("Your converted ammount is" + " " + (amount*1.7891256)+" JPY");
		
	}

public void convertPound() {
	
    System.out.println("Please Enter Your Amount");
	
	amount=scanner.nextDouble();
	
	System.out.println("Your converted ammount is" + " " + (amount*0.010718981)+" GBP");
	
}

public void convertCanadianDollar() {
	
    System.out.println("Please Enter Your Amount");
	
	amount=scanner.nextDouble();
	
	System.out.println("Your converted ammount is" + " " + (amount*0.016530241)+" CAD");
	
}


}
