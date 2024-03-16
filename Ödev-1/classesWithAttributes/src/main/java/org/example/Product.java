package org.example;

public class Product
{
    // Constructor = Class'ı new'lediğimiz zaman çalışan bloğu devreye sokmuş oluruz.
    public Product(int _id, String _name , String _description , double _price , int _stockAmount ,  String _renk) {
        System.out.println("Yapıcı blok çalıştı..");
        this._id = _id;
        this._name = _name;
        this._description = _description;
        this._price = _price ;
        this._stockAmount = _stockAmount;
        this._renk = _renk;
    }


    // Field - Attribute
    // Private = Sadece tanımlandığı blokda geçerlidir
    // Public = Herkese açıktır.
    // This = benim içinde bulunduğum class

    private int _id; // ürünü tanımlayan eşsiz değerdir.
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }


    // getter
    public int get_id() {
        return _id;
    }

    // setter
    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int _stockAmount) {
        this._stockAmount = _stockAmount;
    }

    public String get_kod() {
        return _kod;
    }

    public void set_kod(String _kod) {
        this._kod = _kod;
    }
}
