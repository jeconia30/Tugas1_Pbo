public class Main {

    public static void main(String[] args) {

        Karyawan k1 = new Manager("Andi", 10000000, 3000000);
        Karyawan k2 = new Developer("Budi", 8000000, 2000000);

        double totalGaji = 0;

        totalGaji += k1.hitungGaji();
        totalGaji += k2.hitungGaji();

        System.out.println("Gaji Manager: " + k1.hitungGaji());
        System.out.println("Gaji Developer: " + k2.hitungGaji());
        System.out.println("Total Pengeluaran Gaji: " + totalGaji);

        System.out.println("Gaji Manager + bonus tambahan: " + k1.hitungGaji(1000000));
    }
}