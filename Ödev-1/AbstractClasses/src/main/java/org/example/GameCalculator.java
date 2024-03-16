package org.example;

public abstract class GameCalculator
{
    public abstract void hesapla();  // abstract bir sınıftır. Ve değiştirmek override etmek zorunludur.


    public final void gameOver(){   // bu hiç bir zaman değişmeyecek bir kuraldır.
        System.out.println("Oyun bitti..");
    }
}
