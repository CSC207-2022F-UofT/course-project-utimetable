package entities;
import entities.User;

import java.util.ArrayList;

public class Student extends User {
    protected ArrayList<Student> friends;
    protected ArrayList<Student> blocked;
    String username;
    String password;

    @Override
    public String getUsername() { return this.username; }

    @Override
    public String getPassword() { return this.password; }

    public Timetable getTimetable() {
        // TODO
        // A getter function that returns the user's imported timetable
    }

    public Timetable getBlankTimetable() {
        // return blank timetable
    }

    @Override
    public void setUsername(String username) { this.username = username; }
    @Override
    public void setPassword(String password) { this.password = password; }

    public void setTimetable(Timetable timetable) {
        // TODO
        // A setter function that sets an empty timetable
    }

    public void setLocation() {
        // TODO
        // A setter function that sets the location of the user
        // if the given timetable is a blank timetable, return null
        // otherwise, return the location indicated on the timetable
    }

    public ArrayList<Student> getFriends() {
        return friends;
    }

    public ArrayList<Student> getBlocked() {
        return blocked;
    }

    public void setFriends(ArrayList<Student> friends) {
        this.friends = friends;
    }

    public void setBlocked(ArrayList<Student> blocked) {
        this.blocked = blocked;
    }
}