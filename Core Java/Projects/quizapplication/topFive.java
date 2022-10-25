package quizapplication;

import java.util.Comparator;

public class topFive implements Comparator<Quiz>{

	@Override
	public int compare(Quiz quiz1, Quiz quiz2) {
		// TODO Auto-generated method stub
		return quiz2.getScore()-quiz1.getScore();
	}

}
