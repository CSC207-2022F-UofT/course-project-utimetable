package useCases;

import database.UserModel;
import entities.User;
import entities.Student;
import entities.Admin;

import java.util.ArrayList;

public class SignUp {
    public boolean checkExistingUsername(ArrayList<UserModel> db, String un) {
        for (int i = 0; i < db.size(); i++) {
            if (db.indexOf(i).getUsername == un) {
                return false;
            }
            return true;
        }
    }
}
