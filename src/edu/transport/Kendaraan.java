package edu.transport;

public abstract class Kendaraan {
    protected String nama;
    protected double kecepatanMaks;

    public Kendaraan(String nama, double kecepatanMaks) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
    }

    // Abstract Method: tidak punya isi, wajib diimplementasikan oleh child class
    public abstract double hitungWaktuTempuh(double jarak);

    public String getNama() {
        return nama;
    }
}
