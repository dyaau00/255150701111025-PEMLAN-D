public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        String prodiCode = nim.substring(6, 7);
        String prodi = switch (prodiCode) {
            case "2" -> "Teknik Informatika";
            case "3" -> "Teknik Komputer";
            case "4" -> "Sistem Informasi";
            case "5" -> "Teknologi Informasi";
            case "6" -> "Pendidikan Teknologi Informasi";
            default -> "Unknown";
        };
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) return 75.0;
        if (ipk >= 3.0) return 50.0;
        return 0.0;
    }

    @Override
    public double getPendapatan()  {
        return super.getPendapatan() +  getBeasiswa();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Nim                : " + nim + "\n" +
        "Ipk                : " + ipk + "\n" +
        "Status             : " + getStatus();
    }
}