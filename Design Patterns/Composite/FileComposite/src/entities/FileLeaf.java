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
}
