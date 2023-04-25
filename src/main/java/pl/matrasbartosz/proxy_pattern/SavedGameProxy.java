package pl.matrasbartosz.proxy_pattern;

public class SavedGameProxy implements SavedGame {

    private String name;
    private SavedGame savedGame;


    @Override
    public void initialize() {
        this.name = "Saved Game - " + System.currentTimeMillis();
    }

    @Override
    public void loadGame() {
        savedGame = new SavedGameFull();
        savedGame.initialize();
        savedGame.loadGame();
    }

    @Override
    public String getName() {
        return this.name;
    }
}
