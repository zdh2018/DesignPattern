package AdapterPattern.AdvancedPlayer.AdvancedMediaPlayerImpl;

import AdapterPattern.AdvancedPlayer.AdvancedMediaPlayer;

/**
 * @author zdh
 * @create 2021-08-11 15:02
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}