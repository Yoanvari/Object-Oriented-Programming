import java.util.ArrayList;

public class Perwalian {
    // Atribut
    private ArrayList<Mahasiswa> daftarMahasiswa;
    private ArrayList<MataKuliah> daftarMataKuliah;

    // Konstruktor
    public Perwalian() {
        daftarMahasiswa = new ArrayList<>();
        daftarMataKuliah = new ArrayList<>();
    }

    // Metode tambahkan mahasiswa
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    // Metode tambahkan mata kuliah
    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    // Metode cetak data mahasiswa dan mata kuliah
    public void cetakData() {
        for (Mahasiswa m : daftarMahasiswa) {
            System.out.println("====================================");
            System.out.println("Nama: " + m.getNama());
            System.out.println("NIM: " + m.getNim());
            System.out.println("IPK: " + m.hitung_ipk());
            System.out.println("------------------------------------");
            System.out.println("Mata Kuliah:");
            for (MataKuliah mk : daftarMataKuliah) {
                System.out.println("Nama Mata Kuliah: " + mk.getNama_matakuliah());
                System.out.println("SKS: " + mk.getSks());
                System.out.println("Bobot: " + mk.hitung_bobot());
            }
        }
    }
}
