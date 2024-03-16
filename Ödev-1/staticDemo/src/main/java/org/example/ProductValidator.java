package org.example;
// bir ürünü kaydederken , güncellerken kurallara uyup uymadığını bulmak için kullanırız.
public class ProductValidator {
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty() ){   // isEmpty boş demek . ! değilse yapar.
            return true;
        }else {
            return false;
        }
    }
}
