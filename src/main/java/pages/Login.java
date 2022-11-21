package pages;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public class Login extends Page{
    public Login(Router router) {
        super(router);
    }
    public Page run() {
        enum Option {
            SIGN_IN,
            SIGN_UP
        }
        Map<String, Option> options = Map.of(
                "Sign In", Option.SIGN_IN,
                "Sign Up", Option.SIGN_UP
        );
        Option selection = promptInput(options);

        return switch (selection) {
            case SIGN_IN -> this.router.signIn();
            case SIGN_UP -> this.router.signUp();
        };
    }
}
