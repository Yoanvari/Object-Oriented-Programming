package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Dosen D1 = new Dosen("22417200 ", "Naoy", "Solo");
        Dosen D2 = new Dosen("22417201", "Udin", "Probolinggo");
        Dosen D3 = new Dosen("22417202", "Aziz", "Pasuruhan");
        D1.setSKS(10);
        D2.setSKS(16);
        D3.setSKS(24);

        DaftarGaji dg = new DaftarGaji(3);

        dg.addPegawai(D1);
        dg.printSemuaGaji();

        dg.addPegawai(D2);
        dg.printSemuaGaji();

        dg.addPegawai(D3);
        dg.printSemuaGaji();

        System.out.println("---------------------------------");
    }
}
