package edu.university.main;

import edu.university.model.Mahasiswa;

public class MainApp {
    public static void main(String[] args) {
        // Pembuatan minimal 3 objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("220101", "Budi Santoso", 3.8);
        Mahasiswa mhs2 = new Mahasiswa("220102", "Siti Aminah", 3.2);
        Mahasiswa mhs3 = new Mahasiswa("220103", "Iwan Fals", 2.4);

        Mahasiswa[] daftarMahasiswa = { mhs1, mhs2, mhs3 };

        System.out.println("DAFTAR DATA MAHASISWA:");
        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-5s | %-20s\n", "NIM", "NAMA", "IPK", "KATEGORI");
        System.out.println("------------------------------------------------------------");

        for (Mahasiswa m : daftarMahasiswa) {
            System.out.printf("%-10s | %-20s | %-5.2f | %-20s\n",
                    m.getNim(), m.getNama(), m.getIpk(), m.getKategoriIPK());
        }
        System.out.println("------------------------------------------------------------");
    }
}
