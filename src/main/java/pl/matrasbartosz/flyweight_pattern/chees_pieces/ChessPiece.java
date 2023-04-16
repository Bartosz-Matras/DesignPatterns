package pl.matrasbartosz.flyweight_pattern.chees_pieces;

public class ChessPiece {

    private String name;
    private String numberPosition;
    private String letterPosition;
    private Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color.toLowerCase()) {
            case "black" -> this.color = ColorRepository.getBlack();
            default -> this.color = ColorRepository.getWhite();
        }
    }

    public Color getColor() {
        return color;
    }
}
