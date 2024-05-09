package ru.liga.dcs.lesson05;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User user = new User(Arrays.asList(new User(Collections.emptyList())));

        printAll(user);
    }


    static class User {
        private List<User> followers;

        public List<User> getFollowers() {
            return followers;
        }

        public User(List<User> followers) {
            this.followers = followers;
        }


    }

    private static void printAll(User user) {
        System.out.println(user);
        for (User follower : user.getFollowers()) {
            printAll(follower);
        }
    }
}
