package useCases;

import entities.FriendsList;
import entities.Student;

import java.util.ArrayList;

public class FriendsListManager {
    FriendsList friendsList = new FriendsList();
    public void addFriends(Student student1, Student student2) {
        ArrayList<Student> friends = student1.getFriends();
        friends.add(student2);
        friendsList.setFriends(friends);
    }

    public void removeFriends(Student student1, Student student2) {
        ArrayList<Student> friends = student1.getFriends();
        friends.remove(student2);
        friendsList.setFriends(friends);
    }

    public void blockFriends(Student student1, Student student2) {
        ArrayList<Student> blocked = student1.getBlocked();
        blocked.add(student2);
        friendsList.setBlocked(blocked);
    }

    public void unblockFriends(Student student1, Student student2) {
        ArrayList<Student> blocked = student1.getBlocked();
        blocked.remove(student2);
        friendsList.setBlocked(blocked);
    }

    public void starFriends(Student student1, Student student2) {
        ArrayList<Student> starred = student1.getFriends();
        starred.add(0, student2);
        friendsList.setFriends(starred);
    }

    public void unstarFriends(Student student1, Student student2) {
        ArrayList<Student> starred = student1.getFriends();
        starred.remove(student2);
        starred.add(student2);
        friendsList.setFriends(starred);
    }
}
