package quizapplication;

public class Quiz {
	
	String question;
	String option1;
	String option2;
	int answer;
	
	public Quiz(String question, String option1, String option2,int answer) {
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	}

	public int getAnswer() {
		return answer;
	}
	

}
