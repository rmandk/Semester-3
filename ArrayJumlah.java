
import java.util.Scanner;

public class ArrayJumlah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        System.out.println("Jumlah total nilai adalah: " + total);
    }
}
