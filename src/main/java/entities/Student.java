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
        return this.timetable;
    }

    public Timetable getBlankTimetable() {
        Timetable blankTimetable = new String[5][12];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                blankTimetable[i][j] = "#";
            }
        }
        return blankTimetable;
    }

    public Location getLocation() {
        // TODO
        // A getter function that returns the user's current location
        return this.location;
    }

    @Override
    public void setUsername(String username) { this.username = username; }
    @Override
    public void setPassword(String password) { this.password = password; }

    public void setTimetable(Timetable timetable) {
        // TODO
        // A setter function that sets an empty timetable
        this.timetable = this.getBlankTimetable();
    }

    public void setLocation() {
        // TODO
        // A setter function that sets the location of the user
        if (this.timetable == this.getBlankTimetable()) {
            this.location = null;
        } else {
            this.location = this.getTimetable().getCourseInfo();
        }
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