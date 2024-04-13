import entities.Document;
import entities.PrototypesManager;

import java.util.HashMap;

public class Main {

    public void run() {
        PrototypesManager prototypesManager = PrototypesManager.getInstance();
        HashMap<String, Document> documents = prototypesManager.getDocuments();

        Document pdf = new Document("Documento PDF", ".pdf", "/users/documents");

        prototypesManager.addDocument("PDF", pdf);
        Document novoDocumento = prototypesManager.cloneDocument("PDF");
        novoDocumento.setName("Novo Documento");

        System.out.println(prototypesManager.getDocument("PDF").getName());
        System.out.println(novoDocumento.getName());

    }

    public static void main(String[] args) {
        new Main().run();
    }
}