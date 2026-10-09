# Program PBO — Array dan ArrayList

## Deskripsi

Program ini merupakan implementasi Pemrograman Berorientasi Objek (PBO) menggunakan bahasa pemrograman Java. Program dibuat untuk mengelola data nasabah dan rekening bank sederhana dengan memanfaatkan konsep *class*, *object*, *encapsulation*, serta `ArrayList`.

Program dapat menyimpan beberapa nasabah, mengelola rekening masing-masing nasabah, melakukan penyetoran uang (*deposit*), melakukan penarikan uang (*withdraw*), dan menampilkan informasi jumlah nasabah, jumlah rekening, serta saldo setiap rekening.

## Tujuan Pembelajaran

- Memahami penerapan konsep *class* dan *object* dalam Java.
- Memahami penggunaan *constructor* untuk menginisialisasi objek.
- Menerapkan *encapsulation* menggunakan atribut `private`.
- Memahami penggunaan `ArrayList` untuk menyimpan dan mengelola data.
- Menggunakan method untuk mengakses data dan melakukan transaksi rekening.
- Memahami penggunaan perulangan untuk menampilkan data nasabah dan rekening.

## Struktur File

Program ini terdiri dari empat file Java dengan fungsi sebagai berikut.

| File | Fungsi |
|---|---|
| `Account.java` | Mengelola saldo rekening, mengambil informasi saldo, melakukan deposit, dan melakukan withdraw. |
| `Customer.java` | Menyimpan nama depan, nama belakang, serta daftar rekening milik nasabah. |
| `Bank.java` | Mengelola daftar nasabah, menambahkan nasabah, menghitung jumlah nasabah, dan mengambil data nasabah berdasarkan indeks. |
| `Main.java` | Menjadi titik awal program untuk membuat data nasabah, mengelola rekening, menjalankan transaksi, dan menampilkan hasilnya. |

## Konsep PBO yang Digunakan

### 1. Class dan Object

Program memiliki empat class, yaitu `Account`, `Customer`, `Bank`, dan `Main`. Object dibuat berdasarkan class tersebut untuk merepresentasikan rekening, nasabah, dan bank.

### 2. Encapsulation

Atribut seperti `balance`, `firstName`, `lastName`, `accounts`, dan `daftarNasabah` menggunakan akses `private`. Data diakses atau dikelola melalui method yang tersedia di setiap class.

### 3. Constructor

Constructor digunakan untuk memberikan nilai awal pada objek. Contohnya, constructor `Account` menerima saldo awal, sedangkan constructor `Customer` menerima nama depan dan nama belakang.

### 4. ArrayList

`ArrayList` digunakan untuk menyimpan daftar nasabah di class `Bank` dan daftar rekening di class `Customer`. Dengan demikian, jumlah data dapat bertambah sesuai kebutuhan program.

### 5. Method dan Validasi Transaksi

Method `deposit()` hanya menerima penyetoran dengan jumlah lebih dari nol. Method `withdraw()` hanya menerima penarikan dengan jumlah lebih dari nol dan tidak melebihi saldo yang tersedia.

## Alur Kerja Program

1. Membuat objek `Bank`.
2. Menambahkan dua nasabah, yaitu Wira Buana dan Amar Zulkifli.
3. Membuat dua rekening untuk Wira Buana dengan saldo awal masing-masing Rp10.000 dan Rp5.000.
4. Melakukan deposit sebesar Rp25.000 pada rekening pertama Wira Buana.
5. Mencoba melakukan withdraw sebesar Rp10.000 pada rekening kedua Wira Buana.
6. Membuat satu rekening untuk Amar Zulkifli dengan saldo awal Rp20.000.
7. Menampilkan jumlah nasabah, jumlah rekening setiap nasabah, dan saldo setiap rekening.

## Hasil Program

Berdasarkan nilai awal dan transaksi yang terdapat pada kode, hasil akhirnya adalah sebagai berikut.

| Nasabah | Rekening | Saldo Akhir |
|---|---|---:|
| Wira Buana | Rekening 1 | Rp35.000 |
| Wira Buana | Rekening 2 | Rp5.000 |
| Amar Zulkifli | Rekening 1 | Rp20.000 |

Penarikan Rp10.000 pada rekening kedua Wira Buana tidak berhasil karena saldo awal rekening tersebut hanya Rp5.000. Saldo rekening tetap Rp5.000.

Jumlah nasabah: **2 orang**.

## Cara Menjalankan Program

Pastikan Java Development Kit (JDK) sudah terpasang di komputer.

1. Simpan keempat file Java dalam satu folder.
2. Pastikan nama file pertama adalah `Account.java`, bukan `Account(1).java`.
3. Buka terminal atau Command Prompt pada folder tersebut.
4. Jalankan perintah kompilasi berikut:

```bash
javac Account.java Customer.java Bank.java Main.java
```

5. Setelah kompilasi berhasil, jalankan program dengan perintah:

```bash
java Main
```

## Kesimpulan

Program ini menunjukkan penerapan dasar Pemrograman Berorientasi Objek menggunakan Java. Melalui class `Account`, `Customer`, dan `Bank`, data rekening dan nasabah dikelola menggunakan method dan `ArrayList`. Program juga memperlihatkan proses deposit, validasi penarikan berdasarkan saldo, serta penggunaan perulangan untuk menampilkan informasi setiap nasabah dan rekening.
