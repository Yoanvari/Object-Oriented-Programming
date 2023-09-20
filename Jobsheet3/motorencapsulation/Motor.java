package motorencapsulation;

public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    private final int kecepatanMaks = 100; // menggunakan private final agar nilainya tidak dapat diubah setelah
                                           // diinisialisasi.

    public void nyalakanMesin() {
        kontakOn = true;
    }

    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < kecepatanMaks) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena sudah sampai batas\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 0) {
                kecepatan -= 5;
            } else {
                System.out.println("Kecepatan tidak bisa berkurang karena kecepatan 0\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }

    public void printStatus() {
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}