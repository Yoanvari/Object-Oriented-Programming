package Tugas;

public class TestGame {
    public static void main(String args[]) {
        TokoGame tg1 = new TokoGame();

        tg1.id = 102;
        tg1.namaMember = "Yota";
        tg1.namaGame = "Zelda";
        tg1.harga = 10000;
        tg1.sewa = 7;

        tg1.dataPeminjaman();
        System.out.println("Harga peminjaman: " + tg1.hargaBayar());
    }
}
