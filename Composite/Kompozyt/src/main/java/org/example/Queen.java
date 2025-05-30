package org.example;

public class Queen implements ChessPiece{
    private int currentColumn;
    private int currentRow;

    public Queen() {
        currentColumn = 4;
        currentRow = 1;
    }

    @Override
    public void move(int column, int row) {
        currentColumn = column;
        currentRow = row;
    }
}
