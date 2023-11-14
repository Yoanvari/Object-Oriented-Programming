public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------");
        Segitiga segitiga = new Segitiga(5, 4);
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Keliling Segitiga: " + segitiga.keliling());
        System.out.println("-----------------------------");

        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
        System.out.println("-----------------------------");

        Lingkaran lingkaran = new Lingkaran(3);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println("-----------------------------");

    }
}
