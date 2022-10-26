package quizapplication;

import java.util.Comparator;

public class topFive implements Comparator<QuizPlayer>{

	@Override
	public int compare(QuizPlayer quiz1, QuizPlayer quiz2) {
		// TODO Auto-generated method stub
		return quiz2.getScore()-quiz1.getScore();
	}

}
