package pl.matrasbartosz.proxy_pattern;

public class SavedGameFull implements SavedGame {

    private String name;
    private String gameData;

    public void initialize() {
        this.gameData = loadFromStorage();
    }

    public void loadGame() {
        System.out.println("Game loaded");
    }

    public String loadFromStorage() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
        return "Loaded";
    }

    public String getName() {
        return name;
    }

    public String getGameData() {
        return gameData;
    }
}
