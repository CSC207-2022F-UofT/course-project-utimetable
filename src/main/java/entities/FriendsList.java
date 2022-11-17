package entities;

import java.util.ArrayList;

public class FriendsList {
    ArrayList<Student> friends;
    ArrayList<Student> blocked;

    public ArrayList<Student> getFriends() {
        return friends;
    }

    public ArrayList<Student> getBlocked() {
        return blocked;
    }

    public void setFriends(ArrayList<Student> friends) {
        this.friends = friends;
    }

    public void setBlocked(ArrayList<Student> blocked) {
        this.blocked = blocked;
    }
}
