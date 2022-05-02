package com.designpatterns.structural.facade.sales;

import com.designpatterns.structural.facade.Consumer;
import com.designpatterns.structural.facade.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private Consumer consumer;
    private List<Product> products = new ArrayList<>();
    private float price = 0;

    public Order(Consumer consumer) {
        this.consumer = consumer;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        this.price += product.getPrice();
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public float getPrice() {
        return price;
    }
}
