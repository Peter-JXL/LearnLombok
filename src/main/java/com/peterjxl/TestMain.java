package com.peterjxl;

public class TestMain {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Peter");

        User2 user2 = new User2();
        user2.setName("Peter2");

        System.out.println(user.getName());
        System.out.println(user2.getName());

    }
}
