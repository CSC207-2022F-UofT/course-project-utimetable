package pages;

import database.UserModel;
import useCases.SignUp;

import java.util.ArrayList;
import java.util.Scanner;

public class SignUpPage extends Page{
    private ArrayList<UserModel> database;
    private SignUp signUp;

    public ArrayList<UserModel> getDatabase() {
        return database;
    }
    public void setDatabase(ArrayList<UserModel> database) {
        this.database = database;
    }

    public SignUpPage(Router router) {
        super(router);
        this.signUp = new SignUp();
    }

    @Override
    public Page run() {
        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter new username and new password: ");

        String newUsername = obj2.nextLine();
        String newPassword = obj2.nextLine();

        // store new username & password in database
        database.add


        if (this.signUp.checkExistingUsername(this.getDatabase(), newUsername)) {
            System.out.println("Sign up successful!");
            return this.router.getSignIn();
        } else {
            System.out.println("Existing username. Please enter a different username.");
            return this.router.getSignUp();
        }

    }
}
