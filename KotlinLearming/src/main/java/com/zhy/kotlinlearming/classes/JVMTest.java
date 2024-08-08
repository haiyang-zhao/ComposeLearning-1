package com.zhy.kotlinlearming.classes;

import com.zhy.kotlinlearming.User;

public class JVMTest {
    public static void main(String[] args) {
        MyClass.Companion.create();
        MyClass1.Factory.create();


    }


    public String getFullName(User user) {
        if (user == null || user.getFirstName() == null || user.getLastName() == null) {
            return "Unknown";
        }
        return user.getFirstName() + " " + user.getLastName();
    }


}
