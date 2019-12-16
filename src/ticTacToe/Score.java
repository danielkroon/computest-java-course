package ticTacToe;

public class Score {
	private int currentScore;
	
	
	// create constructor for Score class.
	public Score() {
		currentScore = 0;
	}
	
	// method to add 1 point to the players score.
	public void countScore() {
		currentScore++;
	}

	// getters
	public int getCurrentScore() {
		return currentScore;
	}
}
