package pl.matrasbartosz.command_pattern.task2.musicplayer.command;

import pl.matrasbartosz.command_pattern.task2.musicplayer.MusicPlayer;

public class PlayNextTrack implements MusicPlayerCommand{

    private final MusicPlayer musicPlayer;

    public PlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
