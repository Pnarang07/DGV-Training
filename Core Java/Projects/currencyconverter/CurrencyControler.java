package currencyconverter;

import java.util.Scanner;

public class CurrencyControler {
	
	Double amount;
	int choice;
	Scanner scanner=new Scanner(System.in);
	
	public void convertDollar() {
		System.out.println("1.Dollar To India"+" "+"2.Dollar to Euro"+" "+"3.Dollar To Yen"+" "+"4.Dollar To Pound"+" "+"5.Dollar To CanadianDollar");
		
		choice=scanner.nextInt();
		
		switch(choice){
			case 1:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*82.783921)+" INR");
				break;
			}
			case 2:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*1.0140994)+" EUR");
				break;
			}
			case 3:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*148.97193)+" JPY");
				break;
			}
			case 4:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*0.88236573)+" GBP");
				break;
			}
			case 5:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*1.3738593)+" CAD");
				break;
			}	
		}	
	}
	
	public void convertEuro() {
		
        System.out.println("1.Euro To India"+" "+"2.Euro to Dollar"+" "+"3.Euro To Yen"+" "+"4.Euro To Pound"+" "+"5.Euro To CanadianDollar");
		
		choice=scanner.nextInt();
		
		switch(choice){
			case 1:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*81.628587)+" INR");
				break;
			}
			case 2:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*0.98592666)+" USD");
				break;
			}
			case 3:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*146.84648 )+" JPY");
				break;
			}
			case 4:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*0.86940761)+" GBP");
				break;
			}
			case 5:{
				System.out.println("Please Enter Your Amount");
				amount=scanner.nextDouble();
				
				System.out.println("Your converted ammount is" + " " + (amount*1.3547207)+" CAD");
				break;
			}			
		}
}
	
public void convertYen() {
	
	System.out.println("1.Yen To India"+" "+"2.Yen to Dollar"+" "+"3.Yen To Euro"+" "+"4.Yen To Pound"+" "+"5.Yen To CanadianDollar");
	
	choice=scanner.nextInt();
	
	switch(choice){
		case 1:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.55588323)+" INR");
			break;
		}
		case 2:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.0067142339)+" USD");
			break;
		}
		case 3:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.0068119859)+" EUR");
			break;
		}
		case 4:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.0059275782)+" GBP");
			break;
		}
		case 5:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.009228034)+" CAD");
			break;
		}
		
		
	}
		
        
	}

public void convertPound() {
	
System.out.println("1.Pound To India"+" "+"2.Pound to Dollar"+" "+"3.Pound To Euro"+" "+"4.Pound To Yen"+" "+"5.Pound To CanadianDollar");
	
	choice=scanner.nextInt();
	
	switch(choice){
		case 1:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*93.751056)+" INR");
			break;
		}
		case 2:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*1.1326639)+" USD");
			break;
		}
		case 3:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*1.1496881)+" EUR");
			break;
		}
		case 4:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*168.70521)+" JPY");
			break;
		}
		case 5:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*1.5566722)+" CAD");
			break;
		}	
	}	
}

public void convertCanadianDollar() {
	
System.out.println("1.Cad To India"+" "+"2.Cad to Dollar"+" "+"3.Cad To Euro"+" "+"4.Cad To Yen"+" "+"5.Cad To Pound");
	
	choice=scanner.nextInt();
	
	switch(choice){
		case 1:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*60.242344)+" INR");
			break;
		}
		case 2:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.72782621)+" USD");
			break;
		}
		case 3:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.73830311)+" EUR");
			break;
		}
		case 4:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*108.39836)+" JPY");
			break;
		}
		case 5:{
			System.out.println("Please Enter Your Amount");
			amount=scanner.nextDouble();
			
			System.out.println("Your converted ammount is" + " " + (amount*0.64235428)+" GBP");
			break;
		}
	}
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
