package Second;

public class MultiThreading extends Thread{
	
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
		System.out.println(Thread.currentThread());
		System.out.print(i);
		}
	}
	
	

}
