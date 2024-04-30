package entities;

import interfaces.ThirdPartyYouTubeLib;

import java.util.List;

public class CachedYoutubeClass implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib myLib;
    private String videoCache;
    private List<Video> listCache = null;

    public CachedYoutubeClass(ThirdPartyYouTubeLib newLib) {
        myLib = newLib;
    }

    @Override
    public List listVideos() {
        if(listCache == null || listCache.size() == 0) {
            listCache = myLib.listVideos();
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(String videoId) {
        if(listCache == null || listCache.size() == 0) {
            videoCache = myLib.getVideoInfo(videoId);
        }
        return videoCache;
    }

    @Override
    public Video downloadVideo(String id) {
        if(listCache == null || listCache.size() == 0) {
            listCache = myLib.listVideos();
        }

        for(Video v : listCache) {
            if(v.getId().equals(id)) {
                return v;
            }
        }

        return myLib.downloadVideo(id);
    }
}
