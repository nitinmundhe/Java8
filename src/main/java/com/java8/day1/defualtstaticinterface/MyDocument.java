package com.java8.day1.defualtstaticinterface;

public class MyDocument implements Openable, Closable {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MyDocument obj = new MyDocument();
        obj.open("Hi");
        obj.close("Bye");
        obj.log("My Logs");
        obj.log2("My Logs");
    }

    @Override
    public void close(String str) {
        System.out.println(str);
    }

    @Override
    public void open(String str) {
        System.out.println(str);
    }

    @Override
    public void open2(String str) {
        System.out.println(str);
    }

    @Override
    public void log(String str) {
        System.out.println("MyDocument logging..." + str);
        Openable.print("abc");
    }

}
