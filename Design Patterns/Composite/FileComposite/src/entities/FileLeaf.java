package entities;

import composites.File;

public class FileLeaf implements File {

  private Integer size;

  public FileLeaf(Integer size) {
    this.size = size;
  }

  @Override
  public Integer getSize() {
    System.out.println("File Leaf Size: " + this.size);
    return this.size;
  }

  @Override
  public void addComponent(File component) {
    throw new UnsupportedOperationException("Cannot add component to a file.");
  }

  @Override
  public void removeComponent(File component) {
    throw new UnsupportedOperationException("Cannot remove a component from a file.");
  }
}
