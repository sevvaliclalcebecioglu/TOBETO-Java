package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // overriding => üzerine yazmak


//
//        ÖğretmenKrediManager öğretmenKrediManager = new ÖğretmenKrediManager();
//        System.out.println(öğretmenKrediManager.hesapla(1000));

        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new ÖğretmenKrediManager() , new TarımKrediManager() ,  new ÖğrenciKrediManager()};

        for (BaseKrediManager krediManager : krediManagers){
           System.out.println( krediManager.hesapla(1000));
        }



    }
}