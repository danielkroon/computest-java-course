package ticTacToe;

public enum Piece {
	XPIECE("X Piece"),
    OPIECE("O Piece");

    private String namePiece;

    // constructor

    private Piece(String namePiece) {
        this.namePiece = namePiece;
    }

    // getter & setter

    public String getNamePiece() {
        return namePiece;
    }
}
