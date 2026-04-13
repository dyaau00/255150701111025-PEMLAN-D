// interface bisa diimplementasikan oleh banyak class, keyword nya "implements", interface kalo bisa beda file
// abstract class hanya bisa di extend oleh satu class
// abstract harus di override, interface tidak harus di override

public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Kue Lapis", 50000, 0.5);
        daftarKue[1] = new KuePesanan("Kue Cubit", 20000, 0.25);
        daftarKue[2] = new KueJadi("Brownies", 30000, 2);
        daftarKue[3] = new KueJadi("Donat", 15000, 3);
        daftarKue[4] = new KueJadi("Dubai Chewy Cookie", 35000, 3);
        daftarKue[5] = new KuePesanan("Bika Ambon", 65000, 0.8);
        daftarKue[6] = new KueJadi("Roti Buaya", 150000, 1);
        daftarKue[7] = new KuePesanan("Kue Lumpur", 25000, 0.4);
        daftarKue[8] = new KueJadi("Klepon", 10000, 10);
        daftarKue[9] = new KuePesanan("Lapis Legit", 120000, 1.0);
        daftarKue[10] = new KueJadi("Risoles Mayo", 5000, 5);
        daftarKue[11] = new KuePesanan("Black Forest", 180000, 1.5);
        daftarKue[12] = new KueJadi("Pastel", 4000, 10);
        daftarKue[13] = new KuePesanan("Red Velvet", 150000, 1.2);
        daftarKue[14] = new KueJadi("Nagasari", 3000, 8);
        daftarKue[15] = new KuePesanan("Tiramisu", 45000, 0.6);
        daftarKue[16] = new KueJadi("Dadargulung", 3500, 12);
        daftarKue[17] = new KuePesanan("Cheesecake", 200000, 1.0);
        daftarKue[18] = new KueJadi("Onde-onde", 2500, 15);
        daftarKue[19] = new KuePesanan("Kue Cucur", 15000, 0.3);

        for (int i = 0; i < daftarKue.length; i++) {
            if (daftarKue[i] != null) {
                System.out.println(daftarKue[i].toString());
                System.out.println();
            }
        }
        
        // 3a. Tampilkan semua kue dan jenis kuenya
        System.out.println("=== SEMUA KUE ===");
        for (Kue k : daftarKue) {
            if (k != null) { // Cek agar tidak error jika array belum penuh
                String jenis = (k instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
                System.out.println(k.toString() + "\nJenis                  : " + jenis + "\n");
            }
        }

        // 3b. Hitung total harga dari semua jenis kue
        double totalHargaSemua = 0;
        for (Kue k : daftarKue) {
            if (k != null) totalHargaSemua += k.hitungHarga();
        }
        System.out.println("Total Harga Semua      : " + totalHargaSemua);

        // 3c. Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        for (Kue k : daftarKue) {
            if (k instanceof KuePesanan) {
                totalHargaPesanan += k.hitungHarga();
                // Downcasting untuk ambil berat
                totalBeratPesanan += ((KuePesanan) k).getBerat(); 
                System.out.println("Total Harga Kue Pesanan     : " + totalHargaPesanan);
                System.out.println("Total Berat Kue Pesanan     : " + totalBeratPesanan);
            System.out.println();
            }
        }

        // 3d. Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        for (Kue k : daftarKue) {
            if (k instanceof KueJadi) {
                totalHargaJadi += k.hitungHarga();
                // Downcasting untuk mengambil atribut 'jumlah'
                totalJumlahJadi += ((KueJadi) k).getJumlah(); 
            }
        }
        System.out.println("Total Harga Kue Jadi   : " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi  : " + totalJumlahJadi);
        System.out.println();

        // 3e. Tampilkan informasi kue dengan harga terbesar
        Kue kueTermahal = daftarKue[0];
        for (Kue k : daftarKue) {
            if (k != null && k.hitungHarga() > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }
        System.out.println("Kue Termahal: \n" + kueTermahal.toString());
    }
}