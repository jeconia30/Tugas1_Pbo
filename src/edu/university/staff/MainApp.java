package edu.university.staff;

public class MainApp {
    public static void main(String[] args) {
        Pegawai[] daftarStaff = new Pegawai[3];

        daftarStaff[0] = new Dosen("Dr. Andi", 5000000, 10);
        daftarStaff[1] = new StafAdministrasi("Budi", 3500000, 5);
        daftarStaff[2] = new Dosen("Prof. Siti", 7000000, 12);

        System.out.println("DATA GAJI PEGAWAI UNIVERSITAS");
        System.out.println("------------------------------------");

        for (Pegawai p : daftarStaff) {
            System.out.println("Nama       : " + p.getNama());
            System.out.println("Total Gaji : Rp " + p.hitungGaji());
            System.out.println("------------------------------------");
        }
    }
}
