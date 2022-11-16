package entities;
import entities.User;

public class Student extends User {
    String username;
    String password;

    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
}