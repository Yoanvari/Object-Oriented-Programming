# Laporan UTS

# Data Mahasiswa

Nama : Muhammad Yoanvari Al Farizi

NIM : 2241720096

Kelas : TI_2C

# Soal 1: Penulisan Class

Berdasarkan contoh class ClassA di bawah ini, jelaskan apakah penulisan source code pada contoh class tersebut sudah benar. Jika tidak, apa yang perlu diperbaiki?

```java
public class ClassA {
    float f1 = 0.15f;

    float hitung() {
        float x = 2f * f1;
    }
}
```

**Jawaban**
Method hitung() belum benar, dikarenakan bahwa method tersebut belum ada pengembalian sebuah nilai berupa tipe data float.

```java
public class ClassA {
    float f1 = 0.15f;

    float hitung() {
        float x = 2f * f1;
        return x;
    }
}
```

# Soal 2: Perhitungan Jumlah Elemen Array 2 Dimensi

Pada class SoalArray1, terdapat array 2 dimensi dengan ukuran 3x3. Tuliskan code Java untuk menghitung jumlah total elemen array tersebut dengan menggunakan perulangan.

```java
Public class SoalArray1 {
    public static void main(String[] args) {
        int[][] arrayInt = {{1, 1, 4}, {2, 1, 2}, {3, 2, 1}};
        // hitung jumlah elemen array 2 dimensi
        // gunakan perulangan
    }
}
```

**Jawaban**

```java
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
```

# Soal 3: Pewarisan Atribut dan Method

Pada source code yang diberikan, class ClassY merupakan turunan dari class Class. Sebutkan atribut dan method apa saja yang diwarisi oleh ClassY dari kelas induknya (class Class). Jelaskan juga apa output dari code yang ditulis pada class ClassY dan bagaimana nilai tersebut diperoleh.

```java
public class Class {
    int a = 2;
    int x = 0;

    int hitung() {
        x = x + 5 * a;
        return x;
    }
}

public class ClassY extends Class {
    int b = 5;
    int y = 0;

    int hitungY() {
        y = hitung() * b;
        return y;
    }

    public static void main(String[] args) {
        ClassY cy = new ClassY();
        System.out.println(cy.hitungY());
    }
}
```

**Jawaban**
Jadi Atribut dan Method yang diwarisi oleh ClassY dari kelas induknya yaitu:

- Atribut a
- Atribut x
- Method hitung()

Output dari ClassY adalah 50, nilai itu diperoleh dari:

- cy.hitung() memanggil method hitung() yang diwarisi dari kelas Class. Method hitung() menghitung atribut x ditambah dengan perkalian antara 5 dan atribut a, sehingga nilai x menjadi 10.
- Kemudian, method hitungY() mengalikan dari hitung() dengan nilai b, sehingga nilai y menjadi 50.

# Soal 4: Class Mahasiswa dengan Constructor

Dalam class Mahasiswa, lengkapi code dengan:
a. Menambahkan constuctor untuk mengisi atribut nim, nama, alamat, dan jenisKelamin.
b. Membuat objek mahasiswa dengan mengisi atribut nim, nama, alamat, dan jenisKelamin melalui constructor.

```java
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. tambahkan constructor
    // Gunakan constructor untuk mengisi atribut nim, nama, alamat, jenisKelamain

    public static void main(String[] args) {
        // b. buat objek mahasiswa
        // Isi atribut nim, nama, alamat, jenisKelamin lewat constructor
    }
}
```

**Jawaban**

```java
public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public static void main(String[] args) {
        Mahasiswa msh = new Mahasiswa("2241720096", "Muhammad Yoanvari Al Farizi", "Jl. Simpang Remujung", 'L');
    }
}
```

# Soal 5: OOP Buku -> Penulis

Perhatikan class diagram berikut dan buatlah source code dalam bahasa java berdasarkan class diagram tersebut

**Jawaban**

```java
public class Buku {
    private String ISBN, judul;
    Penulis penulis;
    private int harga;

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String iSBN) {
        this.ISBN = iSBN;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }
}
```

```java
public class Penulis {
    private String nama, alamat;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
```
