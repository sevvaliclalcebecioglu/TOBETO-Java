//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //For
        for (int i = 1; i <= 10; i++) {   //++ bir bir artır demektir
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");  //döngü bitince ekrana yazdırılır

        // 1.kısım = sayacın kaçtan başladığını söyler
        // 2.kısım = şart
        // 3.kısım = sayaçın kaçar kaçar artacağını verdiğimiz kısımdır

        // 3. kısma +=2 yazsaydım ikişer ikişer artacaktı


        //While
        int i = 1;
        while (i <= 10) {  // i küçük 10 olduğu sürece demektir
            System.out.println(i);
            i++; // eğer bunu yazmasaydım sonsuz i yazacaktı . Şimdi ise birer birer artırarak 10'a kadar yazacak
        }
        System.out.println("While Döngüsü Bitti");


        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j += 2;  // ikişer ikişer artacak
        } while (j <= 10);
        System.out.println("Do-While Döngüsü Bitti");

        //While ve Do-While arasındaki fark ; while döngüsünde şart sağlanmazsa döngüye girmez . do-while döngüsünde ise ne olursa olsun kod bir kere çalışır , şarta uymazsada ekrana yazılmaz.

    }
}