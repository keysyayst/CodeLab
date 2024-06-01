import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Nama: ");
        String nama = masukan.nextLine();
        System.out.print("Jenis Kelamin (L/P): ");
        String genderInput = masukan.nextLine();
        System.out.print("Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = masukan.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);
        LocalDate now = LocalDate.now();
        Period umur = Period.between(tanggalLahir, now);

        String gender;
        if (genderInput.equalsIgnoreCase("L")) {
            gender = "Laki-laki";
        } else if (genderInput.equalsIgnoreCase("P")) {
            gender = "Perempuan";
        } else {
            System.out.println("Jenis kelamin tidak valid.");
            return;
        }
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Umur Anda: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan " + umur.getDays() + " hari");
    }
}