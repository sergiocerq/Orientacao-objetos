package entities;

import composites.File;

import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements File {

  private List<File> files;

  public DirectoryComposite() {
    files = new ArrayList<File>();
  }

  @Override
  public Integer getSize() {
    Integer size = 0;
    for (File file : files) {
      size += file.getSize();
    }

    System.out.println("Director Composite Size: " + size);
    return size;
  }

  @Override
  public void addComponent(File component) {
    this.files.add(component);
  }

  @Override
  public void removeComponent(File component) {
    this.files.remove(component);
  }
}
