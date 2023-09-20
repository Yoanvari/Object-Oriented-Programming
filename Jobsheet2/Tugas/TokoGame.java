package Tugas;

public class TokoGame {
    String namaMember, namaGame;
    int id, harga, sewa;

    public void dataPeminjaman() {
        System.out.println("ID: " + id);
        System.out.println("Nama member: " + namaMember);
        System.out.println("Nama game: " + namaGame);
        System.out.println("Harga: " + harga);
        System.out.println("Lama sewa: " + sewa + " hari");
    }

    public int hargaBayar() {
        return sewa * harga;
    }
}
