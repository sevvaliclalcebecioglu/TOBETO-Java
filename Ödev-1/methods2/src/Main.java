//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // void : bir şeyi yap!
        // string olan bir değeri void olan bir operasyona atayamam.

        String mesaj = "Bugün hava çok güzel.";
        String yeniMesaj = mesaj.substring(0, 2);      // substring bir değer return eder döndürür.
        System.out.println(yeniMesaj);

        System.out.println("----------------");

        String yeniMesaj2 = sehirVer();
        System.out.println(yeniMesaj2);

        System.out.println("----------------");

        int sayi = topla(15, 35);                    // buraya hangi değerleri verirsem onları toplayıp ekrana yazar.
        System.out.println(sayi);

        System.out.println("----------------");

        int toplam = topla2(3,4,5,5,55,5,566,6,7);                      //istediğim kadar sayı verebilirim.
        System.out.println(toplam);

    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void güncelle() {
        System.out.println("Güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {      // Bu fonksiyon int türünde bir değer döndürür demektir. yukarıda int olarak çağırırım.
        return sayi1 + sayi2;
    }

    public static int topla2(int... sayilar){
        int toplam =0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer() {   // burasıda string bir değer döndürür. yukarıda string olarak çağırırım .
        return "Bolu";
    }
}