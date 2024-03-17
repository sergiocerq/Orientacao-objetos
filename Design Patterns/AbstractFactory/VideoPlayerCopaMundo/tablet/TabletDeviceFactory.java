package tablet;

import interfaces.CommentaryPoster;
import interfaces.DeviceFactory;
import interfaces.Streamer;
import interfaces.VideoPlayer;

public class TabletDeviceFactory implements DeviceFactory {

	@Override
	public VideoPlayer createVideoPlayer() {
		// TODO Auto-generated method stub
		return new TabletVideoPlayer();
	}

	@Override
	public CommentaryPoster createCommentary() {
		// TODO Auto-generated method stub
		return new TabletCommentaryPoster();
	}

	@Override
	public Streamer createStreamer() {
		// TODO Auto-generated method stub
		return new TabletStreamer();
	}

}
