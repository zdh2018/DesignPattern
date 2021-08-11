package AdapterPattern.AdvancedPlayer.AdvancedMediaPlayerImpl;

import AdapterPattern.AdvancedPlayer.AdvancedMediaPlayer;

/**
 * @author zdh
 * @create 2021-08-11 15:02
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}