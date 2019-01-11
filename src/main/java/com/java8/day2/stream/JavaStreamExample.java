package com.java8.day2.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamExample {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000.00f));
        productList.add(new Product(2, "Dell Laptop", 30000.00f));
        productList.add(new Product(3, "Lenovo Laptop", 29000.00f));
        productList.add(new Product(4, "Sony Laptop", 28000.00f));
        productList.add(new Product(5, "Apple Laptop", 90000.00f));

        System.out.println(productList);

        //Without Stream
        List<Product> lowPriceProductsList = new ArrayList<Product>();
        for (Product product : productList) {
            if (product.price < 30000f) {
                lowPriceProductsList.add(product);
            }
        }

        System.out.println(lowPriceProductsList);

        Stream<Product> productListNew = productList.stream().filter(product -> product.price < 30000f);
        productListNew.forEach((n) -> System.out.println(n));

        List<Product> lowPriceProductsNew = productList.stream()
                .filter(product -> product.price < 30000f)
                .collect(Collectors.toList());

        System.out.println(lowPriceProductsNew);

        List<Float> lowPricelist = new ArrayList<Float>();
        for (Product product : lowPriceProductsNew) {
            lowPricelist.add(product.price);
        }


        List<Float> lowPricelist1 = productList.stream()
                .filter(product -> product.price < 30000f)
                .map(product -> product.price)
                .sorted()
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(lowPricelist1);

        Float totalPrice = productList.stream()
                .filter(product -> product.price < 30000f)
                .map(product -> product.price)
                .reduce(0.0f, (sum, price) -> sum + price);
        System.out.println(totalPrice);


        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            myList.add(i);
        }
        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> parallelStream = myList.parallelStream();

        Stream<Integer> highNumPara = parallelStream.filter(p -> p > 90);
        highNumPara.forEach(p -> System.out.println("High Num parallel.." + p));

        Stream<Integer> highNumSeq = sequentialStream.filter(p -> p > 90);
        highNumSeq.forEach(p -> System.out.println("High Num Sequential.." + p));

    }

}
