package database;

import entities.Timetable;

import java.util.ArrayList;

public abstract class UserModel {
    private String username;
    private String password;
    private ArrayList<String> friendList;
    private Timetable timetable;
}
