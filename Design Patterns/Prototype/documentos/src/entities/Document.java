package entities;

import interfaces.Prototype;

public class Document implements Prototype {

    private String name;
    private String extension;
    private String path;

    public Document(String name, String extension, String path) {
        this.name = name;
        this.extension = extension;
        this.path = path;
    }

    public Document(Document document) {
        this.name = document.getName();
        this.extension = document.getExtension();
        this.path = document.getPath();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public String getPath() {
        return path;
    }

    @Override
    public Prototype clone() {
        return new Document(this);
    }
}
