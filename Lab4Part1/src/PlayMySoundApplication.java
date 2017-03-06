import java.applet.Applet;
import java.applet.AudioClip;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import sun.audio.AudioStream;
import sun.audio.AudioPlayer;

public class PlayMySoundApplication {

	public static void main(String[] args) {

		try {
			// Create a file input stream to bring in the sound file
			InputStream inputSoundFile = new FileInputStream("spacemusic.au");

			AudioStream audioStream = new AudioStream(inputSoundFile);

			AudioPlayer.player.start(audioStream);
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}

}