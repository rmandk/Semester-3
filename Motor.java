 // Membuat Class

public class Motor {

    //Memasukan Tipe Data Yang Akan Dipakai
    String Merk;
    int kecepatan;
    //Perintah Untuk Menampilkan Hasil 

    void tampilkanInfo() {
        System.out.println("Merk: " + Merk);
        System.out.println("Kecepatan " + kecepatan + "km/jam");

    }
    // Pengisian Data Untuk tipe data yang akan digunakan 

    public static void main(String[] args) {
        Motor motor1 = new Motor();
        Motor motor2 = new Motor();

        motor1.Merk = "Honda";
        motor1.kecepatan = 160;
        motor2.Merk = "Yamaha";
        motor2.kecepatan = 200;

        // Menampilkan seluruh Hasil 
        motor1.tampilkanInfo();
        System.out.println();

        motor2.tampilkanInfo();
    }
}
