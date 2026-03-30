import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CVLabKomdas lab = new CVLabKomdas();

        System.out.println("========================================");
        System.out.println("      CV. LABKOMDAS - Penjualan Jaket   ");
        System.out.println("========================================");
        System.out.println("Harga Satuan (Normal):");
        System.out.println("Jaket A : Rp 100.000");
        System.out.println("Jaket B : Rp 125.000");
        System.out.println("Jaket C : Rp 175.000");
        System.out.println("Catatan : Diskon berlaku jika beli > 100 buah");
        System.out.println("Jaket A : Rp 95.000 / biji");
        System.out.println("Jaket B : Rp 120.000 / biji");
        System.out.println("Jaket C : Rp 160.000 / biji");
        System.out.println("========================================\n");

        System.out.print("Masukkan jumlah Jaket A yang dibeli : ");
        int qA = in.nextInt();
        System.out.print("Masukkan jumlah Jaket B yang dibeli : ");
        int qB = in.nextInt();
        System.out.print("Masukkan jumlah Jaket C yang dibeli : ");
        int qC = in.nextInt();

        lab.cetakStruk(qA, qB, qC);
    }
}