import java.util.Scanner;

class Player{



private String name;
private int highscore;
private int birthyear;
private String game;


Scanner sc=new Scanner(System.in);


public void setDetails(){

System.out.println("Enter your Name,Game,HighScore,BirthYear");
name=sc.nextLine();
game=sc.nextLine();
highscore=sc.nextInt();
birthyear=sc.nextInt();
}



public void getDetails(){


System.out.println(name +" "+ game +" "+ highscore + " " + birthyear);



}



public void setGame(String Game){

game=Game;
}



public String getGame(){

return game;

}



}

class Demo4{



public static void main(String[] args){

Scanner scanner=new Scanner(System.in);
Player p=new Player();
p.setDetails();
p.getDetails();

String gg=scanner.nextLine();

p.setGame(gg);
System.out.println(p.getGame());
p.getDetails();

}

}