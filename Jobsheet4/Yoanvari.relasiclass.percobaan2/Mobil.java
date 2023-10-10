public class Mobil {
    private String merk;
    private int biaya;

    public Mobil() {

    }

    // setter
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    // getter
    public String getMerk() {
        return merk;
    }

    public double getBiaya() {
        return biaya;
    }

    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}