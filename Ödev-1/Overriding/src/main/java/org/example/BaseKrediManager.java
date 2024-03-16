package org.example;

public class BaseKrediManager {
    public double hesapla(double tutar){   // publicden sonra final keywordu eklersek overriding yapamam.
        return tutar * 1.18;

    }
}
