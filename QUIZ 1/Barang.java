public class Barang {
    private String nama;
    private int jumlah, harga;

    // Konstruktor
    public Barang(String nama, int jumlah, int harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Metode untuk menghitung nilai total barang
    public double hitungTotal() {
        return jumlah * harga;
    }
}
