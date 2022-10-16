package main;

import java.util.Scanner;

import Second.MultiThreading;
import Second.Shape;
import Second.Square;
import first.Subject;

public class Main {
	
	
//	class ExceptionArray extends Exception{
//		public ExceptionArray(String msg) {
//			super(msg);
//		}
//	}
//	public void Array() throws ExceptionArray {
//		int [] arr=new int[5];
//		Scanner scanner=new Scanner(System.in);
//		for(int i=0;i<5;i++)
//		{
//			arr[i]=scanner.nextInt();
//			if(arr[i]>100)
//			{
//				throw new ExceptionArray("Element is greater than 100");
//			}
//			else {
//				System.out.println("You are all good");
//			}
//		}
//		
//	}
	
	
	
public static void main(String[] args) {
		
		
//		ChildConcepts c=new ChildConcepts();
//		c.doSomething();
//		c.printName();

//	int[] arr= {1,2,3,4,5};
//	Question_1 d=new Question_1();
//	d.addArray(arr);
	//d.add(new int[]{10,20});

//	Address ad=new Address();
//	Person p=new Person();
//	
//	ad.setCity("Shahabad Markanda");
//	ad.setState("Haryana");
//	ad.setPincode(136135);
//	
//	p.setName("Parth Narang");
//	p.setAge(20);
//	p.setAddress(ad);
//	
//	System.out.println(p);t
	
	
//	
//	Subject bt=new Subject("Btech","4y","Difficult");
//	Subject ht=new Subject("Hotel","4y","Difficult");
//	Subject fs=new Subject("fashion","4y","Difficult");
	
	
	
//Student st=new Student("Parth Narang","Cse",20,new Subject[] {bt,ht,fs});
//	
//	st.display();
//	
	
	
//	Subject[] s=new Subject[4];
//	Scanner sc=new Scanner(System.in);
//	for(int i=0;i<4;i++) {
//		String name=sc.nextLine();
//		String duration=sc.nextLine();
//		String level=sc.nextLine();
//		
//		s[i]=new Subject(name,duration,level);
//	}
//	
//	
//	for(int i=0;i<4;i++) {
//		System.out.println(s[i]);
//	}
//	
	
//	Shape s=new Square();
//	s.area();
//	
//	Scanner sc=new Scanner(System.in);
//	
//	int[] arr=new int[5];
//	
//	try {
//		for(int i=0;i<=5;i++) {
//			arr[i]=sc.nextInt();
//		}
//	}
//		catch(Exception e){
//			System.out.println("You are entering more than 5 numbers");
//		}
//	finally {
//		System.out.println("I will always execute");
//	}
//	System.out.println("Program executed");
//	Main m=new Main();
//	try {
//		m.Array();
//	}
//	catch(ExceptionArray msg){
//		System.out.println(msg.getMessage());
//	}
	
	for(int i=1;i<=5;i++) {
		MultiThreading multithreading=new MultiThreading();
		
		try
		{
			multithreading.start();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	}
}

