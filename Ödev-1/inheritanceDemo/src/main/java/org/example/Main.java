package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*ÖğretmenKrediManager öğretmenKrediManager = new ÖğretmenKrediManager();
        öğretmenKrediManager.Hesapla();*/

        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new ÖğretmenKrediManager());

    }
}