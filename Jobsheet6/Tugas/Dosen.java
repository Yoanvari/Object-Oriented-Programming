package Tugas;

public class Dosen extends Pegawai {
    private int jumlahSKS;
    private int TARIF_SKS = 45000;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        super.gaji = super.getGaji() + (jumlahSKS * TARIF_SKS);
        return super.gaji;
    }
}
