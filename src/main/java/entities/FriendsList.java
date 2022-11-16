package entities;

import java.util.ArrayList;

public class FriendsList {
    ArrayList friends;
    ArrayList blocked;

    public ArrayList getFriends() {
        return friends;
    }

    public ArrayList getBlocked() {
        return blocked;
    }

    public void setFriends(ArrayList friendNames) {
        friends = friendNames;
    }

    public void setBlocked(ArrayList blockedNames) {
        blocked = blockedNames;
    }
}
