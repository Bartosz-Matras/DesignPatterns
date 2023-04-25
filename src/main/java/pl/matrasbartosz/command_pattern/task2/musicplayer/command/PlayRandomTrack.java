package pl.matrasbartosz.command_pattern.task2.musicplayer.command;

import pl.matrasbartosz.command_pattern.task2.musicplayer.MusicPlayer;

import java.security.NoSuchAlgorithmException;

public class PlayRandomTrack implements MusicPlayerCommand {

    private final MusicPlayer musicPlayer;

    public PlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        try {
            musicPlayer.playRandomTrack();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error trying play random truck");
        }
    }
}
