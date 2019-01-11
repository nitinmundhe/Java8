package com.java8.day1.defualtstaticinterface;

@FunctionalInterface
public interface Closable {
    void close(String str);

    default void log(String str) {
        System.out.println("closable logging...");
    }
}
