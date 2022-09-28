package com.designpatterns.creational.singleton;

public class Client {

    public static void main(String[] args) {

        MySql bancoMySql1 = MySql.getInstance();

        String query = "SELECT * FROM CLIENTS";

        bancoMySql1.executeQuery(query);

        System.out.println("==== bancoMySql1 ====");
        System.out.println(bancoMySql1);

        MySql bancoMySql2 = MySql.getInstance();

        System.out.println("==== bancoMySql2 ====");
        System.out.println(bancoMySql2);

        System.out.println("==== mudança de usuario em bancoMysql1");
        bancoMySql1.setUser("maria");

        System.out.println("==== bancoMySql1 ====");
        System.out.println(bancoMySql1);

        System.out.println("==== bancoMySql2 ====");
        System.out.println(bancoMySql2);
    }
}
