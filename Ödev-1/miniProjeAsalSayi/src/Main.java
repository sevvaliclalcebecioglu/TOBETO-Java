//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //bug
        int number = 25; // 25 sayısının asal olup olmadığını bulmaya çalışacağız.
        int remainder = number % 2; // number mod 2 yani 2'ye bölümünden kalan sonucu bana verir.
        //System.out.println(remainder);
        System.out.println("------------------------------------------------");
        boolean isPrime = true;   // sayının peşin peşin asal olduğunu kabul ettim

        // Asal Sayı : 1 ve kendinden başka pozitif tam sayı böleni olmayan sayıya asal sayı denir .

        if (number == 1) {
            System.out.println(number + " :Asal Sayı Değildir!");
            return;              // Bu if bloğum çalışırsa kod'un devam etmemesi için return kullanırım
        }

        if (number < 1) {
            System.out.println("Geçersiz Sayı!");
        }

        for (int i = 2; i < number; i++) {    // 2'den 24'e kadar sayıları kurdum. 25'e tam bölünen var mı diye bakacağım.
            if (number % i == 0) {
                isPrime = false;         // number'ın 2'ye bölümünden kalan sayı 0'a eşit olursa asal sayı değildir.
            }
        }

        if (isPrime) {
            System.out.println(number + " : Asal Sayıdır!");
        } else {
            System.out.println(number + " : Asal Sayı Değildir!");
        }    // eğer true ise if bloğu , false ise else bloğum çalışır.


    }
}
