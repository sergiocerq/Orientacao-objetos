package composites;

import java.awt.*;

public interface File {
  Integer getSize();
  void addComponent(File component);
  void removeComponent(File component);
}
