package computer;

import interfaces.CommentaryPoster;
import interfaces.DeviceFactory;
import interfaces.Streamer;
import interfaces.VideoPlayer;

public class ComputerDeviceFactory implements DeviceFactory {

	@Override
	public VideoPlayer createVideoPlayer() {
		// TODO Auto-generated method stub
		return new ComputerVideoPlayer();
	}

	@Override
	public CommentaryPoster createCommentary() {
		// TODO Auto-generated method stub
		return new ComputerCommentaryPoster();
	}

	@Override
	public Streamer createStreamer() {
		// TODO Auto-generated method stub
		return new ComputerStreamer();
	}

}
