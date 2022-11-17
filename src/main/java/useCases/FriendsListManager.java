package useCases;

import entities.FriendsList;
import entities.Student;

import java.util.ArrayList;

public class FriendsListManager {
    FriendsList friendsList = new FriendsList();
    public void addFriends() {}
    public void removeFriends() {}
    public void blockFriends(ArrayList<Student> blockedListValue, Student studentValue) {
        blockedListValue.add(studentValue);
        friendsList.setBlocked(blockedListValue);
    }
    public void unblockFriends(ArrayList<Student> blockedListValue, Student studentValue) {
        blockedListValue.remove(studentValue);
        friendsList.setBlocked(blockedListValue);
    }
    public void starFriends() {}
    public void unstarFriends() {}
}
