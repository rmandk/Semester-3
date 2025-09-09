
import java.util.Scanner;

interface Pembelian {

    void prosesPembelian(int jumlah) throws IllegalArgumentException;
}

abstract class Tiket {

    protected String jenis;
    protected int harga;

    public Tiket(String jenis, int harga) {
        this.jenis = jenis;
        this.harga = harga;
    }

    public abstract void tampilInfo();
}

// Subclass Tiket Ekonomi
class TiketEkonomi extends Tiket implements Pembelian {

    public TiketEkonomi() {
        super("Ekonomi", 50000);
    }

    @Override
    public void tampilInfo() {
        System.out.println("Tiket Ekonomi - Harga: Rp " + harga);
    }

    @Override
    public void prosesPembelian(int jumlah) throws IllegalArgumentException {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah tiket harus lebih dari 0.");
        }
        int total = harga * jumlah;
        System.out.println("Total bayar untuk Tiket Ekonomi: Rp " + total);
    }
}

// Subclass Tiket VIP
class TiketVIP extends Tiket implements Pembelian {

    public TiketVIP() {
        super("VIP", 100000);
    }

    @Override
    public void tampilInfo() {
        System.out.println("Tiket VIP - Harga: Rp " + harga);
    }

    @Override
    public void prosesPembelian(int jumlah) throws IllegalArgumentException {
        if (jumlah <= 0) {
            throw new IllegalArgumentException("Jumlah tiket harus lebih dari 0.");
        }
        int total = harga * jumlah;
        System.out.println("Total bayar untuk Tiket VIP: Rp " + total);
    }
}

// Pengetesan Hasil Akhir
public class PembelianTiketStadion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tiket tiket = null;

        System.out.println("=== Sistem Pembelian Tiket Stadion ===");
        System.out.println("1. Tiket Ekonomi");
        System.out.println("2. Tiket VIP");
        System.out.print("Pilih jenis tiket (1/2): ");

        try {
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tiket = new TiketEkonomi();
                    break;
                case 2:
                    tiket = new TiketVIP();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    return;
            }

            tiket.tampilInfo();
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlah = scanner.nextInt();

            if (tiket instanceof Pembelian) {
                ((Pembelian) tiket).prosesPembelian(jumlah);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi error: Input tidak valid.");
        } finally {
            System.out.println("Terima kasih telah menggunakan sistem.");
            scanner.close();
        }
    }
}
