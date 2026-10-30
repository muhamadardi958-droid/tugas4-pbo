
package Praktikum4;
import java.util.Scanner;
public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Punya kartu member? (ya/tidak): ");
        String member = input.next();

        System.out.print("Total belanja: Rp");
        double belanja = input.nextDouble();

        double diskon = 0;

        if (member.equalsIgnoreCase("ya")) {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else if (member.equalsIgnoreCase("tidak")) {
            if (belanja > 100000) {
                diskon = 10000;
            }
        } else {
            System.out.println("Status member tidak valid!");
            return;
        }

        double totalBayar = belanja - diskon;

        System.out.println("\n=== STRUK KASIR ===");
        System.out.println("Total Belanja: Rp" + belanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + totalBayar);

        System.out.print("Uang pembayaran: Rp");
        double uang = input.nextDouble();

        if (uang >= totalBayar) {
            System.out.println("Kembalian: Rp" + (uang - totalBayar));
        } else {
            System.out.println("Uang kurang: Rp" + (totalBayar - uang));
        }
    }
}
