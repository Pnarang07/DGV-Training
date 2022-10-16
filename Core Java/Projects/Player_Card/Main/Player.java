package Main;

public class Player {
	
	
	private String name;
	private String club;
	private String country;
	private int goals;
	private int age;
	
	
	
	
	
	public String getName() {
		return name;
	}
	
	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}

	public int getGoals() {
		return goals;
	}



	public Player(String name, String club, String country, int goals, int age) {
		this.name = name;
		this.club = club;
		this.country = country;
		this.goals = goals;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Player [name=" + name + ", club=" + club + ", country=" + country + ", goals=" + goals + ", age=" + age
				+ "]";
	}
	
	

}
