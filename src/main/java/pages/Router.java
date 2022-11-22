package pages;

public class Router {
    private LoginPage login;
    private SignInPage signIn;
    private SignUpPage signUp;

    private FriendListPage friendListPage;

    public FriendListPage getFriendListPage() {
        return friendListPage;
    }

    public void setFriendListPage(FriendListPage friendListPage) {
        this.friendListPage = friendListPage;
    }



    public LoginPage getLogin() {
        return login;
    }

    public void setLogin(LoginPage login) {
        this.login = login;
    }

    public SignInPage getSignIn() {
        return signIn;
    }

    public void setSignIn(SignInPage signIn) {
        this.signIn = signIn;
    }

    public SignUpPage getSignUp() {
        return signUp;
    }

    public void setSignUp(SignUpPage signUp) {
        this.signUp = signUp;
    }
}
