public class Manusia {
    private String nama;
    private String nik;
    private boolean jenisKelamin; //true: laki-laki, false: perempuan
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25.0 : 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format(
            "Nama               : %s\n" + 
            "NIK                : %s\n" +
            "Jenis Kelamin      : %s\n" +
            "Pendapatan         : $%.1f",
            this.nama, 
            this.nik,
            (this.jenisKelamin ? "Laki-laki" : "Perempuan"),
            getPendapatan()
        );
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean isMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
}