package com.java8.day1.defualtstaticinterface;

//@FunctionalInterface
public interface Openable {
    static void print(String str) {
        System.out.println("Opanable Printing..." + str);
    }

    void open(String str);

    void open2(String str);

    default void log(String str) {
        System.out.println("Opanable logging...");
    }

    default void log2(String str) {
        System.out.println("Opanable logging2...");
    }
}
