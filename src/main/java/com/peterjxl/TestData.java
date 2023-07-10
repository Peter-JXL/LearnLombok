package com.peterjxl;

public class TestData {
    public static void main(String[] args) {
        User3 user = new User3();
        user.setName("Peter");
        user.setEmail("peterjxl@qq.com");
        user.setPassword("123456");

        System.out.println(user.getName());
        System.out.println(user);
        System.out.println(user.hashCode());

        User3 user2 = new User3();
        user2.setName("Peter");
        user2.setEmail("peterjxl@qq.com");
        user2.setPassword("123456");
        System.out.println(user.equals(user2));
    }
}
