public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        Mahasiswa msh = new Mahasiswa("2241720096", "Muhammad Yoanvari Al Farizi", "Jl. Simpang Remujung", 'L');
    }
}
