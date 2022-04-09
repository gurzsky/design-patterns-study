package com.designpatterns.behavioral.observer;

public class NewsletterMain {
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Client client1 = new Client("John", "john@observer", newsletter);
        Client client2 = new Client("Tim", "tim@observer", newsletter);

        Partner partner1 = new Partner("Anna", "anna@observer", newsletter);
        Partner partner2 = new Partner("Nicole", "nicole@observer", newsletter);

        Employee employee1 = new Employee("Edward", "edward@observer", newsletter);
        Employee employee2 = new Employee("Anne", "anne@observer", newsletter);

        newsletter.addMessage("First Message");

        System.out.println("########################");

        newsletter.removeObserver(partner2);

        newsletter.addMessage("Second Message");

        System.out.println("########################");

        newsletter.removeObserver(partner1);
        newsletter.registerObserver(partner2);

        newsletter.addMessage("Third Message");

    }
}
