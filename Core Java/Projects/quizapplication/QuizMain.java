package quizapplication;

import java.util.Scanner;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		Scanner scanner=new Scanner(System.in);
		
		QuizControler quizcontroler=new QuizControler();
		
		quizcontroler.quizArray();
		
		do {
			System.out.println("1. Play Game" + " " + "2. See Rankings" + " " + "0. Exit");
			
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:{
				System.out.println("Please enter your name");
				String name=scanner.nextLine();
				quizcontroler.playGame(name);
				break;
			}
			case 2:{
				quizcontroler.seeRankings();
				break;
			}
			default :{
				System.out.println("You have exited the Game.");
			}
			}
			
			
		}while(choice!=0);

	}

}
