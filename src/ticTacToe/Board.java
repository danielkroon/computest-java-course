package ticTacToe;

public class Board {
	
	private Piece[][] board;
	
	// create board constructor
	public Board(int column, int row) {
		board = new Piece[column][row];
	}
	
	// getters
	
	// return board as a 2 dimensional array named Piece.
	public Piece[][] getBoard() {
		return board;
	}

}
