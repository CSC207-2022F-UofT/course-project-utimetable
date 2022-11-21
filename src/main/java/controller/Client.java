package controller;

import pages.*;

public class Client {
    public static void main(String[] args) {

        Router router = new Router();

        Login login = new Login(router);
        SignIn signIn = new SignIn(router);
        SignUp signUp = new SignUp(router);

        router.setLogin(login);
        router.setSignIn(signIn);
        router.setSignUp(signUp);

        Page current = login;
        while (true) {
            current = current.run();
        }
    }
}
