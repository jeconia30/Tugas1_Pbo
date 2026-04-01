package edu.transport;

public class MainApp {
    public static void main(String[] args) {
        double jarakTempuh = 120.0; // km

        Kendaraan mobil = new Mobil("Toyota Avanza", 100.0); // Kecepatan Maks 100 km/jam
        Kendaraan motor = new Motor("Honda Vario", 100.0);  // Kecepatan Maks 100 km/jam

        System.out.println("PENGHITUNG WAKTU TEMPUH (Jarak: " + jarakTempuh + " km)");
        System.out.println("-----------------------------------------------------");

        double waktuMobil = mobil.hitungWaktuTempuh(jarakTempuh);
        System.out.printf("Kendaraan: %-15s | Waktu: %.2f Jam\n", mobil.getNama(), waktuMobil);

        double waktuMotor = motor.hitungWaktuTempuh(jarakTempuh);
        System.out.printf("Kendaraan: %-15s | Waktu: %.2f Jam\n", motor.getNama(), waktuMotor);

        System.out.println("-----------------------------------------------------");
    }
}
