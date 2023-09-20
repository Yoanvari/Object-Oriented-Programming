package Tugas;

public class Lingkaran {
    public double phi, r;

    public Lingkaran(double phi) {
        this.phi = phi;
    }

    public double hitungLuas() {
        return r * r * phi;
    }

    public double hitungKeliling() {
        return r * 2 * phi;
    }
}
