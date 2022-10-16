package Main;
import java.util.Scanner;
public class PlayerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		Scanner scanner =new Scanner(System.in);
		PlayerControler p=new PlayerControler();
		
	
		do 
		{
			System.out.println("Enter Your Choice");
			System.out.println("1. Add Player");
			System.out.println("2. View Players");
			System.out.println("3. Delete Players");
			System.out.println("4. Sort Players");
			System.out.println("5. Update Players");
			System.out.println("0. Exit");
			
			choice=scanner.nextInt();
			
			switch(choice){
			
			case 1:{
				p.addPlayer();
				break;
			}
			case 2:{
				p.viewPlayer();
				break;
			}
			case 3:{
				p.viewPlayer();
				p.deletePlayer();
				p.viewPlayer();
				break;
			}
			case 4:{
				p.sortPlayer();
				break;
			}
			case 5:{
				p.updatePlayer();
				break;
			}
			 default:{
				 System.out.println("You Have Exited The Game ");
				 break;
				
			}
			
			}
			
		}while(choice!=0);

	}

}
