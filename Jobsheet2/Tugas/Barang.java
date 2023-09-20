package Tugas;

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;
    int hargaJual;

    public int hitungHarga() {
        return hargaJual = (int) (hargaDasar - (diskon * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode barang: " + kode);
        System.out.println("Nama barang: " + namaBarang);
        System.out.println("Diskon: " + diskon);
        System.out.println("Harga jual setelah diskon: " + hargaJual);
    }
}
