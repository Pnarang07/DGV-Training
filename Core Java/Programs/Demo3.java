import java.util.Scanner;

class Player{

private String Name;
private int HighScore;
private String Team;


public String getName(){
return Name;
}

public void setName(String n){

Name=n;
}

public int getHighScore(){
return HighScore;
}


public void setHighScore(int score){

HighScore=score;
}

public String getTeam(){
return Team;
}

public void setTeam(String t){

Team=t;
}
}


class Demo3{

public static void main(String[] args){

Player p=new Player();

Scanner sc=new Scanner(System.in);

System.out.println("Enter Your Name" +" "+ "Enter Your Team" +" "+"Enter Your High Score");
String na=sc.nextLine();
p.setName(na);
String st=sc.nextLine();
p.setTeam(st);
int hs=sc.nextInt();
p.setHighScore(hs);


System.out.println(p.getName());
System.out.println(p.getHighScore());
System.out.println(p.getTeam());

}

}