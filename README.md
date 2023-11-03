# Manajemen Penayangan Film di Bioskop CGY
## Anggota Kelompok 15
- Stephanie Elfriede Ginting (2209116037)
- Bertha Joy Rodo Saragi (2209116047)
## Deskripsi Project
Manajemen penayangan film di bioskop adalah sebuah proses yang sangat penting dalam industri hiburan. Ini melibatkan perencanaan, pengaturan, dan pengelolaan jadwal penayangan film di bioskop dengan tujuan memberikan pengalaman yang optimal bagi penonton. Para manajer bioskop harus mempertimbangkan berbagai faktor seperti jadwal rilis film, durasi film, kapasitas ruang, dan preferensi penonton. Mereka juga harus menjaga kualitas layar, suara, dan kenyamanan ruang teater agar memenuhi harapan penonton. Selain itu, strategi pemasaran dan promosi juga menjadi bagian integral dari manajemen penayangan film untuk menarik lebih banyak penonton ke bioskop. Dengan teknologi terbaru dan variasi jenis film yang tersedia, manajemen penayangan film menjadi kunci dalam menjaga daya tarik bioskop sebagai tempat hiburan yang tak tergantikan.
## Flowchart
![FC PA PBO drawio](https://github.com/kelompok-15-pbo/PA_PBO_KEL15/assets/122262846/f8b6b997-e0db-4645-b591-cc831c5720ae)
## ERD
![logiical fix](https://github.com/kelompok-15-pbo/PA_PBO_KEL15/assets/122262846/e4fedfc4-e717-4c05-8dc5-49db65e9cd0f)
## Hirarki Kelas
![image](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/e179a9ba-a1df-4d15-b9c8-8a4ee0cf53a2)
## Screenshot Coding dan Penjelasan
### Struktur Packages
![Screenshot (1109)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/c5636912-a5c0-4834-94c8-b5f4e70a2435)

* **CRUD_ADMIN**
    * Paket-paket ini berisi kode untuk aplikasi CRUD (Create, Read, Update, Delete) yang digunakan oleh admin untuk mengelola data film dan penayangan.
* **CRUD_SUPERADMIN**
    * Paket-paket ini berisi kode untuk aplikasi CRUD yang digunakan oleh superadmin untuk mengelola data film, penayangan, dan admin.
* **FOTO.FOTO GUI**
    * Paket-paket ini berisi gambar yang digunakan untuk antarmuka pengguna (GUI) aplikasi.
* **Login**
    * Paket-paket ini berisi kode untuk aplikasi login yang digunakan pengguna untuk masuk ke sistem.
* **ORM**
    * Paket-paket ini berisi kode untuk Object-Relational Mapping (ORM), yang digunakan untuk menghubungkan data dari database ke objek dalam kode.
* **database**
    * Paket ini berisi kode untuk database yang digunakan oleh aplikasi.
* **models**
    * Paket ini berisi model data untuk aplikasi.

**CRUD_ADMIN**

* **EditPenayangan.java**
    * Kode untuk mengedit data penayangan.
* **HapusPenayangan.java**
    * Kode untuk menghapus data penayangan.
* **LihatPenayangan.java**
    * Kode untuk menampilkan data penayangan.
* **MENU_ADMIN.java**
    * Kode untuk menampilkan menu admin.
* **TambahPenayangan.java**
    * Kode untuk menambahkan data penayangan.

**CRUD_SUPERADMIN**

* **EditFilm.java**
    * Kode untuk mengedit data film.
* **HapusFilm.java**
    * Kode untuk menghapus data film.
* **LihatFilm.java**
    * Kode untuk menampilkan data film.
* **MENU SUPERADMIN.java**
    * Kode untuk menampilkan menu superadmin.
* **TambahFilm.java**
    * Kode untuk menambahkan data film.

**FOTO.FOTO GUI**

* **CRUD.png**
    * Gambar untuk ikon aplikasi CRUD.
* **FOTO GUI.jpg**
    * Gambar untuk latar belakang antarmuka pengguna.
* **awal.png**
    * Gambar untuk ikon halaman awal.
* **login.png**
    * Gambar untuk ikon halaman login.
* **menu.png**
    * Gambar untuk ikon halaman menu.

**Login**

* **Awal.java**
    * Kode untuk menampilkan halaman awal.
* **LOGIN_ADMIN.java**
    * Kode untuk proses login admin.
* **LOGIN SUPERADMIN.java**
    * Kode untuk proses login superadmin.

**ORM**

* **Film.java**
    * Model data untuk film.
* **FilmInterface.java**
    * Antarmuka untuk model data film.
* **Penayangan.java**
    * Model data untuk penayangan.
* **PenayanganDAO.java**
    * Kelas untuk mengakses data penayangan dari database.

**database**

* **databases1.java**
    * Kode untuk membuat database.

**models**

* **SuperAdmin.java**
    * Model data untuk superadmin.


### Class Penayangan di Package ORM

![Screenshot (1132)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/7e18db9f-1878-4ca8-aa4a-18080a125d00)

- Kode bagian ini adalah deklarasi paket (package) yang digunakan untuk mengelompokkan kelas-kelas terkait dalam program.

![Screenshot (1133)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/f26223bc-c641-4039-b26a-c3f73319e804)

- Kode bagian ini adalah impor kelas `databases1` dari paket `database`. Kelas ini digunakan untuk mengatur koneksi ke database. Dan ini adalah daftar impor yang diperlukan untuk mengakses kelas-kelas yang digunakan dalam program. `Connection`, `PreparedStatement`, `SQLException`, dan `ResultSet` digunakan untuk berinteraksi dengan database. `Date` digunakan untuk merepresentasikan tanggal. `ArrayList` dan `List` digunakan untuk menyimpan objek-objek Penayangan. `JOptionPane` digunakan untuk menampilkan pesan dialog, dan `DefaultTableModel` digunakan untuk memodelkan data tabel dalam komponen GUI Swing.

![Screenshot (1134)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/efdc79a7-51e4-43b2-903e-3d833c78c50e)

- Kode bagian ini adalah deklarasi kelas utama `Penayangan`. Kelas ini berisi atribut dan metode-metode yang terkait dengan objek penayangan. Dan atribut-atribut dari kelas `Penayangan`, yang merepresentasikan data yang terkait dengan penayangan. Misalnya, `idPenayangan` adalah ID penayangan, `tanggal` adalah tanggal penayangan, dan sebagainya.

![Screenshot (1135)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/182d83c3-8388-4e4a-b42b-893d55a258f2)

- Kode bagian ini adalah metode getter (`getIdPenayangan`) dan setter (`setIdPenayangan`) untuk atribut `idPenayangan`. Metode ini digunakan untuk mengambil nilai atribut dan mengubahnya.

![Screenshot (1136)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/dd50f4c2-a480-4528-ad29-e934927e0163)

- Kode bagian ini adalah metode statis `getPenayanganById` yang digunakan untuk mendapatkan objek `Penayangan` berdasarkan ID penayangan yang diberikan.

![Screenshot (1137)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/ef71b324-4197-4e04-adea-712344b5633d)

- Kode bagian ini, terdapat konstruktor yang digunakan untuk membuat objek Penayangan. Konstruktor ini memungkinkan pengguna untuk mengatur nilai awal dari semua atribut objek saat objek Penayangan dibuat. 

![Screenshot (1138)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/b31423d5-94fe-41bf-bee0-55fbbed5c606)

- Metode ini digunakan untuk mengambil data tentang penayangan film dari database dan mengembalikannya dalam bentuk tabel, yang dapat digunakan untuk menampilkan informasi penayangan di antarmuka pengguna.

![Screenshot (1139)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/d3b9dc5e-acea-4675-850b-b8bfb13a70f2)

- Metode ini digunakan untuk menambahkan data penayangan baru ke dalam database. Pertama, metode membuat koneksi ke database dan kemudian menyiapkan query SQL untuk menambahkan data penayangan baru ke dalam tabel. Data seperti ID Penayangan, tanggal, waktu, ID admin, ID film, dan studio dimasukkan ke dalam query. Setelahnya, query dieksekusi dan jika berhasil, metode akan mengembalikan nilai true, jika ada masalah, akan mengembalikan false.

![Screenshot (1140)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/b52e6ff7-0b54-48be-9b9c-cffc50a41255)

- Metode ini digunakan untuk memperbarui data penayangan yang sudah ada dalam database. Metode membuat koneksi ke database dan menyusun query SQL untuk mengubah data penayangan berdasarkan ID Penayangan. Data tanggal dan waktu baru dimasukkan ke dalam query, lalu query dieksekusi. Jika pembaruan berhasil, metode akan mengembalikan nilai true, jika ada kesalahan dalam proses, akan mencetak pesan kesalahan dan mengembalikan false.

![Screenshot (1141)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/7426769b-e459-44b2-8b70-01e35d00bb1a)

- Metode ini digunakan untuk menghapus data penayangan dari database. Setelah membuat koneksi ke database, metode menyiapkan query SQL untuk menghapus data penayangan berdasarkan ID Penayangan dan ID Film. Data tersebut dimasukkan ke dalam query dan kemudian dieksekusi. Jika penghapusan berhasil, metode akan mengembalikan true, jika ada kesalahan dalam proses, akan mengembalikan false.

![Screenshot (1142)](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/106670c4-7b44-4e43-8209-030f67338f8e)

- Metode ini digunakan untuk mengambil semua data penayangan dari database dan mengembalikannya dalam bentuk daftar objek Penayangan. Prosesnya dimulai dengan mengatur koneksi ke database dan menjalankan query SQL untuk mengambil semua data penayangan dari tabel. Data tersebut kemudian digunakan untuk membuat objek-objek Penayangan yang disimpan dalam daftar. Metode akan mengembalikan daftar objek Penayangan tersebut.

## Screenshot Output
### Login
- Awal (Login dan Super Admin)
  
![Awal](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/22d03321-4dc4-45d8-935d-779a01578b2b)

- Admin Login
  
![Admin Login](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/983001c4-6f74-428d-94c7-0ddd43ad7e30)

- Super Admin Login
  
![Super Admin Login](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/f1e6ff6f-cfd2-4e62-9ff3-22009a8a6017)

### Menu (Admin)
- Menu

![Menu Admin](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/d179ee75-03ac-41a5-8f14-6542d009b855)

- Tambah Penayangan

![Tambah Penayangan](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/1a1249b2-0591-4b8e-9a3a-7966cd84bb33)

- Lihat Penayangan

![Lihat Penayangan](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/ed003cf9-a77f-4d2a-b6c6-cd59833e54c7)

- Edit Penayangan

![Edit Penayangan](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/38f0feb8-7651-40d2-9848-56cd0c43c67e)

- Lihat Penayangan setelah Edit

![Lihat Penayangan setelah Edit](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/7629594f-0f60-4840-b022-8286fc550a87)

- Hapus Penayangan

![Hapus Penayangan](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/66621a46-c69d-4b14-91a6-781458ee8024)

- Lihat Penayangan setelah Hapus

![Lihat Penayangan setelah Hapus](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/9c450108-b6c9-4f94-8b0c-616e417d5fd6)

### Menu (Super Admin)
- Menu

![Menu Super Admin](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/01496f5a-8ec7-4bc6-be67-04c2c786f4dc)

- Tambah Film

![Tambah Film](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/4b2c57f6-7f0e-4d81-8760-22f3e970c2a3)

- Lihat Film

![Lihat Film](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/6feb0df6-5f13-422f-ac57-e112220274ac)

- Edit Film
  
![Edit Film](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/b05d2b2c-c9bc-42f0-9626-1da3c0f213ab)

- Lihat Film setelah Edit

![Lihat Film setelah Edit](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/54c0bb1d-541f-4e6f-9129-ff1c494798e0)

- Hapus Film

![Hapus Film](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/709c62b8-2788-46f2-b1f2-e80a8b9bb150)

- Lihat Film setelah Hapus

![Lihat Film setelah Hapus](https://github.com/PA-PBO-KEL-15/PA-PBO/assets/126863743/71c5e93c-eb46-49f0-9ab2-39a57b309344)



















