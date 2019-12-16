package ticTacToe;
import java.util.Scanner;

public class Game {
	
	private View view;
	private Player[] players;
	private Board board;
	private Player currentPlayer;
	
	public Game() {
		// use constructors to create players and a view.
		players = new Player[2];
		board = new Board( 3, 3);
		view = new View();
	}

	
	// create method to fill Player constructor.
	public Player[] setPlayers() {
		
		// spin up a scanner to get input from players.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Player 1, fill in your name:");
		String player1Name = scanner.nextLine();
		
		System.out.println("Player 2, fill in your name:");
		String player2Name = scanner.nextLine();
		
		// close scanner since we don't need it anymore.
		scanner.close();
		
		// fill Players array with new players.
		Player player1 = new Player(player1Name, Piece.XPIECE);
		Player player2 = new Player(player2Name, Piece.OPIECE);
		
		players[0] = player1;
		players[1] = player2;
		
		System.out.println("Thank you! " + players[0].getName() + ", you are Player 1 and your piece is the: " + players[0].getPiece().getNamePiece());
		System.out.println("Thank you! " + players[1].getName() + ", you are Player 2 and your piece is the: " + players[1].getPiece().getNamePiece());
		
		return players;
	}
	

	public void startGame() {
		setPlayers();
		
		// set current player at the start of the game.
		currentPlayer = players[0];
		
		// pass the board and currentplayer into the Draw method so they can be use by the print methods.
		view.Draw(board, currentPlayer);
	}
	
	// set current player by checking the current player and switch between them.
	public void setPlayerTurn() {
		if (currentPlayer == players[0]) {
			currentPlayer = players[1];
		} else {
			currentPlayer = players[0];
		}
	}
	
	// getters
	
	public Player getCurrentPlayer() {
		return currentPlayer;
	}


}
