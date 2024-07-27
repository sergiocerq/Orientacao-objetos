package entities;

import composites.File;

import java.util.List;

public class DirectoryComposite implements File {

  private List<FileLeaf> files;

  public DirectoryComposite(List<FileLeaf> newFiles) {
    files = newFiles;
  }

  @Override
  public Integer getSize() {
    Integer size = 0;
    for (FileLeaf file : files) {
      size += file.getSize();
    }

    System.out.println("Director Composite Size: " + size);
    return size;
  }
}
