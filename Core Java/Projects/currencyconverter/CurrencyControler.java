package currencyconverter;

import java.util.ArrayList;
import java.util.Scanner;

public class CurrencyControler {
	
	Double amount;
	int choice;
	Scanner scanner=new Scanner(System.in);
	ArrayList<Currency> currency=new ArrayList<>();
	
	public void getData() {
	currency.add(new Currency(new Double[]{82.783921,1.0140994,148.97193,0.88236573,1.0}));
	currency.add(new Currency(new Double[]{81.628587,1.0,146.84648,0.86940761,0.98592666}));
	currency.add(new Currency(new Double[]{0.55588323,0.0068119859,1.0,0.0059275782,0.0067142339}));
	currency.add(new Currency(new Double[]{93.751056,1.1496881,168.70521,1.0,1.1326639}));
	currency.add(new Currency(new Double[]{1.0,0.012249939,1.7985443,0.010670297,0.012076853}));
	}
	public void convertCurrency(int choice,int choice1) {
		
		System.out.println("Please Enter Your Amount");
		amount=scanner.nextDouble();
		
		System.out.println(amount*currency.get(choice).getArray()[choice1]);
		
		}
	
	



public void convertIndia() {
	
System.out.println("1.India To Cad"+" "+"2.India to Dollar"+" "+"3.India To Euro"+" "+"4.India To Yen"+" "+"5.India To Pound");
	
	choice=scanner.nextInt();
	
	switch(choice){
		case 1:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.016594368)+" CAD");
			break;
		}
		case 2:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.012076853)+" USD");
			break;
		}
		case 3:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.012249939)+" EUR");
			break;
		}
		case 4:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*1.7985443)+" JPY");
			break;
		}
		case 5:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.010670297)+" GBP");
			break;
		}
	}
	
}
}
