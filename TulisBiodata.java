// Program Untuk Mengisikan Data // Program Input

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TulisBiodata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama   : ");
        String nama = input.nextLine();
        System.out.print("NPM    : ");
        String npm = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();

        try {
            FileWriter fw = new FileWriter("biodata.txt", true); // true untuk append
            fw.write(nama + ", " + npm + ", " + alamat + "\n");
            fw.close();
            System.out.println("Data berhasil disimpan ke biodata.txt");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan data: " + e.getMessage());
        }

        input.close();
    }
}
