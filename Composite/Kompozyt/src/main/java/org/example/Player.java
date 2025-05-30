package org.example;

import java.util.List;

public class Player {
    public static void main(String[] args) {
        ChessPiece king = new King();
        ChessPiece queen = new Queen();
        ChessPiece bishop = new Bishop(3);
        ChessPiece knight = new Knight(2);
        ChessPiece tower = new Tower(1);
        ChessPiece pawn1 = new Pawn(6);
        ChessPiece pawn2 = new Pawn(7);
        tower.move(1, 6);
        ChessPiece pawnGroup = new PawnGroup(List.of(pawn1, pawn2));
        pawnGroup.move(6,3);
    }
}