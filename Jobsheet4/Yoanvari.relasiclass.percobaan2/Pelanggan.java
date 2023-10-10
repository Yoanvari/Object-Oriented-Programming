public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    public Pelanggan() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public void setMob(Mobil mobil) {
        this.mobil = mobil;
    }

    public void setSop(Sopir sopir) {
        this.sopir = sopir;
    }

    // getter
    public String getNama() {
        return nama;
    }

    public int getHari() {
        return hari;
    }

    public Mobil getMob() {
        return mobil;
    }

    public Sopir getSop() {
        return sopir;
    }

    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}
