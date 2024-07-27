import composites.File;
import entities.DirectoryComposite;
import entities.FileLeaf;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public void run() {
    File file1 = new FileLeaf(145);
    File file2 = new FileLeaf(784);
    File file3 = new FileLeaf(823);
    File file4 = new FileLeaf(187);
    File file5 = new FileLeaf(756);

    List files = new ArrayList();

    files.add(file1);
    files.add(file2);
    files.add(file3);
    files.add(file4);
    files.add(file5);

    File directory = new DirectoryComposite(files);

    directory.getSize();
  }

  public static void main(String[] args) {
    (new Main()).run();
  }
}