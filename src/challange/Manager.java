class Manager extends Karyawan {

    double tunjanganJabatan;

    Manager(String nama, double gajiPokok, double tunjanganJabatan) {
        super(nama, gajiPokok);
        this.tunjanganJabatan = tunjanganJabatan;
    }

    @Override
    double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }

    // Overloading juga bisa di subclass
    double hitungGaji(double bonusTambahan) {
        return gajiPokok + tunjanganJabatan + bonusTambahan;
    }
}