/*
Você está desenvolvendo um novo software para
transmissão digital dos jogos da copa. O software deverá executar em dois
dispositivos diferentes: computador e tablet. A depender do dispositivo
sendo utilizado, o sistema irá utilizar implementações específicas do player
de vídeo, do streamer de obtenção do vídeo através da rede e do componente
de publicação de comentários dos telespectadores. O player de vídeo deve
apresentar os métodos play() e stop(). O streamer possui um único método
receive(). O publicador de comentários possui o método post(). Projete uma
solução, utilizando o Abstract Factory e apresente o código Java completo da
sua solução (exceto implementações dos produtos concretos). Dê um exemplo 
de como o cliente utilizaria a sua solução.
*/

package main;

import computer.*;
import interfaces.*;
import tablet.*;


public class Main {
	
	public void runComputer() {
		DeviceFactory computer = new ComputerDeviceFactory();
		VideoPlayer videoPlayer = computer.createVideoPlayer();
		videoPlayer.play();
		Streamer streamer = computer.createStreamer();
		streamer.receive();
		CommentaryPoster cp = computer.createCommentary();
		cp.post("Did spain already won a world cup?");
		videoPlayer.stop();
	}
	
	public void runTablet() {
		DeviceFactory tablet = new TabletDeviceFactory();
		VideoPlayer videoPlayer = tablet.createVideoPlayer();
		videoPlayer.play();
		Streamer streamer = tablet.createStreamer();
		streamer.receive();
		CommentaryPoster cp = tablet.createCommentary();
		cp.post("Who´s gonna win the world cup?");
		videoPlayer.stop();
	}
	
	public static void main(String args[]) {
		(new Main()).runTablet();
	}

}
