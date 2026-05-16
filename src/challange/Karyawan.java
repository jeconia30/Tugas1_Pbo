class Karyawan {
    String nama;
    double gajiPokok;

    Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    double hitungGaji() {
        return gajiPokok;
    }

    double hitungGaji(double bonusTambahan) {
        return gajiPokok + bonusTambahan;
    }
}