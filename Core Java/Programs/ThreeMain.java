package three;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class ThreeMain {
	
//	interface Demo1{
//		public void doSomething(String str);
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Demo1 d=(p)->{
//			System.out.println(p);
//		};
//		
//		d.doSomething("Hello");
		
//	                ------------------------------------------------------------
		
//		                          Array List
		
//		ArrayList<String> al=new ArrayList<>();
//		
//		al.add("Sarvesh");
//		al.add("Devansh");
//		al.add("Ayush");
//		al.add("Parth Ghungroo");
//		
//		
//		al.remove(2);
		
		
		
//		                StreamApi
		
		
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Sarvesh");
		al.add("Devansh");
		al.add("Ayush");
		al.add("Parth Ghungroo");
		
		
		List<String> r=al.stream().map((name)->{
			return name;
		}).collect(Collectors.toList());
		
		
		r.forEach((name)-> {
			System.out.println(name);
		});
		
		

	}

}
