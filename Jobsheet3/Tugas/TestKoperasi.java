package Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman() + "\n");

        int pinjam, ansur, pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.print("Masukkan nominal yang mau anda pinjam: ");
                    pinjam = sc.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("\nPinjaman anda: " + donny.getJumlahPeminjaman());
                    break;

                case 2:
                    System.out.println("-----------------------------");
                    System.out.print("Masukkan nominal yang mau anda bayar: ");
                    ansur = sc.nextInt();
                    donny.angsur(ansur);
                    System.out.println("\nPinjaman anda: " + donny.getJumlahPeminjaman());
                    break;
            }

        } while (pilih == 1 || pilih == 2);
    }

    public static void menu() {
        System.out.println("-----------------------------");
        System.out.println("[1] Peminjaman");
        System.out.println("[2] angsuran");
        System.out.print("Pilih Menu:");
    }
}
