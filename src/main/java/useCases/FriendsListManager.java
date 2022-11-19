package useCases;

import entities.FriendsList;
import entities.Student;

import java.util.ArrayList;

public class FriendsListManager {
    FriendsList friendsList = new FriendsList();
    public void addFriends(ArrayList<Student> addListValue, Student studentValue) {
        addListValue.add(studentValue);
        friendsList.setFriends(addListValue);
    }
    public void removeFriends(ArrayList<Student> addListValue, Student studentValue) {
        addListValue.remove(studentValue);
        friendsList.setFriends(addListValue);
    }

    public void blockFriends(ArrayList<Student> blockedListValue, Student studentValue) {
        blockedListValue.add(studentValue);
        friendsList.setBlocked(blockedListValue);
    }
    public void unblockFriends(ArrayList<Student> blockedListValue, Student studentValue) {
        blockedListValue.remove(studentValue);
        friendsList.setBlocked(blockedListValue);
    }
    public void starFriends(ArrayList<Student> starredListValue, Student studentValue) {
        starredListValue.add(0, studentValue);
        friendsList.setFriends(starredListValue);
    }
    public void unstarFriends(ArrayList<Student> starredListValue, Student studentValue) {
        starredListValue.remove(studentValue);
        starredListValue.add(studentValue);
        friendsList.setFriends(starredListValue);
    }
}
