package entities;

public class User {
  private String username;
  private String password;
  private String role;

  public User(String password, String username, Enum<Roles> role) {
    this.password = password;
    this.username = username;
    this.role = role.toString();
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getRole() {
    return role;
  }
}
