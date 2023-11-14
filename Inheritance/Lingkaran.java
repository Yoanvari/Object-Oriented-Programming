public class Lingkaran extends BangunDatar {
    public float r;
    final double phi = 3.14;

    Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return (float) (phi * r * r);
    }

    public float keliling() {
        return (float) (2 * phi * r);
    }
}
