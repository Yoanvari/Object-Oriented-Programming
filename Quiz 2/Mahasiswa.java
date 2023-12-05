public class Mahasiswa extends Perwalian {
    // Atribut
    private String nama;
    private String nim;
    private double nilai;

    // Konstruktor
    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getNilai() {
        return nilai;
    }

    // Metode hitung IPK
    public double hitung_ipk() {
        return nilai * 4 / 100;
    }

    // Overload metode hitung IPK dengan bobot SKS
    public double hitung_ipk(int nilai_sks) {
        return (nilai / nilai_sks) * 4.0;
    }
}