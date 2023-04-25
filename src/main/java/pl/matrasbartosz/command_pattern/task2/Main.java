package pl.matrasbartosz.command_pattern.task2;

import pl.matrasbartosz.command_pattern.task2.musicplayer.MusicPlayer;
import pl.matrasbartosz.command_pattern.task2.musicplayer.MusicPlayerRemote;
import pl.matrasbartosz.command_pattern.task2.musicplayer.command.PlayFirstTrack;
import pl.matrasbartosz.command_pattern.task2.musicplayer.command.PlayNextTrack;
import pl.matrasbartosz.command_pattern.task2.musicplayer.command.PlayRandomTrack;

class Main {

    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote remote = new MusicPlayerRemote();

        remote.setMusicPlayerCommand(new PlayFirstTrack(musicPlayer));
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayNextTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
        remote.pressButton();

        remote.setMusicPlayerCommand(new PlayRandomTrack(musicPlayer));
        remote.pressButton();
        remote.pressButton();
    }
}
