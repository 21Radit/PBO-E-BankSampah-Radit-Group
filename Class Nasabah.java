public class Nasabah {
    String idNasabah;
    String nama;
    String alamat;
    double saldoTerkumpul;

    public Nasabah(String idNasabah, String nama, String alamat) {
        this.idNasabah = idNasabah;
        this.nama = nama;
        this.alamat = alamat;
        this.saldoTerkumpul = 0;
    }

    public void tambahSaldo(double jumlah) {
        saldoTerkumpul += jumlah;
    }

    public void tampilkanProfil() {
        System.out.println("ID Nasabah : " + idNasabah);
        System.out.println("Nama       : " + nama);
        System.out.println("Alamat     : " + alamat);
        System.out.println("Saldo      : " + saldoTerkumpul);
    }
}
