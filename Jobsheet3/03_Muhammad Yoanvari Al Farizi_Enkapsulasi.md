# Laporan Praktikum Pertemuan 3

# Jobsheet 3: Enkapsulasi

## Data Mahasiswa

Nama : Muhammad Yoanvari Al Farizi

Nim : 2241720096

Kelas : TI-2C

# 3. Percobaan

## 3.1 Percobaan 1: Enkapsulasi

Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn, dan memiliki method printStatus() untuk menampilkan status motor. Seperti berikut

1. Buka Netbeans, buat project MotorEncapsulation.
2. Buat class Motor. Klik kanan pada package motorencapsulation – New – Java Class.
3. Ketikkan kode class Motor dibawah ini.

   bentuk UML class diagram class Motor adalah sebagai berikut:

4. Kemudian buat class MotorDemo, ketikkan kode berikut ini.
5. Hasilnya adalah sebagai berikut:

Dari percobaan 1 - enkapsulasi, menurut anda, adakah yang janggal?

Yaitu, kecepatan motor tiba-tiba saja berubah dari 0 ke 50. Lebih janggal lagi, posisi kontak motor masih dalam kondisi OFF. Bagaimana mungkin sebuah motor bisa sekejap berkecepatan dari nol ke 50, dan itupun kunci kontaknya OFF?

Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Lalu, bagaimana kita bisa memperbaiki class Motor diatas agar dapat digunakan dengan baik? Kita bisa pertimbangkan beberapa hal berikut ini:

1. Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain)
2. Menyediakan method khusus untuk mengakses atribut.

Untuk itu mari kita lanjutkan percobaan berikutknya tentang Access Modifier.

## 3.2 Percobaan 2: Access Modifier

Pada percobaan ini akan digunakan access modifier untuk memperbaiki cara kerja class Motor pada
percobaan ke-1.

1. Ubah cara kerja class motor sesuai dengan UML class diagram berikut.
2. Berdasarkan UML class diagram tersebut maka class Motor terdapat perubahan, yaitu:

   a. Ubah access modifier kecepatan dan kontakOn menjadi private

   b. Tambahkan method nyalakanMesin, matikanMesin, tambahKecepatan, kurangiKecepatan.

3. Kemudian pada class MotorDemo, ubah code menjadi seperti berikut:
4. Hasilnya dari class MotorDemo adalah sebagai berikut:

Dari percobaan diatas, dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna dan diganti nilainya secara sembarangan. Bahkan ketika mencoba menambah kecepatan saat posisi kontak masih OFF, maka akan muncul notifikasi bahwa mesin OFF. Untuk mendapatkan kecepatan yang diinginkan, maka harus dilakukan secara gradual, yaitu dengan memanggil method tambahKecepatan() beberapa kali. Hal ini mirip seperti saat kita mengendarai motor.

## 3.3 Pertanyaan

1. Pada class MotorDemo, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?

   **Jawaban:**

   Karena didalam metode "tambahKecepatan()" dan "kurangiKecepatan()" memeriksa status "kontakOn" untuk memastikan bahwa mesin sedang dinyalakan (kontakOn = true) sebelum kecepatan dapat ditambahkan atau dikurangi.

2. Mengapat atribut kecepatan dan kontakOn diset private?

   **Jawaban:**

   Untuk membantu menciptakan struktur yang lebih terorganisir, aman, dan mudah dipelihara. Karena ini adalah konsep dari Enkapsulasi.

3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

   **Jawaban:**

   kode program yang telah diubah:

   ```java
   private final int kecepatanMaks = 100;

   public void tambahKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < kecepatanMaks) {
                kecepatan += 5;
            } else {
                System.out.println("Kecepatan tidak bisa bertambah karena sudah sampai batas\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKecepatan() {
        if (kontakOn == true) {
            if (kecepatan < 0) {
                kecepatan -= 5;
            } else {
                System.out.println("Kecepatan tidak bisa berkurang karena kecepatan 0\n");
            }
        } else {
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
   ```

   **OUTPUT**

   ![OutputMotorDemo](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputMotorDemo.jpg)

## 3.4 Percobaan 3: Getter dan Setter

Misalkan di sebuah sistem informasi koperasi, terdapat class Anggota
Anggota memiliki atribut nama, alamat dan simpanan, dan method setter, getter dan setor dan pinjam. Semua atribut pada anggota tidak boleh diubahsembarangan, melainkan hanya dapat diubah melalui method setter,
getter, setor dan tarik. Khusus untuk atribut simpanan tidak terdapat setter karena simpanan akan bertambah ketika melakukan transaksi setor dan akan berkurang ketika melakukan peminjaman/tarik.

1. Berikut ini UML class buatlah class Mahasiswa pada program:
2. Sama dengan percobaan 1 untuk membuat project baru

   a. Buka Netbeans, buat project KoperasiGetterSetter.
   b. Buat class Anggota. Klik kanan pada package koperasigettersetter – New – Java Class.
   c. Ketikkan kode class Anggota dibawah ini.

   Jika diperhatikan pada class Anggota, atribut nama dan alamat memili masing-masing 1 getter dan setter. Sedangkan atribut simpanan hanya memiliki getSimpanan() saja, karena seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik().

3. Selanjutnya buatlah class KoperasiDemo untuk mencoba class Anggota.
4. Hasil dari main method pada langkah ketiga adalah

Dapat dilihat pada hasil percobaan diatas, untuk mengubah simpanan tidak dilakukan secara langsung dengan mengubah atribut simpanan, melainkan melalui method setor() dan pinjam().Untuk menampilkan nama pun harus melalui method getNama(), dan untuk menampilkan simpanan melalui getSimpanan().

## 3.5 Percobaan 4: Konstruktor, Instansiasi

1. Langkah pertama percobaan 4 adalah ubah class KoperasiDemo seperti berikut
2. Hasil dari program tersebut adalah sebagai berikut

   Dapat dilihat hasil running program, ketika dilakukan pemanggilan method getNama()
   hasilnya hal ini terjadi karena atribut nama belum diset nilai defaultnya. Hal ini dapat ditangani dengan membuat kontruktor.

3. Ubah class Anggota menjadi seperti berikut

   Pada class Anggota dibuat kontruktor dengan access modifier default yang memiliki 2 parameter nama dan alamat. Dan didalam konstruktor tersebut dipastikan nilai simpanan untuk pertama kali adalah Rp. 0.

4. Selanjutnya ubah class KoperasiDemo sebagai berikut
5. Hasil dari program tersebut adalah sebagai berikut

   Setelah menambah konstruktor pada class Anggoata maka atribut nama dan alamat secara otomatis harus diset terlebih dahulu dengan melakukan passing parameter jika melakukan instansiasi class Anggota. Hal ini biasa dilakukan untuk atribut yang membutuhkan nilai yang spesifik. Jika tidak membutuhkan nilai spesifik dalam konstruktor tidak perlu parameter. Contohnya simpanan untuk anggota baru diset 0, maka simpanan tidak perlu untuk dijadikan parameter pada konstruktor.

## 3.6 Pertanyaan - Percobaan 3 dan 4

1. Apa yang dimaksud getter dan setter?

   **Jawaban:**

   - Getter adalah metode yang digunakan untuk mengambil atau mendapatkan nilai dari suatu atribut atau variabel privat. Getter membantu dalam membaca nilai dari atribut yang tidak memiliki akses langsung dari luar class.
   - Setter adalah metode yang digunakan untuk mengatur atau mengubah nilai dari suatu atribut atau variabel privat. Setter membantu dalam memperbarui nilai dari atribut yang tidak dapat diubah langsung dari luar class.

2. Apa kegunaan dari method getSimpanan()?

   **Jaewaban:**

   Method getSimpan() digunakan untuk mengambil atau mendapatkan nilai dari atribut simpanan.

3. Method apa yang digunakan untuk menambah saldo?

   **Jawaban:**

   Method setor(float uang).

4. Apa yand dimaksud konstruktor?

   **Jawaban:**

   Konstruktor adalah metode yang memiliki nama yang sama dengan nama kelas dan tidak memiliki tipe pengembalian (void atau lainnya). Konstruktor digunakan untuk menginisialisasi objek saat objek tersebut pertama kali diciptakan atau diinstansiasi dari kelasnya.

5. Sebutkan aturan dalam membuat konstruktor?

   **Jawaban:**

   Cara untuk membuat konstruktor adalah sebagai berikut:

   1. Nama konstruktor harus sama persis dengan nama kelas tempatnya dideklarasikan.
   2. Konstruktor tidak memiliki tipe pengembalian.
   3. Dapat mendefinisikan berbagai konstruktor dalam satu kelas dengan jumlah dan tipe parameter yang berbeda.
   4. Konstruktor digunakan untuk menginisialisasi objek dan memberikan nilai awal ke atribut atau variabel kelas.
   5. Konstruktor dapat memanggil konstruktor lain dari kelas yang sama menggunakan kata kunci 'this()'.

6. Apakah boleh konstruktor bertipe private?

   **Jawaban:**

   Ya boleh, Meskipun jarang digunakan, konstruktor pribadi memiliki beberapa kegunaan dan manfaat, terutama dalam implementasi pola desain tertentu seperti Singleton dan Factory.

7. Kapan menggunakan parameter dengan passsing parameter?

   **Jawaban:**

   Passing parameter digunakan ketika tidak perlu metode getter dan setter.

8. Apa perbedaan atribut class dan instansiasi atribut?

   **Jawaban:**

   - Atribut class adalah atribut yang terkait dengan class secara keseluruhan, bukan dengan setiap objek individu yang diinstansiasi dari class. Nilai atribut class adalah sama untuk semua objek yang dibuat dari class.
   - Atribut instansiasi adalah atribut yang terkait dengan setiap objek individu yang diinstansiasi dari class tersebut. Nilai atribut instansiasi berbeda untuk setiap objek.

9. Apa perbedaan class method dan instansiasi method?

   **Jawaban:**

   - Metode class adalah metode yang terkait dengan class secara keseluruhan, bukan dengan setiap objek individu yang diinstansiasi dari class tersebut.
   - Metode instansiasi adalah metode yang terkait dengan setiap objek individu yang diinstansiasi dari class tersebut.

# 4. Kesimpulan

Dari percobaan diatas, telah dipelajari kosep dari enkapsulasi, kontruktor, access modifier yang terdiri dari 4 jenis yaitu public, protected, default dan private. Konsep atribut atau method class yang ada di dalam blok code class dan konsep instansiasi atribut atau method. Cara penggunaan getter dan setter beserta fungsi dari getter dan setter. Dan juga telah dipelajari atau memahami notasi UML.

# 5. Tugas

1. Cobalah program dibawah ini dan tuliskan hasil outputnya

   **OUTPUT**

   ![OutputEncapTest](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputEncapTest.jpg)

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa.

   **Jawaban:**

   Kondisi di dalam method membatasi nilai age hingga maksimal 30. Inilah sebabnya mengapa nilai age yang ditampilkan adalah 30.

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18.

   **Jawaban:**

   Kode Program yang diubah pada class EncapDemo

   ```java
   public void setAge(int newAge) {
        if (newAge > 30) {
            age = 30;
        } else if (newAge < 18) {
            age = 18;
        } else {
            age = newAge;
        }
    }
   ```

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan.

   **Jawaban:**

   ```java
    package Tugas;

    public class Anggota {
        private String noKtp, nama;
        private int limitPeminjaman, jumlahPinjaman;

        public Anggota(String noKtp, String nama, int limitPeminjaman) {
            this.noKtp = noKtp;
            this.nama = nama;
            this.limitPeminjaman = limitPeminjaman;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getLimitPinjaman() {
            return limitPeminjaman;
        }

        public void setLimitPinjaman(int limitPeminjaman) {
            this.limitPeminjaman = limitPeminjaman;
        }

        public int getJumlahPeminjaman() {
            return jumlahPinjaman;
        }

        public void pinjam(int jumlahPinjaman) {
            if (jumlahPinjaman > this.limitPeminjaman) {
                System.out.println("Maaf, Jumlah peminjaman melebihi limit");
            } else {
                this.jumlahPinjaman = jumlahPinjaman;
            }
        }

        public void angsur(int angsur) {
            this.jumlahPinjaman = this.jumlahPinjaman - angsur;
        }
    }
   ```

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”.

   **Jawaban:**

   ```java
   package Tugas;

    public class Anggota {
        private String noKtp, nama;
        private int limitPeminjaman, jumlahPinjaman;

        public Anggota(String noKtp, String nama, int limitPeminjaman) {
            this.noKtp = noKtp;
            this.nama = nama;
            this.limitPeminjaman = limitPeminjaman;
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getLimitPinjaman() {
            return limitPeminjaman;
        }

        public void setLimitPinjaman(int limitPeminjaman) {
            this.limitPeminjaman = limitPeminjaman;
        }

        public int getJumlahPeminjaman() {
            return jumlahPinjaman;
        }

        public void pinjam(int jumlahPinjaman) {
            if (jumlahPinjaman > this.limitPeminjaman) {
                System.out.println("Maaf, Jumlah peminjaman melebihi limit");
            } else {
                this.jumlahPinjaman = jumlahPinjaman;
            }
        }

        public void angsur(int angsur) {
            int minimAngsur = (10 * this.jumlahPinjaman) / 100;
            if (angsur < minimAngsur) {
                System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
            } else {
                this.jumlahPinjaman = this.jumlahPinjaman - angsur;
            }
        }
    }
   ```

   **OUTPUT**

   ![OutputTestKoperasi](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestKoperasi.jpg)

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console.

   **Jawaban:**

   ```java
    package Tugas;

    import java.util.Scanner;

    public class TestKoperasi {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Anggota donny = new Anggota("111333444", "Donny", 5000000);

            System.out.println("Nama Anggota: " + donny.getNama());
            System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman() + "\n");

            int pinjam, ansur, pilih;
            do {
                menu();
                pilih = sc.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.println("-----------------------------");
                        System.out.print("Masukkan nominal yang mau anda pinjam: ");
                        pinjam = sc.nextInt();
                        donny.pinjam(pinjam);
                        System.out.println("\nPinjaman anda: " + donny.getJumlahPeminjaman());
                        break;

                    case 2:
                        System.out.println("-----------------------------");
                        System.out.print("Masukkan nominal yang mau anda bayar: ");
                        ansur = sc.nextInt();
                        donny.angsur(ansur);
                        System.out.println("\nPinjaman anda: " + donny.getJumlahPeminjaman());
                        break;
                }

            } while (pilih == 1 || pilih == 2);
        }

        public static void menu() {
            System.out.println("-----------------------------");
            System.out.println("[1] Peminjaman");
            System.out.println("[2] angsuran");
            System.out.print("Pilih Menu:");
        }
    }
   ```

   **OUTPUT**

   ![OutputTestKoperasiInput](https://github.com/Yoanvari/Object-Oriented-Programming/blob/main/img/OutputTestKoperasiInputan.jpg)
