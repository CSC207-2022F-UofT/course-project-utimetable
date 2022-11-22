package database;

import entities.Student;
import entities.Timetable;
import entities.User;

import java.util.ArrayList;

public abstract class UserModel {

    public String username;

    public String password;

    public ArrayList<Student> friends;
    public ArrayList<Student> blocked;

    public Timetable timetable;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Student> getFriendsList() {
        return friends;
    }

    public ArrayList<Student> getBlockedList() {
        return blocked;
    }
    public Timetable getTimetable() {
        return timetable;
    }

}
