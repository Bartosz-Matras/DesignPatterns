package pl.matrasbartosz.command_pattern.task2.musicplayer;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    List<String> tracks = Arrays.asList("Track 1", "Track 2", "Track 3");
    int currentTrackNumber = 0;


    public void playFirstTrack() {
        System.out.println("Playing first track: " + tracks.get(0));
    }

    public void playNextTrack() {
        currentTrackNumber++;
        if (currentTrackNumber > 2){
            currentTrackNumber = 0;
        }
        System.out.println("Playing next track: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack() throws NoSuchAlgorithmException {
        Random random = SecureRandom.getInstanceStrong();
        int randomNumber = random.nextInt(3);
        System.out.println("Playing random track: " + tracks.get(randomNumber));
    }
}
