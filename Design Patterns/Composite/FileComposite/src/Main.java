import composites.File;
import entities.DirectoryComposite;
import entities.FileLeaf;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public void run() {
    File directory = new DirectoryComposite();
    File leaf = new FileLeaf(643);
    directory.addComponent(leaf);

    File directory2 = new DirectoryComposite();
    directory2.addComponent(leaf);
    File leaf2 = new FileLeaf(312);
    directory2.addComponent(leaf2);

    directory.addComponent(directory2);

    directory.getSize();

    leaf.addComponent(leaf2); // -> Unsupported operation.
    leaf.removeComponent(leaf2);// -> Unsupported operation.
  }

  public static void main(String[] args) {
    (new Main()).run();
  }
}