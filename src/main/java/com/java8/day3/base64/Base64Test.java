package com.java8.day3.base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Base64Test {

    public static void main(String[] args) {
        final String text = "My Name is Nitin Mundhe.!!!!";
        System.out.println("Original Text : " + text);
        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println("Encoded Text : " + encoded);
        final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println("Decoded Text : " + decoded);
    }

}
