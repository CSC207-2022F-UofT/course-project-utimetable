package pages;

public class Router {
    private Login login;
    private SignIn signIn;
    private SignUp signUp;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public SignIn getSignIn() {
        return signIn;
    }

    public void setSignIn(SignIn signIn) {
        this.signIn = signIn;
    }

    public SignUp getSignUp() {
        return signUp;
    }

    public void setSignUp(SignUp signUp) {
        this.signUp = signUp;
    }
}
