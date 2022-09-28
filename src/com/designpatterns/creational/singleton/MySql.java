package com.designpatterns.creational.singleton;

public class MySql {

    private static MySql instance;
    private String host;
    private String user;
    private String password;

    private MySql() {
        this.host = "mysql";
        this.user = "user";
        this.password = "password";
    }

    public static void executeQuery(String query) {
        System.out.println("A query " + query + " foi executada com sucesso!");
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "MySql{" +
                "host='" + host + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static MySql getInstance() {
        if (instance == null) {
            instance = new MySql();
        }
        return instance;
    }
}
