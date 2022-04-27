package com.designpatterns.structural.facade;

import com.designpatterns.structural.facade.sales.SalesFacade;

public class OrderMain {

    public static void main(String[] args) {

        Consumer consumer = new Consumer("Eduardo", "1234567890", "eduardo@gmail.com");

        Product product1 = new Product("Pants", "Male Pants", 80.99f);
        Product product2 = new Product("t-shirt", "Black Male t-shirt", 10.50f);
        Product product3 = new Product("Shoes", "Shoes", 100.00f);

        SalesFacade salesFacade = new SalesFacade(consumer);
        salesFacade.addProduct(product1);
        salesFacade.addProduct(product2);
        salesFacade.addProduct(product3);

        salesFacade.debitOrder();
    }
}
