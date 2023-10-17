package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;

    public DaftarGaji(int gajiPegawai) {
        this.listPegawai = new Pegawai[gajiPegawai];
    }

    public void addPegawai(Pegawai pegawai) {
        for (int i = 0; i < listPegawai.length; i++) {
            listPegawai[i] = pegawai;
        }
    }

    public void printSemuaGaji() {
        System.out.println("---------------------------------");
        System.out.println("| Nama\t\t| Gaji\t\t|");
        for (int i = 2; i < listPegawai.length; i++) {
            System.out.println(
                    "| " + listPegawai[i].getNama() + "\t\t| " + listPegawai[i].getGaji()
                            + "\t|");
        }
    }
}
