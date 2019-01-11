package com.java8.foreach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ProductFilterTest {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1, "Samsung A5", 17000.00f));
        list.add(new Product(2, "Iphone 6S", 50000.00f));
        list.add(new Product(3, "Redmi 5S", 5000.00f));
        list.add(new Product(4, "Micromax", 2000.00f));
        list.add(new Product(5, "Dell", 12000.00f));
        list.add(new Product(6, "Aus", 15000.00f));

        System.out.println("Filtered Phone Models with price greter than 8000");
        Collections.sort(list, (p1, p2) -> {
            return p1.name.compareToIgnoreCase(p2.name);
        });
        list.forEach((n) -> {
            if (n.price > 8000)
                System.out.println(n);
        });
        System.out.println("Filtered Phone Models with price greter than 8000");
        List<Product> filteredList = new ArrayList<Product>();
        list.forEach((n) -> {
            if (n.price > 8000)
                filteredList.add(n);
        });

        System.out.println();
        System.out.println("Filtered Phone Models with price greter than 8000");
        filteredList.forEach((n) -> System.out.println(n));

        Stream<Product> filteredList2 = list.stream().filter(p -> p.price > 8000);

        System.out.println();
        System.out.println("Filtered Phone Models with price greter than 8000");
        filteredList2.forEach((n) -> System.out.println(n));

    }

}
