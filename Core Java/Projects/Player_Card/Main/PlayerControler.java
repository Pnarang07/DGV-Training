package Main;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;


class SortPlayer implements Comparator<Player>
{
	public int compare(Player p1,Player p2) {
		return p1.getGoals()-p2.getGoals();
	}
}

public class PlayerControler {
	
	Player players[]=new Player[5];
	
	Scanner scanner=new Scanner(System.in);
	
	int counter=0;
	
	public void addPlayer() {
		counter++;
		int index=0;
		for(int i=0;i<5;i++) {
			if(players[i]==null)
			{
				index=i;
				break;
			}
		}
		
		System.out.println("Enter your Name,Club,Country,Goals,Age");
		String Name=scanner.nextLine();
		String Club=scanner.nextLine();
		String Country=scanner.nextLine();
		int Goals=scanner.nextInt();
		int Age=scanner.nextInt();
		scanner.nextLine();
		
		players[index]=new Player(Name,Club,Country,Goals,Age);
	}
	
	public void viewPlayer() {
		for(int i=0;i<5;i++) {
			if(players[1]!=null)
			{
				System.out.println(players[i]);
			}
			else 
			{
				break;
			}
			
		}
	}
	
	public void deletePlayer() {
		counter--;
		System.out.println("Whom you want to Delete");
		int delete=scanner.nextInt();
		
		if(players[delete]==null) {
			System.out.println("You cannot delete the number");
		}
		else if(delete==players.length) {
			players[delete-1]=null;
		}
		else {
		for(int i=delete-1;i<players.length-1;i++) {
			players[i]=players[i+1];
		}
		}
	}
	
	public void sortPlayer() {
		
		Player player2[]=new Player[counter];
		for(int i=0;i<counter;i++) {
			player2[i]=players[i];
		}
		
		Arrays.sort(player2, new SortPlayer());
		for(Player n:player2) {
			System.out.println(n);
		}
	}
	
	public void viewPlayersOps() {
		
		for(int i=0;i<5;i++) {
			
			if(players[i]!=null) {
				System.out.println((i+1)+ " " + players[i].getName());
			}
			else {
				break;
			}
		}
		
	}
	public void updatePlayer() {
		
		this.viewPlayersOps();
		System.out.println("Whom you want to update please enter Number");
		int num=scanner.nextInt();
		
				System.out.println("What you want to update Please Select");
				
				System.out.println("1.Name");
				System.out.println("2.Club");
				System.out.println("3.Country");
				System.out.println("4.Goals");
				System.out.println("5.Age");
				int propertyNumber=scanner.nextInt();
				scanner.nextLine();
				
				switch(propertyNumber) {
				case 1:{
					System.out.println("Please Enter Updated Name");
					
					String updateName=scanner.nextLine();
					players[num-1].setName(updateName);
					break;
					}
				case 2:{
					System.out.println("Please Enter Updated Club");
					
					String updateClub=scanner.nextLine();
					players[num-1].setClub(updateClub);
					break;
					}
				case 3:{
					System.out.println("Please Enter Updated Country");
					
					String updateCountry=scanner.nextLine();
					players[num-1].setCountry(updateCountry);
					break;
					}
				case 4:{
					System.out.println("Please Enter Updated Goals");
					
					int updateGoals=scanner.nextInt();
					players[num-1].setGoals(updateGoals);
					break;
					}
				case 5:{
					System.out.println("Please Enter Updated Age");
					
					int updateAge=scanner.nextInt();
					players[num-1].setAge(updateAge);
					break;
					}
				default:{
					System.out.println("This Property doesnot exist");
					break;
				}
				}
	}

}
