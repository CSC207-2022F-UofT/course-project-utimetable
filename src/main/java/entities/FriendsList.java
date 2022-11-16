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

    public void setFriends(ArrayList friends) {
        this.friends = friends;
    }

    public void setBlocked(ArrayList blocked) {
        this.blocked = blocked;
    }
}
