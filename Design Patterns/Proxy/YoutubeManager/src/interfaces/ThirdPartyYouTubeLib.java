package interfaces;

import entities.Video;

import java.util.List;

public interface ThirdPartyYouTubeLib {
    List listVideos();
    String getVideoInfo(String videoId);
    Video downloadVideo(String id);
}
