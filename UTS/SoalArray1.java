public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = { { 1, 1, 4 }, { 2, 1, 2 }, { 3, 2, 1 } };

        int jumlah = 0; // Variabel untuk menyimpan jumlah elemen array
        int baris = 0; // Variabel untuk indeks baris
        int kolom; // Variabel untuk indeks kolom

        // Perulangan while untuk menjumlahkan elemen array
        while (baris < arrayInt.length) {
            kolom = 0; // Set indeks kolom ke 0 saat awal baris baru
            while (kolom < arrayInt[baris].length) {
                jumlah += arrayInt[baris][kolom];
                kolom++;
            }
            baris++;
        }

        System.out.println("Jumlah elemen array: " + jumlah);
    }
}
