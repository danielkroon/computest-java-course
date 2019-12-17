package ticTacToe;

public class View {
	
	
	// public method to call all draw methods so the Game class can use it.
	public void Draw(Board board, Player currentPlayer) {
		printBoard(board);
		printCurrentPlayer(currentPlayer);
	}
	
	// method is called in the Game class and board is passed from there into the method.
	private void printBoard(Board board) {
		System.out.println("----------------------");
		
		// loop over all rows to print |
        for (int row = 0; row < board.getBoard().length; row++) { 
            System.out.print("| ");
            
            // loop over all columns to print |
            for (int column = 0; column < board.getBoard().length; column++) {
                System.out.print(board.getBoard()[row][column] + " | ");
            }
            
            System.out.println();
            System.out.println("----------------------");
        }    
    }
	
	// method is called in the Game class and currentPlayer is passed from there into the method.
	public void printCurrentPlayer(Player currentPlayer) {
		System.out.println("Current player is: " + currentPlayer.getName());
	}
}
