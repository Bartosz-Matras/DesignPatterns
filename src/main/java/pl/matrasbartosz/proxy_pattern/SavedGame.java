package pl.matrasbartosz.proxy_pattern;

public interface SavedGame {
    void initialize();
    void loadGame();
    String getName();
}
