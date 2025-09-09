
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JenisKunciPerkakas {

    public static void main(String[] args) {
        ArrayList<String> daftarKunci = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Tools");
            System.out.println("2. Hapus Tools");
            System.out.println("3. Tampilkan Semua Jenis ");
            System.out.println("4. Simpan dan buat file");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jenis kunci yang ingin ditambahkan: ");
                    String tambah = scanner.nextLine();
                    daftarKunci.add(tambah);
                    System.out.println("Jenis kunci berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.print("Masukkan jenis kunci yang ingin dihapus: ");
                    String hapus = scanner.nextLine();
                    if (daftarKunci.remove(hapus)) {
                        System.out.println("Jenis kunci berhasil dihapus.");
                    } else {
                        System.out.println("Jenis kunci tidak ditemukan.");
                    }
                    break;
                case 3:
                    System.out.println("\nDaftar Jenis Kunci:");
                    for (String kunci : daftarKunci) {
                        System.out.println("- " + kunci);
                    }
                    break;
                case 4:
                    try (FileWriter writer = new FileWriter("jenis jenis kunci.txt")) {
                        for (String kunci : daftarKunci) {
                            writer.write(kunci + "\n");
                        }
                        System.out.println("Data berhasil disimpan ke file.");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat menyimpan file: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}
