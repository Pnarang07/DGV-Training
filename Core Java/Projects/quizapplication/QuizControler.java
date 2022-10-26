package quizapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizControler {
	
	Scanner scanner=new Scanner(System.in);
	
	ArrayList<QuizPlayer> playerData=new ArrayList<>();
	ArrayList<Quiz> quizData=new ArrayList<>();
	
	int choice;
	int count;
	int answer=0;
	public void quizArray(){
		
		playerData.add(new QuizPlayer("Sarvesh",65));
		playerData.add(new QuizPlayer("Devansh",55));
		playerData.add(new QuizPlayer("Sujit",30));
		playerData.add(new QuizPlayer("Ayush",15));
		playerData.add(new QuizPlayer("Ramesh",90));
	}
	public void playGame(String Name) {
		
	quizData.add(new Quiz("What is the capital of India?","1.Mumbai?","2.Delhi",2));
	quizData.add(new Quiz("What is Virat's surname?","1.Kholi","2.Sharma",1));
	quizData.add(new Quiz("What is the favourite sport of all indians?","1.Football","2.Cricket",2));
	quizData.add(new Quiz("What is 12 * 12?","1.144","2.136",1));
	quizData.add(new Quiz("What is Parth's Favourite Sport?","1.Cricket","2.Badminton",2));
	quizData.add(new Quiz("What is 50 + 50?","1.100","2.250",1));
	quizData.add(new Quiz("Where is Virat's HomeTown?","1.Delhi","2.Lucknow",1));
	quizData.add(new Quiz("Which Laptop does DGV Tech gives us?","1.Dell","2.HP",2));
	quizData.add(new Quiz("What is Full Form of DGV?","1.DigiVridhi Technologies","2.DedonaArramSe",1));
	quizData.add(new Quiz("Who is Ashneer Grover?","1.Founder of Paytm","2.Founder of BharatPe",2));
	
	for(int i=0;i<10;i++) {
		System.out.println(quizData.get(i).getQuestion());
		System.out.println(quizData.get(i).getOption1());
		System.out.println(quizData.get(i).getOption2());
		answer=scanner.nextInt();
		
		if(answer==quizData.get(i).getAnswer()) {
		count+=10;
		System.out.println("Score : "+count);
	}
	else {
		count-=5;
		System.out.println("Score : "+count);
	}	
}
	playerData.add(new QuizPlayer(Name,count));
}	
	public void seeRankings() {
		
		Collections.sort(playerData,new topFive());
		
		for(int i=0;i<5;i++) {
			System.out.println(playerData.get(i).getName()+" "+playerData.get(i).getScore());
		}
		
	}
}
