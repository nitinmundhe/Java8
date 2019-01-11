package com.java8.lambda;

public class LambdaExpressionTest {

    public static void main(String[] args) {

        DrawableImpl obj1 = new DrawableImpl();
        obj1.draw();

        Drawable obj2 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing with Anonyms Inner class.");
            }
        };
        obj2.draw();

        Drawable obj3 = () -> System.out.println("Drawing with Lambda Expression.");
        obj3.draw();

        Runnable r1 = () -> System.out.println("Running thread T1");
        Thread t1 = new Thread(r1);
        t1.start();

    }
}