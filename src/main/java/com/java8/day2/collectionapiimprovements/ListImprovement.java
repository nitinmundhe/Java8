package com.java8.day2.collectionapiimprovements;

import java.util.ArrayList;

public class ListImprovement {

    public static void main(String[] args) {
        ArrayList<Float> arr = new ArrayList<Float>();

        arr.add(10.00f);
        arr.add(3f);
        arr.add(20f);
        arr.add(5f);

        //arr.forEach(val->System.out.println("Value := "+val));

        //arr.removeIf(val -> val > 7);
        //arr.forEach(val->System.out.println("Value := "+val));

        arr.sort((a, b) -> a > b ? 1 : -1);
        System.out.println(arr);


    }

}