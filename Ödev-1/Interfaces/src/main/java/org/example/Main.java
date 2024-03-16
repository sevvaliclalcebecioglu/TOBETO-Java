package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // interface'lerde abstractlar gibi new'lenemezler.

        ICustomerDal customerDal = new MySqlCustomerDal(); // ama bu şekilde istediğim class'ı çağırabilirim.

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); // ne gönderirsem o çalışacak.
        customerManager.add();
    }
}