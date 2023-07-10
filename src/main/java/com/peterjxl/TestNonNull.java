package com.peterjxl;

import lombok.NonNull;

public class TestNonNull {
    public static void main(String[] args) {
        // testNonNull(null);
        testNonNull2(null);
    }

    public static void testNonNull(String name) {
        if(null == name) {
            throw new NullPointerException("name is null");
        }
        System.out.println(name);
    }

    public static void testNonNull2(@NonNull String name) {
        System.out.println(name);
    }
}
