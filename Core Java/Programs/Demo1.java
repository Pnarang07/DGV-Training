import java.util.Scanner;

class Student{


private int rollno;
private String name;
private int birthyear;

Scanner sc=new Scanner(System.in);


public void getDetails(){

System.out.println("Enter name,rollno,birthyear");
name=sc.nextLine();
rollno=sc.nextInt();
birthyear=sc.nextInt();
}

public void displayDetails(){

System.out.println(name+" "+rollno+" "+(2022-birthyear));

}
}


class Demo1{

public static void main(String[] args){

Student s=new Student();

s.getDetails();
s.displayDetails();
}


}