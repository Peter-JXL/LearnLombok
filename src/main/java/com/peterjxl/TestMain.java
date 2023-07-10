package com.peterjxl;

public class TestMain {

    public static void main(String[] args) {
        User user = new User();
        user.setName("Peter");
        System.out.println(user.getName());


        User2 user2 = new User2();
        user2.setName("Peter2");
        System.out.println(user2.getName());


        User3 user3 = new User3();
        user3.setName("Peter3");
        System.out.println(user3.getName());

    }
}
