public class TestMahasiswa {
    public static void main(String args[]) {
        Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa(102, "Naoy", "Jl. Konoha No 2A", "1B");
        Mahasiswa mhs3 = new Mahasiswa(103, "Diki", "Jl. Wakanda No 3B", "1C");
        mhs2.tampilBiodata();
        mhs3.tampilBiodata();
    }
}
