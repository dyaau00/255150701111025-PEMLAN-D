public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int year, int month, int day, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, year, month, day, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    @Override
    public double getPendapatan(){
        return super.getPendapatan() + (0.10 * getGaji());
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
        "Departemen         : " + departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen  = departemen;
    }
}