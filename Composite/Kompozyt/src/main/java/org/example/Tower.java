package org.example;

public class Tower implements ChessPiece{
    private int currentColumn;
    private int currentRow;

    public Tower(int currentColumn) {
        this.currentColumn = currentColumn;
        currentRow = 1;
    }

    @Override
    public void move(int column, int row) {
        currentColumn = column;
        currentRow = row;
    }
}
