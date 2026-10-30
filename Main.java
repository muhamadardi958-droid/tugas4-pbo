
package Praktikum4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        System.out.println("NOMOR 1");
        Scanner s = new Scanner(System.in);
        No1 o = new No1();

        System.out.print("Masukkan angka: ");
        o.angka = s.nextInt();

        if (o.angka % 2 == 1) {
            System.out.println("Ganjil");
        } else {
            System.out.println("Genap");
        }

        
        System.out.println("\n NOMOR 2");
        Hari.main(args);
       
        System.out.println("\n NOMOR 3");
        Gaji.main(args);

        System.out.println("\n NOMOR 4 ");
        kabisat.main(args);
        
        System.out.println("\n NOMOR 5");
        Perusahaan.main(args);
       
        System.out.println("\n NOMOR 6");
        Kasir.main(args);
        
        System.out.println("\n NOMOR 7");
        Hitung.main(args);

    }
}
