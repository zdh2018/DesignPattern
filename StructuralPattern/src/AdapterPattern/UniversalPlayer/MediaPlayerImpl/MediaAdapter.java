package AdapterPattern.UniversalPlayer.MediaPlayerImpl;

import AdapterPattern.AdvancedPlayer.AdvancedMediaPlayer;
import AdapterPattern.AdvancedPlayer.AdvancedMediaPlayerImpl.Mp4Player;
import AdapterPattern.AdvancedPlayer.AdvancedMediaPlayerImpl.VlcPlayer;
import AdapterPattern.UniversalPlayer.MediaPlayer;

/**
 * @author zdh
 * @create 2021-08-11 15:04
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}