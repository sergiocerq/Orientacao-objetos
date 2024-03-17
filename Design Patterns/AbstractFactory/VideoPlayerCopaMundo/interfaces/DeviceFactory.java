package interfaces;

public interface DeviceFactory {
	
	public VideoPlayer createVideoPlayer();
	public CommentaryPoster createCommentary();	
	public Streamer createStreamer();
	
}
