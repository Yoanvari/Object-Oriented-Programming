public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {
        for (int i = 0; i < arrayKursi.length; i++) {
            Kursi kursi = arrayKursi[i];
            if (Integer.parseInt(kursi.getNomor()) == nomor && kursi.getPenumpang() != null) {
                System.out.println(
                        "Maaf, kursi yang anda pesan dengan nomor " + nomor
                                + " sudah dipesan oleh penumpang lain.\n");
                break;
            } else {
                this.arrayKursi[nomor - 1].setPenumpang(penumpang);
                break;
            }
        }
    }

    public Kursi[] getArrayKursi() {
        return arrayKursi;
    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public String info() {
        String info = "";
        info += "Kursi: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
