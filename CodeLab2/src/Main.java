import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    scanner.nextLine();
                    String namaMhs = scanner.nextLine();
                    System.out.print("Masukkan NIM mahasiswa: ");
                    String nimMhs = scanner.nextLine();
                    while (nimMhs.length() != 15) {
                        System.out.println("Nim Harus 15 Digit!!");
                        System.out.print("Masukkan NIM mahasiswa: ");
                        nimMhs = scanner.nextLine();
                    }
                    System.out.print("Masukkan jurusan mahasiswa: ");
                    String jurusanMhs = scanner.nextLine();
                    Mahasiswa.tambahDataMahasiswa(namaMhs, nimMhs, jurusanMhs);
                    break;
                case 2:
                    Mahasiswa.tampilkanDataMahasiswa();
                    break;
                case 3:
                    System.out.println("Exit: Close Program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid.");
            }
        }
    }
}