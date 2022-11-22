package pages;

import useCases.SignIn;

import java.util.Scanner;

public class SignInPage extends Page{
    private String username;
    private String password;
    private SignIn signIn;
    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }

    public SignInPage(Router router) {
        super(router);
        this.signIn = new SignIn();
    }

    @Override
    public Page run() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter username and password: ");

        String username1 = obj.nextLine();
        String password1 = obj.nextLine();

        if (this.signIn.checkUsername(this.getUsername(), username1)
                && this.signIn.checkPassword(this.getPassword(), password1)) {
            System.out.println("Login Successful!");
            return this.router.getFriendListPage();
        } else if (this.signIn.checkUsername(this.getUsername(), username1)
                && !(this.signIn.checkPassword(this.getPassword(), password1))) {
            System.out.println("Incorrect Password. Please enter again.");
            return this.router.getSignIn();
        } else if (!(this.signIn.checkUsername(this.getUsername(), username1))
                && this.signIn.checkPassword(this.getPassword(), password1)) {
            System.out.println("Incorrect Username. Please enter again.");
            return this.router.getSignIn();
        } else {
            System.out.println("Incorrect Username and Password. Please enter again.");
            return this.router.getSignIn();
        }
    }
}
