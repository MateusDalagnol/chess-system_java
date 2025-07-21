package src.chess.pieces;

import src.bordgame.Board;
import src.chess.ChessPiece;
import src.chess.Color;

public class Queen extends ChessPiece{

    public Queen(Board board, Color color) {
        super(board, color);

    }

    @Override
    public boolean[][] possibleMoves() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'possibleMoves'");
    }
    
}
