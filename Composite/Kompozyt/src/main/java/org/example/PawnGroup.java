package org.example;

import java.util.ArrayList;
import java.util.List;

public class PawnGroup implements ChessPiece{
    List<ChessPiece> chessPieces;

    public PawnGroup(List<ChessPiece> chessPieces) {
        this.chessPieces = chessPieces;
    }

    @Override
    public void move(int column, int row) {
        for(ChessPiece chessPiece : chessPieces) {
            chessPiece.move(column, row);
        }
    }
}
