package com.java8.methodreference;

public class MethRef {
    public MethRef() {
        // TODO Auto-generated constructor stub
    }

    MethRef(int i) {
        System.out.println("Constructor Method :: MethRef is saying " + i);
    }

    public static void saySomething(int i) {
        System.out.println("Static Method :: MethRef is saying " + i);
    }

    public static void saySomethingNew(int i, int b) {
        System.out.println("Say something from MethRef is saying " + i + " " + b);
    }

    public void saySomethingByInstance(int i) {
        System.out.println("Instacne Method :: MethRef is saying " + i);
    }
}
