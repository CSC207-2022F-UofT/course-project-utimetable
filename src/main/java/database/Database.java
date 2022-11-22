package database;

import entities.User;
import entities.Student;
import entities.Admin;

import java.util.ArrayList;

class Database {

    private ArrayList<UserModel> database;
    public ArrayList<UserModel> getDatabase() {
        return database;
    }

    public void setDatabase(ArrayList<UserModel> database) {
        this.database = database;
    }

    public void addNewUser(String username, String password) {
        UserModel userModel = null;
        userModel.setUsername(username);
        userModel.setPassword(password);
        this.database.add(userModel);
    }

}