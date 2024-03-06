//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Aslı";
        String ogrenci3 = "İclal";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("--------------------------------------------------");

        // yukarıdaki gibi tek tek yazmak zor olacağı için dizileri kullanırım

        String[] ogrenciler = new String[6]; //ne kadar değer vereceğimi buraya yazarım
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Aslı";
        ogrenciler[2] = "İclal";
        ogrenciler[3] = "Rumeysa";
        ogrenciler[4] = "Ebru";
        ogrenciler[5] = "Şevval";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        System.out.println("--------------------------------------------------");

        // yukarıdaki for döngüsünü aşağıdaki gibi de yazabiliriz

        for (String ogrenci : ogrenciler) {  //ogrenciler içerisindeki her bir elemanı gez demektir. ogrenci yazdığım yerde takma isimdir . her hangi bir şey verebilirim . fark etmez .
            System.out.println(ogrenci);

        }


    }
}