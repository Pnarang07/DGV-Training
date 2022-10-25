package currencyconverter;

import java.util.Scanner;

public class CurrencyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyControler currencycontroler=new CurrencyControler();
		Scanner scanner=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Select Currency From Given List");
			System.out.println("1.Dollar" + " " + "2.Euro" + " " + "3.Yen" + " " + "4.Pound" + " " + "5.Canadian Dollar" + " " +"0.Exit");
			
			choice=scanner.nextInt();	
			
			scanner.nextLine();
			
			switch(choice) {
			case 1:{
				
				currencycontroler.convertDollar();
				break;
			}
			case 2:{
				currencycontroler.convertEuro();
				break;
			}
			case 3:{
				currencycontroler.convertYen();
				break;
			}
			case 4:{
				currencycontroler.convertPound();
				break;
			}
			case 5:{
				currencycontroler.convertCanadianDollar();
				break;
			}
			default :{
				System.out.println("You have exited the game");
				break;
			}
			
			}
			
		}while(choice!=0);

	}

}
