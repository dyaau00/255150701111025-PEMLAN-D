import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int year, int month, int day, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(year, month, day);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lamaBekerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        if (lamaBekerja >= 0 && lamaBekerja <= 5) {
            return 0.05 * gaji;
        } else if 
            (lamaBekerja >= 6 && lamaBekerja <= 10) {
                return 0.10 * gaji;
            } else {
                return 0.15 * gaji;
            }
        }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
        "Tahun Masuk        : " + tahunMasuk.getDayOfMonth() + " " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\n" +
        "Jumlah Anak        : " + jumlahAnak + "\n" +
        "Gaji               : " + gaji;
    }

    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public LocalDate geTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public int geJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
}