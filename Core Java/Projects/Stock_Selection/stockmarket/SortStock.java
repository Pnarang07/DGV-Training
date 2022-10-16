package stockmarket;

import java.util.Comparator;

public class SortStock implements Comparator <Stocks>{

	@Override
	public int compare(Stocks stock1, Stocks stock2) {
		// TODO Auto-generated method stub
		return Double.compare(stock1.getPrice(), stock2.getPrice());
	}
	
	

}
