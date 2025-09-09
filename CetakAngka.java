
public class CetakAngka extends Thread {

    private int angka;

    public CetakAngka(int angka) {
        this.angka = angka;
    }

    @Override
    public void run() {
        for (int i = 1; i <= angka; i++) {
            System.out.println(Thread.currentThread().getName() + " mencetak: " + i);
            try {
                Thread.sleep(500); // jeda 0.5 detik
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu.");
            }
        }
    
}
