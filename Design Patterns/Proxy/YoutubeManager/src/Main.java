import entities.CachedYoutubeClass;
import entities.ThirdPartyYoutubeClass;
import entities.Video;
import interfaces.ThirdPartyYouTubeLib;

import java.util.List;

public class Main {

    public void run() {

        Video video1 = new Video(
                   "Montando um carro com água",
                "Criando o primeiro carro com água do mundo!",
                "00:30:00",
                     "1",
                "Nesse vídeo vamos aprender a como criar um carro movido a água, rápido e prático.");

        Video video2 = new Video(
                "Viajando para o México",
                "Um pequeno vlog da minha viagem ao México!",
                "01:00:00",
                "2",
                "Nesse vídeo irei mostrar para vocês um pouco sobre a minha viagem para o México e a sua cultura local.");


        ThirdPartyYoutubeClass thirdPartyYoutubeClass = new ThirdPartyYoutubeClass();
        thirdPartyYoutubeClass.addVideo(video1);
        thirdPartyYoutubeClass.addVideo(video2);
        ThirdPartyYouTubeLib thirdPartyYouTubeLib = thirdPartyYoutubeClass;
        thirdPartyYouTubeLib = new CachedYoutubeClass(thirdPartyYouTubeLib);

        System.out.println(thirdPartyYouTubeLib.getVideoInfo("1"));

        List<Video> listaVideos = thirdPartyYouTubeLib.listVideos();

        for(Video v : listaVideos) {
            System.out.println(v.getTitle());
        }

    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}