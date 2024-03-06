//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // double[] myList = new double[4];  double veri tipinde bir dizi oluşturdum.

        // aynısını şu şekilde de yazabilirim

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double total = 0; //toplamlarını ekrana yazdırmak istediğim için total oluşturdum
        double max = myList[0]; // en büyük sayımı myListdeki 0. index olarak belirledim


        for (double number : myList) { // myList içerisindeki tüm numberları gez demektir
            if (max < number) {
                max = number;        // eğer max değerim numberdaki sayılardan küçük ise o zaman numberdeki en büyük sayıyı max içine at demektir
            }
            total = total + number;  // total 0 ve sırayla number içerisindeki sayıları toplayıp total'in içine atacak
            System.out.println(number);
        }

        System.out.println("-----------------------------------------------");

        System.out.println("Toplam = " + total);

        System.out.println("-----------------------------------------------");

        System.out.println("En Büyük = " + max);

    }
}
