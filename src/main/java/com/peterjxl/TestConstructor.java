package com.peterjxl;

public class TestConstructor {
    public static void main(String[] args) {
        User2 user = new User2();
        User2 user2 = new User2("Peter", "peterjxl@qq.com", "123456");

        System.out.println(user);
        System.out.println(user2);
    }
}
