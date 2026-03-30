public class CVLabKomdas {
    // Harga tetap (final) menggunakan tipe data long agar aman untuk nominal rupiah
    private final long HARGA_A = 100000;
    private final long HARGA_B = 125000;
    private final long HARGA_C = 175000;

    public void cetakStruk(int jumlahA, int jumlahB, int jumlahC) {
        long totalA = hitungHargaA(jumlahA);
        long totalB = hitungHargaB(jumlahB);
        long totalC = hitungHargaC(jumlahC);
        long grandTotal = totalA + totalB + totalC;

        System.out.println("\n========================================");
        System.out.println("            STRUK PEMBELIAN             ");
        System.out.println("========================================");
        
        // Detail Jaket A
        System.out.println("Jaket A : " + jumlahA + " buah");
        if (jumlahA > 100) System.out.println("          [DISKON] Harga: Rp 95.000/biji");
        System.out.println("          Total : Rp " + String.format("%, d", totalA).replace(',', '.'));

        // Detail Jaket B
        System.out.println("Jaket B : " + jumlahB + " buah");
        if (jumlahB > 100) System.out.println("          [DISKON] Harga: Rp 120.000/biji");
        System.out.println("          Total : Rp " + String.format("%, d", totalB).replace(',', '.'));

        // Detail Jaket C
        System.out.println("Jaket C : " + jumlahC + " buah");
        if (jumlahC > 100) System.out.println("          [DISKON] Harga: Rp 160.000/biji");
        System.out.println("          Total : Rp " + String.format("%, d", totalC).replace(',', '.'));

        System.out.println("----------------------------------------");
        System.out.println("GRAND TOTAL    : Rp " + String.format("%, d", grandTotal).replace(',', '.'));
        System.out.println("========================================");
    }

    private long hitungHargaA(int jumlah) {
        if (jumlah > 100) return (long) jumlah * 95000;
        return (long) jumlah * HARGA_A;
    }

    private long hitungHargaB(int jumlah) {
        if (jumlah > 100) return (long) jumlah * 120000;
        return (long) jumlah * HARGA_B;
    }

    private long hitungHargaC(int jumlah) {
        if (jumlah > 100) return (long) jumlah * 160000;
        return (long) jumlah * HARGA_C;
    }
}
