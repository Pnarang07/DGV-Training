package tictac;

import java.util.Scanner;

public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicTacControler tictaccontroler=new TicTacControler();
		int choice;
	
		Scanner scanner=new Scanner(System.in);
		
		do{
			
		System.out.println("1.PlayGame"+" "+"2.SeeStreaks"+" "+"0.Exit");
		choice=scanner.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter Player1 name");
			String p1=scanner.nextLine();
			scanner.nextLine();
			System.out.println("Enter Player2 name");
			String p2=scanner.nextLine();
			tictaccontroler.playGame(p1,p2);
			break;
		}
		case 2:{
			tictaccontroler.seeStreaks();
			break;
		}
		default:{
			System.out.println("You have exited the game");
		}
		}
				
		}while(choice!=0);

	}

}
