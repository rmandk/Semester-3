// Program Untuk Menampilkan Data Yang Telah dimasukan // Program Output

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Biodata2 {

    public static void main(String[] args) {
        try {
            File file = new File("biodata.txt");
            Scanner reader = new Scanner(file);

            System.out.println("Isi file biodata.txt:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
    }
}
