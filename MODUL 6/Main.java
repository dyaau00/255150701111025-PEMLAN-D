public class Main {
    public static void main(String[] args) {
        
        // 1. Test Case Manusia
        System.out.println("=== 1. TEST CASE MANUSIA ===");
        Manusia m1 = new Manusia("Doni Adalah Laki-laki Menikah", "3510001", true, true);
        System.out.println(m1 + "\n");

        Manusia m2 = new Manusia("Sinta Adalah Perempuan Menikah", "3510002", false, true);
        System.out.println(m2 + "\n");

        Manusia m3 = new Manusia("Adit Belum Menikah", "3510003", true, false);
        System.out.println(m3 + "\n---");

        Manusia m4 = new Manusia("Linda Belum Menikah", "3510004", false, false);
        System.out.println(m4 + "\n---");

        // 2. Test Case Mahasiswa FILKOM 
        System.out.println("\n=== 2. TEST CASE MAHASISWA FILKOM ===");
        MahasiswaFILKOM mhs = new MahasiswaFILKOM("165150200111101", 3.8, "Irfan", "3510004", true, false); // [cite: 259]
        System.out.println(mhs + "\n---");

        // 3. Test Case Pekerja 
        System.out.println("\n=== 3. TEST CASE PEKERJA ===");
        Pekerja p1 = new Pekerja(1000, 2006, 1, 1, 10, "Budi", "3510005", true, true);
        System.out.println(p1 + "\n---");

        // 4. Test Case Manager 
        System.out.println("\n=== 4. TEST CASE MANAGER ===");
        Manager mgr = new Manager("HRD", 7500, 2011, 1, 1, 0, "Siti", "3510006", false, true);
        System.out.println(mgr);
    }
}