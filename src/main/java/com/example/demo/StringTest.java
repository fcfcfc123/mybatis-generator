package com.example.demo;

import java.lang.reflect.Field;

public class StringTest {
    public static void main(String[] args) throws Exception {
        String a = "chenssy";
        System.out.println("a = " + a);
        Field a_ = String.class.getDeclaredField("value");
        a_.setAccessible(true);
        char[] value=(char[])a_.get(a);
        value[4]='_';   //修改a所指向的值
        System.out.println("a = " + a);
    }
}