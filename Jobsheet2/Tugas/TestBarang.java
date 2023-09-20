package Tugas;

public class TestBarang {
    public static void main(String args[]) {
        Barang brg1 = new Barang();

        brg1.kode = "A102";
        brg1.namaBarang = "Sapu";
        brg1.hargaDasar = 10000;
        brg1.diskon = (float) 0.1;

        brg1.hitungHarga();
        brg1.tampilData();
    }
}
