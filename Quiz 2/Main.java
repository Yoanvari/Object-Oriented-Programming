public class Main {
    public static void main(String[] args) {
        // Buat beberapa objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Yoan", "12345", 90);
        Mahasiswa mhs2 = new Mahasiswa("Vari", "67890", 75);

        // Buat beberapa objek mata kuliah
        MataKuliah mk1 = new MataKuliah("PBO", 4, 85);
        MataKuliah mk2 = new MataKuliah("AI", 3, 90);

        // Simulasikan proses perwalian
        Perwalian perwalian = new Perwalian();
        perwalian.tambahMahasiswa(mhs1);
        perwalian.tambahMahasiswa(mhs2);
        perwalian.tambahMataKuliah(mk1);
        perwalian.tambahMataKuliah(mk2);

        // Cetak hasil perwalian
        perwalian.cetakData();
    }
}
