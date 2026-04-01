package edu.smartdevice;

public class MainApp {
    public static void main(String[] args) {
        SmartWatch myWatch = new SmartWatch();

        System.out.println("--- STATUS AWAL SMARTWATCH ---");
        System.out.println("Baterai : " + myWatch.getBatteryLevel() + "%");
        System.out.println("Koneksi : " + (myWatch.isConnected() ? "Connected" : "Disconnected"));
        System.out.println();

        myWatch.chargeBattery(45); // Cas 45 menit

        myWatch.connectWifi("IndiHome-Fiber");

        System.out.println();
        System.out.println("--- STATUS AKHIR SMARTWATCH ---");
        System.out.println("Baterai : " + myWatch.getBatteryLevel() + "%");
        System.out.println("Koneksi : " + (myWatch.isConnected() ? "Connected ke " + myWatch.getSsid() : "Disconnected"));
    }
}
