package com.peterjxl;

public class TestToString {
    public static void main(String[] args) {
        User2 user = new User2();
        user.setName("Peter");
        user.setEmail("peterjxl@qq.com");
        user.setPassword("123456");
        System.out.println(user);
    }
}
