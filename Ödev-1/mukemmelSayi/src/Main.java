//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Kendinden başka tüm pozitif bölenlerin sayısı toplamı kendisine eşit olan sayıya mükemmel sayı denir .
        // Mesela 6 --> 1,2,3 ' e bölünür . toplamlarıda 6 yapar .
        // 28 --> 1,2,4,7,14 ' e bölünür . toplamları da 28 yapar.

        int number = 6;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println(number + " : Mükemmel sayıdır!");
        } else {
            System.out.println(number + " : Mükemmel sayı değildir!");
        }


    }
}