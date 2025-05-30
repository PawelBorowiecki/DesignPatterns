package org.example;

public class Pawn implements ChessPiece{
    private int currentColumn;
    private int currentRow;

    public Pawn(int currentColumn) {
        this.currentColumn = currentColumn;
        currentRow = 2;
    }

    @Override
    public void move(int column, int row) {
        currentColumn = column;
        currentRow = row;
    }
}
