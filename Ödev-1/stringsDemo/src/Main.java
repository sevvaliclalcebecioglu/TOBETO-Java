//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //string'ler bir karakter dizisidir.
        //Java büyük küçük harfe duyarlı bir dildir

        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("--------------------------------");
        System.out.println("Eleman sayısı : " + mesaj.length()); //mesaj içerisindeki yazının eleman sayısını verir
        System.out.println("--------------------------------");
        System.out.println("5. eleman : " + mesaj.charAt(4));     //mesaj içerisindeki yazının 5.indexinde olan harfi verir
        System.out.println("--------------------------------");
        System.out.println(mesaj.concat(".Yaşasın!"));      //mesaj'ın yanına bu yazıyı ekler
        System.out.println("--------------------------------");
        System.out.println(mesaj.startsWith("B"));              //mesajım "B" ile başlıyorsa true başlamıyorsa false verir
        System.out.println("--------------------------------");
        System.out.println(mesaj.endsWith("B"));                 //mesajım "B" ile bitiyorsa true bitmiyorsa false verir
        System.out.println("--------------------------------");
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);  //0'dan 4'e kadar olan elemanları karakterlere ata demektir. Ve 0'dan itibaren aktar demektir.
        System.out.println(karakterler);
        System.out.println("--------------------------------");
        System.out.println(mesaj.indexOf('a'));                //belirttiğim karakterin mesajın içerisinde nerde olduğunu bulmaya yarar.
        System.out.println("--------------------------------");
        System.out.println(mesaj.lastIndexOf("e"));        //aramaya en sağdan başlar
        System.out.println("--------------------------------");
        System.out.println(mesaj.replace(" ","-"));  //replace ifademizle ilgili metindeki karakterlerimizi değiştirebiliriz. ÖR. ingilizce karakterlerin türkçeye çevrilmesi veya boşlukların arasına bir çizgi bırakmak gibi
        System.out.println("--------------------------------");
        System.out.println(mesaj);                              // Bu mesajı tekrar yazdırdığım zaman yine boşluklu yazar . Yani yukarıdaki kod satırım bana yeni bir metin vermiş oldu .
        System.out.println("--------------------------------");

        String yeniMesaj = mesaj.replace(" ","-");   // Kod devam ederken yeni mesajı da kullanabilmek için değişken atadım . String metni değiştirmez yeni bir metin oluşturur.
        System.out.println(yeniMesaj);
        System.out.println("--------------------------------");

        System.out.println(mesaj.substring(2));             // Bir metnin içerisinden parça almak için kullanılır. Burda 2.indexden itibaren parçala demektir.
        System.out.println("--------------------------------");
        System.out.println(mesaj.substring(2,4));                     // Burasıda 2'den başla 4. indexe kadar parçala demektir.
        System.out.println("--------------------------------");

        for (String kelime : mesaj.split(" "))                  // Bütün kelimeleri boşluklarından ayırarak alt alta yazar.
        {
            System.out.println(kelime);
        }

        System.out.println("--------------------------------");
        System.out.println(mesaj.toLowerCase());                    // Mesajı küçük harfe çevirir.
        System.out.println("--------------------------------");
        System.out.println(mesaj.toUpperCase());                    // Mesajı büyük harfe çevirir.
        System.out.println("--------------------------------");
        System.out.println(mesaj.trim());                           // Metnin başında ve sonunda olan boşlukları kapatır.
        System.out.println("--------------------------------");

    }
}
