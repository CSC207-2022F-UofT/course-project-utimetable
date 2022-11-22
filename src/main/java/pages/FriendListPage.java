package pages;

import useCases.FriendsListManager;

import java.util.Map;
import java.util.Scanner;

public class FriendListPage extends Page{

    private FriendsListManager friendsListManager;
    public FriendListPage(Router router) {
        super(router);
        this.friendsListManager = new FriendsListManager();
    }

    @Override
    public Page run() {
        enum Option {
            ADD_FRIEND,
            REMOVE_FRIEND,
            SIGN_OUT
        }
        Map<String, Option> options = Map.of(
                "Add Friend", Option.ADD_FRIEND,
                "Remove Friend", Option.REMOVE_FRIEND,
                "Sign Out", Option.SIGN_OUT
        );
        Option selection = promptInput(options);

        switch (selection) {
            case ADD_FRIEND:

                //this.friendsListManager.addFriends(  );
                return this.router.getFriendListPage();
//            case REMOVE_FRIEND:
            case SIGN_OUT:
                return this.router.getLogin();
        };
    }
}
