## Penerapan Encapsulation, Inheritance, dan Polymorphism

### 1. Encapsulation

Encapsulation diterapkan pada class `BujurSangkar`, `Lingkaran`, dan `Silinder` dengan menggunakan modifier `private` pada atribut `sisi`, `radius`, dan `tinggi`. Atribut tersebut diakses dan diubah menggunakan method accessor dan mutator, seperti `getSisi()`, `setSisi()`, `getRadius()`, `setRadius()`, `getTinggi()`, dan `setTinggi()`. Pada class `Bentuk`, atribut `warna` menggunakan modifier `protected` agar dapat diakses oleh class turunannya.

### 2. Inheritance

Inheritance diterapkan menggunakan kata kunci `extends` untuk menghubungkan class induk dengan class turunannya. Pada tugas ini, `BujurSangkar` dan `Lingkaran` mewarisi class `Bentuk`, sedangkan `Silinder` mewarisi class `Lingkaran`. Constructor pada class turunan menggunakan `super()` untuk memanggil constructor class induk, seperti pada class `Silinder` yang menggunakan `super(radius, warna)` untuk menginisialisasi jari-jari dan warna melalui constructor `Lingkaran`.

### 3. Polymorphism

Polymorphism diterapkan dengan melakukan overriding pada method `printInfo()` di class `BujurSangkar`, `Lingkaran`, dan `Silinder`. Setiap class memiliki implementasi `printInfo()` yang berbeda, seperti menampilkan luas bujursangkar, luas lingkaran, atau volume silinder.

Penerapan polymorphism juga terdapat pada `Main.java` melalui kode berikut:

```java
Bentuk b1 = new BujurSangkar(5, "Ungu");
Bentuk b2 = new Lingkaran(3, "Putih");

b1.printInfo();
b2.printInfo();
```

Meskipun `b1` dan `b2` bertipe `Bentuk`, pemanggilan `printInfo()` akan menjalankan method sesuai dengan jenis objek yang dibuat.
