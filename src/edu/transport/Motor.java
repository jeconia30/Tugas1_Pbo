package edu.transport;

public class Motor extends Kendaraan {

    public Motor(String nama, double kecepatanMaks) {
        super(nama, kecepatanMaks);
    }

    @Override
    public double hitungWaktuTempuh(double jarak) {
        // Kecepatan efektif = 90% dari kecepatan maksimum
        double kecepatanEfektif = this.kecepatanMaks * 0.9;
        return jarak / kecepatanEfektif;
    }
}
