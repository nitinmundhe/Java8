package com.java8.foreach;

import java.util.HashMap;
import java.util.Map;
//import java.util.function.BiConsumer;

public class ForeachTest {

    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Nitin");
        hm.put(2, "Amit");
        hm.put(3, "Ashish");
		/*
			BiConsumer<Integer,String> bc =(k,v) -> System.out.println(k+" "+v);
			hm.forEach(bc);
		*/
        hm.forEach((k, v) -> System.out.println(k + " " + v));
    }
}