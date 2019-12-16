package ticTacToe;

public class Player {
	
	private String name;
	private Piece piece;
	private Score score;
	
	
	public Player(String name, Piece piece) {
		this.name = name;
		this.piece = piece;
		
		// set score 
		score = new Score();
	}
	
	// end game
	public void exitGame() {
		System.exit(1);
	}
	
	// getters

	public String getName() {
		return name;
	}


	public Piece getPiece() {
		return piece;
	}

	public Score getScore() {
		return score;
	}
}
