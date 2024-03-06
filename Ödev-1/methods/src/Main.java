//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sayiBulmaca();                          //burada da aşağıda oluşturduğum metodumu çağırdım. eğer çağırmazsak methodumu göremem. çünkü java da önce main metodu çalışır. istediğim kadar çağırabilirim.
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
    }

    // fonksiyon yazarak kodu tekrarlamayı engellemiş oluyoruz .
    //isim verirken ilk kelimemde küçük daha sonrakilerde büyük harfle başlamama ; camel case denir.

    public static void sayiBulmaca() {        //sayı bulmaca diye method oluşturdum
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer(aranacak);
        } else {
            System.out.println("Sayı mevcut değildir");
        }

    }

    public static void mesajVer(int aranacak) {    //parametreli method
        System.out.println("Sayı mevcuttur");
    }
}