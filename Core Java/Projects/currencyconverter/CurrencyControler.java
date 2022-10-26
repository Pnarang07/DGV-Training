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
}
