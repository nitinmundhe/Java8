package com.java8.day2.stream;

public class Product //implements Comparator<Product>
{
    public int id;
    public String name;
    public float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
    }
}