# Laporan Quiz 1

## Data Mahasiswa

Nama : Muhammad Yoanvari Al Farizi

Nim : 2241720096

Kelas : TI-2C

# Class dan Object

1. Apa yang dimaksud dengan "class" dalam pemrograman berorientasi objek?

   **Jawaban:**
   Class adalah prototype atau template dari objek. Sebuah class mempunyai anggota yang terdiri dari atribut dan method

2. Bagaimana Anda mendefinisikan objek dari suatu class dalam bahasa pemrograman Java?

   **Jawaban:**
   Untuk mendefinisikan objek dari suatu class yaitu dengan melakukan proses Instansiasi, dibawah ini adalah cara Instansiasi objek dalam bahasa pemrograman Java:

   ```java
   // Deklarasi objek
   NamaClass namaObjek;

   // Instansiasi objek
   NamaClass namaObjek = new NamaClass();

   // Menggunakan objek
   namaObjek.namaMetode();
   namaObjek.namaAtribut = nilai;
   ```

3. Misalkan Anda memiliki class "Barang" dalam sistem informasi inventaris. Bagaimana Anda akan membuat objek "laptop" dari class tersebut?

   **Jawaban:**

   ```java
   // Deklarasi objek
   Barang laptop;

   // Instansiasi objek
   Barang laptop = new Barang();

   // Menggunakan objek
   laptop.setMerek("Dell");
   laptop.setModel("XPS 13");
   laptop.setTahunPembuatan(2021);
   laptop.setHarga(15000000);
   ```

# Encapsulation

1. Jelaskan konsep encapsulation dalam pemrograman berorientasi objek dan mengapa hal ini penting dalam pengembangan sistem informasi inventaris barang.

   **Jawaban:**
   Encapsulation adalah pengemasan atau penyembunyian informasi yang terkait dengan suatu objek sehingga informasi tersebut tidak dapat diakses atau dimanipulasi secara langsung dari luar objek. Hal ini dicapai dengan mendefinisikan atribut dan metode sebagai private, protected, atau public dalam suatu class.

2. Dalam konteks sistem informasi inventaris, sebutkan contoh atribut (variabel) yang harus di-encapsulate dan mengapa.

   **Jawaban:**

   1. Merek barang

      - Alasan: Melindungi merek dari modifikasi tidak sah dan memastikan merek hanya dapat diubah sesuai aturan dan prosedur yang telah ditetapkan.

   2. Nomor serial

      - Alasan: Nomor serial adalah informasi penting yang harus dijaga integritas dan keabsahannya. Penyembunyian memastikan nomor serial hanya dapat diakses dan diubah oleh proses yang sah.

   3. Harga barang

      - Alasan: Harga adalah data keuangan yang sensitif dan perlu dijaga kerahasiaannya. Menggunakan encapsulation memastikan hanya proses yang diotorisasi yang dapat mengakses dan memodifikasi harga.

   4. Jumlah barang

      - Alasan: Mencegah jumlah barang diubah secara tidak sah. Kontrol akses terhadap atribut ini penting untuk memastikan integritas data inventaris.

   5. Tanggal masuk

      - Alasan: Tanggal masuk adalah data penting yang harus dilindungi dan hanya diubah sesuai prosedur yang benar. Penyembunyian memastikan tanggal masuk tidak dimodifikasi dengan sembarangan.

   6. Lokasi barang

      - Alasan: Informasi lokasi barang harus dijaga agar tidak diubah secara sembarangan. Kontrol akses melalui encapsulation memastikan data ini hanya diakses dan dimodifikasi sesuai aturan yang telah ditetapkan.

   7. Kondisi barang
      - Alasan: Mengatur akses terhadap kondisi barang membantu dalam pemantauan dan pemeliharaan inventaris. Data kondisi harus terlindungi agar tidak dimanipulasi dengan tidak sah.

# Relasi Kelas

1. Apa yang dimaksud dengan relasi antara kelas dalam pemrograman berorientasi objek?

   **Jawaban:**
   Relasi antar kelas adalah interaksi dan hubungan antara dua atau lebih kelas. Relasi ini menggambarkan bagaimana kelas-kelas saling berhubungan, berinteraksi, dan bertukar informasi.

2. Dalam sistem informasi inventaris barang, bagaimana Anda akan menggambarkan relasi antara kelas "Barang" dan kelas "Kategori"?

   **Jawaban:**
   Dalam sistem informasi inventaris barang, relasi antara kelas "Barang" dan kelas "Kategori" dapat dijelaskan sebagai relasi Aggregation. Sebuah "Barang" termasuk dalam satu "Kategori" tertentu, dan perubahan pada "Kategori" tidak akan mempengaruhi "Barang" secara keseluruhan.

# PBL

1. Berdasarkan kasus sistem informasi inventaris barang, coba buat sebuah class sederhana beserta atribut dan metodenya yang menggambarkan suatu entitas dalam sistem tersebut (misalnya, class "Barang").

   ```java
   public class Barang {
      private String nama;
      private int jumlah, harga;

      // Konstruktor
      public Barang(String nama, int jumlah, int harga) {
         this.nama = nama;
         this.jumlah = jumlah;
         this.harga = harga;
      }

      // Getter
      public String getNama() {
         return nama;
      }

      public int getJumlah() {
         return jumlah;
      }

      public double getHarga() {
         return harga;
      }

      // Setter
      public void setNama(String nama) {
         this.nama = nama;
      }

      public void setJumlah(int jumlah) {
         this.jumlah = jumlah;
      }

      public void setHarga(int harga) {
         this.harga = harga;
      }

      // Metode untuk menghitung nilai total barang
      public double hitungTotal() {
         return jumlah * harga;
      }
   }
   ```

2. Bagaimana Anda akan menggunakan encapsulation untuk melindungi atribut-atribut dalam class tersebut?
   **Jawaban**
   atribut nama, jumlah, dan harga dienkapsulasi dengan aksesibilitas private.

3. Gambarkan hierarki class atau hubungan antar class yang mungkin ada dalam sistem informasi inventaris barang di jurusan Teknologi Informasi. Berikan contoh relasi antar class (misalnya, inheritance atau association) dalam konteks tersebut.
   **Jawaban**
   - class Laptop dan Processor mewarisi atribut dan metode dari class Barang, menggambarkan hubungan inheritance.
   - Selain itu, class Barang dan class Kategori ,menggambarkan hubungan association, di mana setiap barang terkait dengan satu kategori.
