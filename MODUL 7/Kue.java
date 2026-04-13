public abstract class Kue {
    private String nama;
    public double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
            return nama;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return String.format (
            "Nama Kue               : %s\n" +
            "Harga                  : Rp%.1f",
            this.nama,
            hitungHarga()
        );
    }
}