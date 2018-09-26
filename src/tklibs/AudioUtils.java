package tklibs;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioUtils {
    /*
    for playing sound effect :vav
    param audioURL
    return
     */
    public static Clip loadSound(String audioURL){
        File soundFile =new File(audioURL);
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            return clip;
        }catch (UnsupportedAudioFileException| IOException| LineUnavailableException e)
        {
            e.printStackTrace();

        }
        return null;

    }
    public static void initialize(){
        new javafx.embed.swing.JFXPanel();}
        /*
        for playing background music , must call initialize first :mp3

         */
        public static MediaPlayer playMedia(String audioUrl){
            String uriString=new File(audioUrl).toURI().toString();
            MediaPlayer mediaPlayer=new MediaPlayer(new Media(uriString));
            mediaPlayer.play();
            return mediaPlayer;
          }

}
