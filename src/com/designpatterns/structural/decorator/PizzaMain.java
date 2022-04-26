package com.designpatterns.structural.decorator;

public class PizzaMain {
    public static void main(String[] args) {
        CheesePizza cheesePizza = new CheesePizza();
        System.out.println(cheesePizza.getDescription());
        System.out.println(cheesePizza.getPrice());

        CreamCheeseEdge creamCheeseEdge = new CreamCheeseEdge(cheesePizza);
        System.out.println(creamCheeseEdge.getDescription());
        System.out.println(creamCheeseEdge.getPrice());

        WholeWheatDough wholeWheatDough = new WholeWheatDough(creamCheeseEdge);
        System.out.println(wholeWheatDough.getDescription());
        System.out.println(wholeWheatDough.getPrice());

        PepperoniPizza pepperoniPizza = new PepperoniPizza();
        System.out.println(pepperoniPizza.getDescription());
        System.out.println(pepperoniPizza.getPrice());

        wholeWheatDough = new WholeWheatDough(pepperoniPizza);
        System.out.println(wholeWheatDough.getDescription());
        System.out.println(wholeWheatDough.getPrice());
    }
}
