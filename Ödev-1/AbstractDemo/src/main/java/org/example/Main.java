package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();  // sistemi oracle'a çektim . istersem sql'e de çekebilirim
        customerManager.getCustomers();

    }
}