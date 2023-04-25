package pl.matrasbartosz.command_pattern.task2.musicplayer;

import pl.matrasbartosz.command_pattern.task2.musicplayer.command.MusicPlayerCommand;

public class MusicPlayerRemote {

    private MusicPlayerCommand musicPlayerCommand;

    public void setMusicPlayerCommand(MusicPlayerCommand musicPlayerCommand) {
        this.musicPlayerCommand = musicPlayerCommand;
    }

    public void pressButton() {
        musicPlayerCommand.play();
    }
}
