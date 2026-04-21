package tugasLaprak;
public class Main {
    public static void main(String[] args) {
        Invoice[] daftarBelanja = {
            new Invoice("Beras 5kg", 2, 75000),
            new Invoice("Minyak Goreng", 3, 20000)
        };

        Employee diah = new Employee("Diah", 5000000, 20260421, daftarBelanja);
        System.out.println("Sistem Penggajian NV. Meneer");
        diah.displayEmployeeInfo();
    }
}