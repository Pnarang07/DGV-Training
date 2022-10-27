package tictac;

import java.util.Scanner;

public class TicTacControler {
	
	int count=1;
	int streak=0;
	Scanner scanner=new Scanner(System.in);
	
	String arr[]=new String[9];
	
	 Player player1=new Player();
	 Player player2=new Player();
	
	public void playGame(String p1,String p2) {
		
		arr=new String[]{"1","2","3","4","5","6","7","8","9"};
		
		player1.setName(p1);
		player2.setName(p2);
		displayGame();
		
	}
	
	public void loopArray() {
		
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=3;i<6;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=6;i<9;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void displayGame() {
		
		loopArray();
		
		do {
			count=1;
			System.out.println();
		System.out.println("Choose number from an array");
		
		int  chooseNumber;
		
		System.out.println("Player 1");
		chooseNumber=scanner.nextInt();
		scanner.nextLine();
		arr[chooseNumber-1]="x";
		
		winGame(chooseNumber-1);
		
		if(count==0) {
			break;
		}
		
		loopArray();
		
		System.out.println("Player 2");
		chooseNumber=scanner.nextInt();
		scanner.nextLine();		
		arr[chooseNumber-1]="0";
		
		loopArray();
		
		winGame(chooseNumber-1);
		
	}while(count!=0);
		
	}
	
	
	public void winGame(int chooseNumber) {
	
			if((arr[0]==arr[1]) && (arr[1]==arr[2]) ||
			   (arr[0]==arr[3]) && (arr[3]==arr[6]) || 
			   (arr[1]==arr[4]) && (arr[4]==arr[7]) ||
			   (arr[3]==arr[4]) && (arr[4]==arr[5]) ||
			   (arr[6]==arr[7]) && (arr[7]==arr[8]) ||
			   (arr[2]==arr[5]) && (arr[5]==arr[8]) ||
			   (arr[0]==arr[4]) && (arr[4]==arr[8]) ||
			   (arr[2]==arr[4]) && (arr[4]==arr[6])) {
				
				if(arr[chooseNumber]=="x") {
					loopArray();
					System.out.println();
					System.out.println("Player1 wins");
					streak++;
					player1.setStreaks(streak);
					
				}
				else {
					loopArray();
					System.out.println();
					System.out.println("Player2 wins");
					streak++;
					player2.setStreaks(streak);
				}
				count=0;
	}
			
}
	
	public void seeStreaks() {
		System.out.println("Streak of Player1");
		System.out.println(player1.getStreaks());
		System.out.println("Streak of Player2");
		System.out.println(player2.getStreaks());
	}

}
