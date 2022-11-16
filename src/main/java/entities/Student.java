package entities;
import entities.User;

public class Student extends User {
    String username;
    String password;

    @Override
    public String getUsername() {
        return this.username;
    }
    @Override
    public String getPassword() {
        return this.password;
    }
    public Timetable getTimetable() {
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
        return this.location;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }
    public void setTimetable() {
        this.timetable = this.getBlankTimetable();
    }
    public void setLocation() {
        if (this.timetable == this.getBlankTimetable()) {
            return null;
        }
        this.location = this.getTimetable().getCourseInfo();
    }
}
