public class Segitiga extends BangunDatar {
    public float alas, tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float luas() {
        return (tinggi * alas) / 2;
    }

    public float keliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return (float) (alas + tinggi + sisiMiring);
    }

}
