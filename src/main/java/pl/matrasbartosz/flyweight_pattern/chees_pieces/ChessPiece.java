package pl.matrasbartosz.flyweight_pattern.chees_pieces;

public class ChessPiece {

    private final String name;
    private final String numberPosition;
    private final String letterPosition;
    private final Color color;

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
