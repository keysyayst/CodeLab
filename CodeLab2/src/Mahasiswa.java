import java.util.ArrayList;

// Class Mahasiswa berfungsi sebagai blueprint/template untuk membuat objek/instansiasi mahasiswa
public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    // Code untuk membuat objek mahasiswa
    Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    //Method untuk menampilkan universitas
    static String tampilUniversitas(){
        return "Universitas Muhammadiyah Malang";
    }

    // Method untuk menampilkan data mahasiswa
    public static void tampilkanDataMahasiswa() {
        System.out.println("Data Mahasiswa:");
        System.out.println("Universitas: " + Mahasiswa.tampilUniversitas());
        for (Mahasiswa mhsw : daftarMahasiswa) {
            System.out.println("Nama: " + mhsw.nama + ", NIM: " + mhsw.nim + ", Jurusan: " + mhsw.jurusan);
        }
    }

    // Membuat ArrayList untuk menyimpan objek mahasiswa
    static ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // Method untuk menambahkan data mahasiswa
    public static void tambahDataMahasiswa(String nama, String nim, String jurusan) {
        Mahasiswa mhsBaru = new Mahasiswa(nama, nim, jurusan);
        daftarMahasiswa.add(mhsBaru);
        System.out.println("Data mahasiswa berhasil ditambahkan.");
    }
}