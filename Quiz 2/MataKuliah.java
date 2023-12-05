public class MataKuliah extends Perwalian {
    // Atribut
    private String nama_matakuliah;
    private int sks;
    private double nilai_mahasiswa;

    // Konstruktor
    public MataKuliah(String nama_matakuliah, int sks, double nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    // Getter
    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    public double getNilai_mahasiswa() {
        return nilai_mahasiswa;
    }

    public int getSks() {
        return sks;
    }

    // Metode hitung bobot mata kuliah
    public double hitung_bobot() {
        return nilai_mahasiswa * sks;
    }

    // Overload metode hitung bobot dengan bobot mahasiswa
    public double hitung_bobot(double bobot_mahasiswa) {
        return nilai_mahasiswa * sks * bobot_mahasiswa;
    }
}