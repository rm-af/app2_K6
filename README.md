# Project Kolaborasi Android

Ini adalah proyek sederhana untuk belajar kolaborasi menggunakan Git & Android Studio

## 👥 Tim
- Rama Aditya Faisal: Inisialisasi & Merge PR
- Naraya Agastya: Fitur UI
- Raditiya Yuga Pratama: Fitur Logic & Splash
  
## 📱 Fitur
- Menampilkan TextView
- Menampilkan Splash Screen
- Menampilkan Button yang dapat diklik

## 🔧 Teknologi
- Kotlin
- Android Studio
- Git + GitHub

## 📋Penjelasan Code Penting
 ### Import class
- import android.os.Bundle 
  - Agar kita dapat menggunakan class Bundle di file Kotlin tanpa perlu menuliskan path secara lengkap
- import android.widget.Button 
  - Mengimpor class button di file kotlin
- import android.widget.EditText 
  - Mengimpor class Edit Text untuk input text
- import android.widget.TextView 
  - Mengimpor class Text View untuk menampilkan Text
  
- import androidx.activity.enableEdgeToEdge
  - Mengaktifkan fitur edge-to-edge layout pada activity, nantinya layout dalam aplikasi akan berada di bawah navigation bar   sehingga membuat tampilan aplikasi           menjadi lebih bersih
- import androidx.appcompat.app.AppCompatActivity 
  - Mengimpor class AppCompatActivity, yaitu superclass yang umum digunakan untuk membuat Activity di Android modern.
- import androidx.core.view.ViewCompat 
  - Class yang digunakan untuk mengatur View agar tetap berjalan dengan baik di berbagai versi Android.
- import androidx.core.view.WindowInsetsCompat 
  - Ini pasangan dari ViewCompat, WindowInsetsCompat ini dipakai buat ngatur jarak/tampilan kalau ada bagian sistem
### Content
- setContentView(R.layout.activity_main) 
  - Tampilkan tampilan/layout yang ada di file activity_main.xml sebagai isi dari layar ini (Activity)
- override fun oncreate 
  - Saat user membuka Activity, Android otomatis akan memanggil onCreate(). Di dalamnya kita bisa menyiapkan semua yang dibutuhkan untuk menampilkan layar
### Variable components
- val inputNama = findViewById<EditText>(R.id.etNama) 
  - Memanggil komponen Edit Text dengan ID dan diberi nama variabel "inputNama"
- val inputKelas = findViewById<EditText>(R.id.etKelas) 
  - Memanggil komponen Edit Text dengan ID dan diberi nama variabel "inputKelas"
- val tvTampil = findViewById<TextView>(R.id.tvHasil) 
  - Memanggil komponen TextView dengan ID dan diberi nama variabel "tvTampil"
- val btnTampil = findViewById<Button>(R.id.btnTampilkan) 
  - Memanggil komponen Button dengan ID dan diberi nama variabel "btnTampil"
### Function Button
- btnTampil.setOnClickListener {...} 
  - Membuat function ketika button "btnTampil" di klik
- val Nama = inputNama.text.toString() 
  - Membuat variable nama dan value nya diambil dari text inputNama yang tipe datanya telah diubah ke string
- val Kelas = inputKelas.text.toString() 
  - Membuat variable kelas dan value nya diambil dari text inputKelas yang tipe datanya telah diubah ke string
- val hasil = "Nama : ${Nama}\nKelas : ${Kelas}" tvTampil.text = hasil 
  - Membuat variable kelas dengan text Nama yang diambil dari varieble "Nama", dan Kelas dari variable "Kelas". Kemudian variable hasil akan ditampilkan dengan Text n       View tvTampil

## 📸 Screenshot
  ![splashcollab](https://github.com/user-attachments/assets/516dc0db-4eaf-443d-afa6-b96d44d0d40b)
  ![homecollab](https://github.com/user-attachments/assets/38abf3b5-8f50-4b1c-b84f-4ebdce997aaf)

