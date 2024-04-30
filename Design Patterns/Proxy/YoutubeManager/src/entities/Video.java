package entities;

public class Video {

    private String id;
    private String title;
    private String subtitle;
    private String duration;
    private String description;

    public Video(String title, String subtitle, String duration, String id, String description) {
        this.title = title;
        this.subtitle = subtitle;
        this.duration = duration;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getDuration() {
        return duration;
    }

    public String getDescription() {
        return description;
    }
}
