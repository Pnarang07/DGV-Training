package quizapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizControler {
	
	Scanner scanner=new Scanner(System.in);
	
//	Quiz quiz=new Quiz();
	
	ArrayList<Quiz> quizData=new ArrayList<>();
	
	int choice;
	int count;
//	String name; 
	
	public void quizArray(){
		
		quizData.add(new Quiz("Sarvesh",65));
		quizData.add(new Quiz("Devansh",55));
		quizData.add(new Quiz("Sujit",30));
		quizData.add(new Quiz("Ayush",15));
		quizData.add(new Quiz("Ramesh",90));
	}
	public void playGame(String Name) {
	
			count=0;
//		System.out.println("Please enter your name");
//		name=scanner.nextLine();

		
		
		System.out.println("Does Parth lives in Navi Mumbai");
		System.out.println("1. True 2. False");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		
		System.out.println("Is Parth a Software Engineer");
		System.out.println("1. True 2. False");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		System.out.println("Does Parth works in DGV Technologies");
		System.out.println("1. True 2. False 3.Don't Know");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		
		System.out.println("Where is Parth's HomeTown");
		System.out.println("1. Shahabad Markanda 2. Navi Mumbai 3. Lucknow 4. Rajpura");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
		case 4:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		
		System.out.println("Who hit the last shot in the match of India Vs Pakistan?");
		System.out.println("1. Virat 2. Ashwin 3. Pandya");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count-=5;
			System.out.println("Score: " + count);
			break;
			
		}
		case 2:{
			
			count+=10;
			System.out.println("Score: " + count);
			break;
			
		}
		case 3:{
			count-=5;
			System.out.println("Score: " + count);
			break;
			
		}
	}
		System.out.println("What is the capital of India");
		System.out.println("1. Delhi 2. Mumbai 3. Kolkata 4. Banglore");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
		case 3:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
		case 4:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		System.out.println("Parth's surname is Narang?");
		System.out.println("1. True 2. False");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		System.out.println("Is Parth a big Foddieee?");
		System.out.println("1. True 2. False");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		System.out.println("Is Parth a loyal person?");
		System.out.println("1. True 2. False");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		System.out.println("Parth's Favourite sport is Badminton?");
		System.out.println("1. True 2. False");
		
		choice=scanner.nextInt();
		
		switch(choice) {
		case 1:{
			count+=10;
			System.out.println("Score: " + count);
			break;
		}
		case 2:{
			count-=5;
			System.out.println("Score: " + count);
			break;
		}
	}
		quizData.add(new Quiz(Name,count));
		
	}
	
	public void seeRankings() {
		
		Collections.sort(quizData,new topFive());
		
		for(int i=0;i<5;i++) {
			System.out.println(quizData.get(i).getName()+" "+quizData.get(i).getScore());
		}
		
	}
}
