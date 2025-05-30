package org.example;

public class King implements ChessPiece{
    private int currentColumn;
    private int currentRow;

    public King() {
        currentColumn = 5;
        currentRow = 1;
    }

    @Override
    public void move(int column, int row) {
        currentColumn = column;
        currentRow = row;
    }
}
