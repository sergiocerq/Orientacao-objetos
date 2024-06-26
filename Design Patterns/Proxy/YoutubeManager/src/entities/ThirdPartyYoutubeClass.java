package entities;

import interfaces.ThirdPartyYouTubeLib;

import java.util.ArrayList;
import java.util.List;

public class ThirdPartyYoutubeClass implements ThirdPartyYouTubeLib {

    private List<Video> videoList;

    public ThirdPartyYoutubeClass(){
        videoList = new ArrayList<>();
    }

    public void addVideo(Video video){
        videoList.add(video);
    }

    @Override
    public List listVideos() {
        return this.videoList;
    }

    @Override
    public String getVideoInfo(String videoId) {
        Video video = null;
        for (Video v : this.videoList) {
            if (v.getId().equals(videoId)) {
                video = v;
                break;
            }
        }
        return video != null ? video.getDescription() : null;
    }

    @Override
    public Video downloadVideo(String id) {
        for (Video v : this.videoList) {
            if (v.getId().equals(id)) {
                return v;
            }
        }
        return null;
    }

}
