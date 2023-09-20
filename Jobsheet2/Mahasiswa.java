public class Mahasiswa {
    public int nim;
    public String nama, alamat, kelas;

    public Mahasiswa() {

    }

    public Mahasiswa(int nim, String nama, String alamat, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.kelas = kelas;
    }

    public void tampilBiodata() {
        System.out.println("Nim\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Kelas\t: " + kelas);
    }
}