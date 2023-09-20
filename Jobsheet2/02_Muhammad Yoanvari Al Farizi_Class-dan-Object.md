# Laporan Praktikum Pertemuan 2

# Jobsheet 2: Class dan Object

## Data Mahasiswa

Nama : Muhammad Yoanvari Al Farizi

Nim : 2241720096

Kelas : TI-2C

# 4. Percobaan

## 4.1 Percobaan 1: Membuat Class Diagram

Studi Kasus 1:
Dalam suatu perusahaan salah satu data yang diolah adalah data karyawan. Setiap karyawan memiliki id, nama, jenis kelamin, jabatan, dan gaji. Setiap karyawan juga bisa menampilkan data diri pribadi dan melihat gajinya.

1. Gambarkan desain class diagram dari studi kasus 1!

   **Jawaban:**

   ![ClassDiagramKaryawan](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/ClassDiagramKaryawan.jpg)

2. Sebutkan Class apa saja yang bisa dibuat dari studi kasus 1!

   **Jawaban:**

   - Class Karyawan

3. Sebutkan atribut beserta tipe datanya yang dapat diidentifikasi dari masing-masing class dari studi kasus 1!

   **Jawaban:**

   - Class Karyawan:

     - id: int
     - nama: String
     - jenisKelamin: char
     - jabatan: String
     - gaji: int

4. Sebutkan method-method yang sudah anda buat dari masing-masing class pada studi kasus 1!

   **Jawaban:**

   - Class Karyawan

     - tampilData(): void
     - tampilGaji(): void

## 4.2 Percobaan 2: Membuat dan mengakses anggota suatu class

### Langkah kerja:

1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.
2. Ketikkan kode program berikut ini:
3. Simpan dengan nama file Mahasiswa.java.
4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggota-anggota dari class Mahasiswa dengan membuka file baru kemudian ketikkan kode program berikut:
5. Simpan file dengan TestMahasiswa.java
6. Jalankan class TestMahasiswa

   **OUTPUT:**

   ![OutputTestMahasiswa](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestMahasiswa.jpg)

7. Jelaskan pada bagian mana proses pendeklarasian atribut pada program diatas!

   **Jawaban:**

   Berikut ini bagian dari proses pendeklarasian atribut pada program

   ![DeklarasiAtribut](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/DeklarasiAtribut.jpg)

8. Jelaskan pada bagian mana proses pendeklarasian method pada program diatas!

   **Jawaban:**

   Berikut ini bagian dari proses pendeklarasian method pada program

   ![DeklarasiMethod](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/DeklarasiMethod.jpg)

9. Berapa banyak objek yang di instansiasi pada program diatas!

   **Jawaban:**

   Terdapat satu objek yang di instansiasi, yaitu “mhs1” dari class "Mahasiswa".

10. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.nim=101” ?

    **Jawaban:**

    Untuk menginputkan nilai atribut ‘nim’ dari objek ‘mhs1’ yang telah dibuat sebelumnya, jadi nilai atribut ‘nim’ dari objek ‘mhs1’ akan bernilai “101”.

11. Apakah yang sebenarnya dilakukan pada sintaks program “mhs1.tampilBiodata()”?

    **Jawaban:**

    Untuk memanggil method ‘tampilBiodata()’ pada objek ‘mhs1’ yang telah dibuat sebelumnya, yang methodnya berisikan untuk menampilkan informasi biodata Mahasiswa, yaitu nim, nama, Alamat, dan kelas.

12. Instansiasi 2 objek lagi pada program diatas!

    **Jawaban:**

    ```java
    public class TestMahasiswa {
        public static void main(String args[]) {
            Mahasiswa mhs1 = new Mahasiswa();

            mhs1.nim = 101;
            mhs1.nama = "Lestari";
            mhs1.alamat = "Jl. Vinolia No 1A";
            mhs1.kelas = "1A";
            mhs1.tampilBiodata();

            Mahasiswa mhs2 = new Mahasiswa(102, "Naoy", "Jl. Konoha No 2A", "1B");
            Mahasiswa mhs3 = new Mahasiswa(103, "Diki", "Jl. Wakanda No 3B", "1C");
            mhs2.tampilBiodata();
            mhs3.tampilBiodata();
        }
    }
    ```

    **OUTPUT**

    ![OutputTestMahasiswa2Objec](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputInstansiasi2Objek.jpg)

## 4.3 Percobaan 3: Menulis method yang memiliki argument/parameter dan memiliki return

### Langkah kerja:

1. Bukalah text editor atau IDE, misalnya Notepad ++ / netbeans.
2. Ketikkan kode program berikut ini:
3. Simpan dengan nama file Barang.java
4. Untuk dapat mengakses anggota-anggota dari suatu obyek, maka harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini adalah cara pengaksesan anggota-anggota dari class Barang dengan membuka file baru kemudian ketikkan kode program berikut:
5. Simpan dengan nama file TestBarang.java
6. Jalankan program tersebut!

   **OUTPUT**

   ![OutputTestBarang](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestBarang.jpg)

7. Apakah fungsi argumen dalam suatu method?

   **Jawaban:**

   Argumen dalam suatu method adalah nilai atau data yang dikirimkan ke method tersebut ketika method tersebut dipanggil. Fungsi argumen adalah memberikan inputan kepada method agar method dapat melakukan operasi atau tindakan tertentu terhadap data tersebut.

8. Ambil kesimpulan tentang kegunaan dari kata kunci return, dan kapan suatu method harus memiliki return!

   **Jawaban:**

   - Kegunaan dari kata kunci return adalah untuk mengembalikan nilai, memberi output, dan mengakhiri eksekusi.
   - Method harus memiliki return apabila method tersebut dideklarasikan dengan tipe data kembalian selain ‘void’.

## 4.4 Tugas

1. Suatu toko persewaan video game salah satu yang diolah adalah peminjaman, dimana data yang dicatat ketika ada orang yang melakukan peminjaman adalah id, nama member, nama game, dan harga yang harus dibayar. Setiap peminjaman bisa menampilkan data hasil peminjaman dan harga yang harus dibayar. Buatlah class diagram pada studi kasus diatas!

   Penjelasan:

   - Harga yang harus dibayar diperoleh dari lama sewa x harga.
   - Diasumsikan 1x transaksi peminjaman game yang dipinjam hanya 1 game saja.

   **Jawaban:**

   ![ClassDiagramTokoGame](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/ClassDiagramTokoGame.jpg)

2. Buatlah program dari class diagram yang sudah anda buat di no 1!

   **Jawaban:**

   - TokoGame.java
   - TestGame.java

   **OUTPUT**

   ![OutputTestGame](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestGame.jpg)

3. Buatlah program sesuai dengan class diagram berikut ini:

   **Jawaban:**

   - Lingkaran.java
   - TestLingkaran.java

   **OUTPUT**

   ![OutputTestLingkaran](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestLingkaran.jpg)

4. Buatlah program sesuai dengan class diagram berikut ini:

   Deskripsi / Penjelasan :

   - Nilai atribut hargaDasar dalam Rupiah dan atribut diskon dalam %
   - Method hitungHargaJual() digunakan untuk menghitung harga jual dengan perhitungan berikut ini: harga jual = harga dasar – (diskon x harga dasar)
   - Method tampilData() digunakan untuk menampilkan nilai dari kode, namaBarang, hargaDasar, diskon dan harga jual

   **Jawaban:**

   - Barang.java
   - TestBarang.java

   **OUTPUT**

   ![OutputBarangTugas](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestBarangTugas.jpg)
