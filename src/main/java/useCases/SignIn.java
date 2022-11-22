package useCases;

import entities.User;
import entities.Student;
import entities.Admin;

public class SignIn {
    public boolean checkUsername(String username1, String username2) {
        return username1 == username2;
    }

    public boolean checkPassword(String password1, String password2) {
        if (password1 == password2) {
            return true;
        } else {
            return false;
        }
    }
}
