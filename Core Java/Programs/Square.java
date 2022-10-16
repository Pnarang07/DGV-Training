package Second;

import java.util.Scanner;

public class Square implements Shape{
	
	
	Scanner scanner=new Scanner(System.in);
	
	@Override
	public void area() {
		// TODO Auto-generated method stub
		
		int side;
		
		side=scanner.nextInt();
		
		
		System.out.println(side*side);
		
		
		
	}

}
