package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // parametreli cunstructor
        Product product = new Product(1 , "Laptop" , "Asus Laptop" , 5000 , 3 , "mavi");

        // parametresiz cunstructor
        /*  product.set_name("Laptop");
        product.set_id(1);
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(3); */ // Constructor kullandığım zaman bu şekilde uzun uzun yazmama gerek yok.


        ProductManeger productManeger = new ProductManeger();
        productManeger.Add(product);
        System.out.println(product.get_kod());

        // Bir class sadece bir iş yapar . Bir metod da sadece bir iş yapar.
    }
}