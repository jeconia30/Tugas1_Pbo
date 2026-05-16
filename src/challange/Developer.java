class Developer extends Karyawan {

    double bonusProyek;

    Developer(String nama, double gajiPokok, double bonusProyek) {
        super(nama, gajiPokok);
        this.bonusProyek = bonusProyek;
    }

    @Override
    double hitungGaji() {
        return gajiPokok + bonusProyek;
    }

    // Overloading
    double hitungGaji(double bonusTambahan) {
        return gajiPokok + bonusProyek + bonusTambahan;
    }
}