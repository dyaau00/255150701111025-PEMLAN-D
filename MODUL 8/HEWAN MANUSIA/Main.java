package latihanInterface;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("=== Program Identitas Makhluk Hidup ===");
        // Input untuk Manusia
        System.out.print("Nama Manusia: ");
        String namaSaya = input.nextLine();
        System.out.print("Umur Manusia: ");
        int umurSaya = input.nextInt();
        input.nextLine(); 

        System.out.println("\n--- Output Manusia ---");
        Manusia diah = new Manusia(namaSaya, umurSaya); 
        diah.tampilkanNama();
        diah.tampilkanUmur();
        diah.makan();
        diah.berjalan();
        diah.bersuara();

        System.out.println("\n-----------------------");
        // Input untuk Hewan 
        System.out.print("Nama Hewan: ");
        String namaHewan = input.nextLine();
        System.out.print("Umur Hewan: ");
        int umurHewan = input.nextInt();
        input.nextLine();
        
        System.out.println("\n--- Output Hewan ---");
        Hewan peliharaan = new Hewan(namaHewan, umurHewan);
        peliharaan.tampilkanNama();
        peliharaan.tampilkanUmur();
        peliharaan.makan();
        peliharaan.berjalan();
        peliharaan.bersuara();

        System.out.println("\n=== Menambahkan Objek Baru  ===");
        System.out.print("Nama hewan peliharaan: ");
        String namaHewanBaru = input.nextLine();
        System.out.print("Umur hewan peliharaan: ");
        int umurHewanBaru = input.nextInt();
        input.nextLine();
        MakhlukHidup hewanBaru = new Hewan(namaHewanBaru, umurHewanBaru);

        System.out.println("\n--- Output Objek Baru ---");
        ((Identitas) hewanBaru).tampilkanNama();
        ((Identitas) hewanBaru).tampilkanUmur();
        hewanBaru.makan();
        hewanBaru.berjalan();
        hewanBaru.bersuara();
        input.close();

    // NO 6
    // Manusia diah = new Manusia("Diah", 19); 
    // diah.tampilkanNama();
    // diah.tampilkanUmur();
   }
}