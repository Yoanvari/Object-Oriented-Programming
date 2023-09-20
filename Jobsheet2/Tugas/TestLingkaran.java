package Tugas;

public class TestLingkaran {
    public static void main(String args[]) {
        Lingkaran lkr1 = new Lingkaran(3.14);

        lkr1.r = 10;
        System.out.println("Luas lingkaran: " + lkr1.hitungLuas());
        System.out.println("Keliling lingkaran: " + lkr1.hitungKeliling());
    }
}
