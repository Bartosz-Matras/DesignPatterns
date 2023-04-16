package pl.matrasbartosz.flyweight_pattern;

import pl.matrasbartosz.flyweight_pattern.chees_pieces.*;

class Main {

    public static void main(String[] args) {
        ChessPiece blackPawn = new BlackPiece("Black Piece", "7", "a");
        ChessPiece whitePawn = new WhitePiece("White Piece", "2", "a");
        ChessPiece blackQueen = new BlackQueen("Black Queen");
        ChessPiece whiteQueen = new WhiteQueen("White Queen");

        System.out.println(blackPawn.getColor() == blackQueen.getColor());
        System.out.println(whitePawn.getColor() == whiteQueen.getColor());
    }

}
