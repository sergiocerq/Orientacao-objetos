package entities;

import interfaces.Prototype;

import java.util.HashMap;

public class PrototypesManager {

    private static PrototypesManager instance = null;
    private HashMap<String, Document> documents;

    private PrototypesManager() {
        documents = new HashMap<String, Document>();
    }

    public HashMap<String, Document> getDocuments() {
        return this.documents;
    }

    public static PrototypesManager getInstance() {
        if(instance == null)
            instance = new PrototypesManager();

        return instance;
    }

    public void addDocument(String name, Document document) {
        this.documents.put(name, document);
    }

    public Document cloneDocument(String name) {
        Document document = this.documents.get(name);
        return (Document) document.clone();
    }

    public Document getDocument(String name) {
        Document document = this.documents.get(name);
        if(document == null)
            throw new RuntimeException("Document not found");

        return document;
    }

}
