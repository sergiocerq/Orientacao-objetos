package computer;

import interfaces.VideoPlayer;

public class ComputerVideoPlayer implements VideoPlayer {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Starting the computer player...");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stopping the computer player...");
	}

}
