package com.java8.foreach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "Nitin", 100.00f));
        list.add(new Product(2, "Amit", 200.00f));
        list.add(new Product(3, "ashish", 300.00f));

        System.out.println("Sorting on the basis of the name");
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareToIgnoreCase(p2.name);
        });
        list.forEach((n) -> System.out.println(n));

    }
}


