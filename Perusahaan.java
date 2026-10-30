
package Praktikum4;
import java.util.Scanner;
public class Perusahaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama salesman: ");
        String nama = input.nextLine();

        System.out.print("Total penjualan: Rp");
        double penjualan = input.nextDouble();

        double jasa;
        double komisi;

        if (penjualan <= 2000000) {
            jasa = 0;
            komisi = penjualan * 0.10;
        } else if (penjualan <= 5000000) {
            jasa = 200000;
            komisi = penjualan * 0.15;
        } else {
            jasa = 300000;
            komisi = penjualan * 0.20;
        }

        System.out.println("\n=== PENDAPATAN SALESMAN ===");
        System.out.println("Nama: " + nama);
        System.out.println("Penjualan: Rp" + penjualan);
        System.out.println("Uang Jasa: Rp" + jasa);
        System.out.println("Uang Komisi: Rp" + komisi);
        System.out.println("Total Pendapatan: Rp" + (jasa + komisi));
    }
}
