//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Türkiyedeki bölgeleri ve şehirleri içeren bir örnek

        String[][] sehirler = new String[3][3];
        //satır ve sütunlardan oluşmasını istersem bu şekilde ikişer tane köşeli parantez açarım
        //kaç satırda bunları yazacağımı bulmak içinde iki sayıyı çarparım . 3*3=9

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        //çok boyutlu dizileri tanımlama yöntemim yukarıdaki gibidir

        for (int i = 0; i <= 2; i++) {
            System.out.println("-----------------------------------");  //bölgeleri ayırmak için bu satırı yazdım
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }

        }
    }
}
