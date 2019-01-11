package com.java8.day2.collectionapiimprovements;

import java.util.HashMap;
import java.util.Map;

public class MapImprovement {

    public static void main(String[] args) {
        Map<String, Integer> authorBooks = new HashMap<String, Integer>();
        authorBooks.put("ABC", 27);
        authorBooks.put("DEF", 50);
        authorBooks.put("GHI", 17);

        authorBooks.forEach((k, v) -> System.out.println(k + " wrote " + v));
        authorBooks.compute("DEF", (k, v) -> v * 10);
        System.out.println("Updated Map");
        authorBooks.forEach((k, v) -> System.out.println(k + " wrote " + v));

        authorBooks.computeIfAbsent("DE", a -> 90);
        System.out.println("Updated Map");
        authorBooks.forEach((k, v) -> System.out.println(k + " wrote " + v));

    }

}
