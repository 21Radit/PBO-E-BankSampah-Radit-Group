public class Transaksi {
    String idTransaksi;
    String tanggal;
    double berat;
    double totalNominal;

    Nasabah nasabah;
    Sampah sampah;

    public Transaksi(String idTransaksi, String tanggal, double berat, Nasabah nasabah, Sampah sampah) {
        this.idTransaksi = idTransaksi;
        this.tanggal = tanggal;
        this.berat = berat;
        this.nasabah = nasabah;
        this.sampah = sampah;
    }

    public void hitungTotal() {
        totalNominal = berat * sampah.hargaPerSatuan;
        nasabah.tambahSaldo(totalNominal);
    }

    public void tampilkanTransaksi() {
        System.out.println("ID Transaksi : " + idTransaksi);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Nasabah      : " + nasabah.nama);
        System.out.println("Jenis Sampah : " + sampah.namaJenis);
        System.out.println("Berat        : " + berat);
        System.out.println("Total        : " + totalNominal);
    }
}
