package test.main;

import junit.framework.TestCase;
import ticTacToe.Score;

public class TestScore extends TestCase {
	
	public void testNewScore() {
		Score score = new Score();
		
		int expected = 0;
		int actual = score.getCurrentScore();
		assertEquals(expected, actual);
	}
	
	public void testCountScore() {
		/* 
		 * Should test score object with add score
		 */
		Score score = new Score();
		
		score.countScore();
		score.countScore();
		score.countScore();
		
		int expected = 3;
		int actual = score.getCurrentScore();
		assertEquals(expected, actual);
		
	}
}
