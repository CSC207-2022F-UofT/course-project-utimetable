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

    public Timetable getTimetable() {
        // TODO
        // A getter function that returns the user's imported timetable
    }

    public void setTimetable(Timetable timetable) {
        // TODO
        // A setter function that sets an empty timetable
    }

    public Location getLocation() {
        // TODO
        // A getter function that returns the user's current location
    }

    public void setLocation() {
        // TODO
        // A setter function that sets the location of the user
    }
}