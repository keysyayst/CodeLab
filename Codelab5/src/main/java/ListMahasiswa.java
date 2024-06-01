import java.util.ArrayList;
import java.util.Scanner;

public class ListMahasiswa {
    public static void main(String[] args) {
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        while (true) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String namaInput = scanner.nextLine();
            if (namaInput.trim().isEmpty()) {
                try {
                    throw new IllegalArgumentException("Nama tidak boleh kosong!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }
            if (namaInput.equalsIgnoreCase("selesai")){
                break;

            }

            namaMahasiswa.add(namaInput);
            i++;
        }

        System.out.println("\nDaftar mahasiswa yang diinputkan:");
        for (String nama : namaMahasiswa) {
            System.out.println(nama);
        }
    }
}
