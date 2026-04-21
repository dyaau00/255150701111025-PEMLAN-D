package tugasLaprak;
public class Employee implements Payable {
    private String name;
    private double salary;
    private int registrationNumber;
    private Invoice[] invoices;

    public Employee(String name, double salary, int registrationNumber, Invoice[] invoices) {
        this.name = name;
        this.salary = salary;
        this.registrationNumber = registrationNumber;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalHutang = 0;
        for (Invoice inv : invoices) {
            totalHutang += inv.getPayableAmount();
        }
        return salary - totalHutang;
    }

    public void displayEmployeeInfo() {
        System.out.println("\n========== DATA KARYAWAN ==========");
        System.out.println("No Registrasi : " + registrationNumber);
        System.out.println("Nama Karyawan : " + name);
        System.out.println("Gaji Pokok    : " + salary);
        System.out.println("-----------------------------------");
        System.out.println("Detail Belanja Koperasi:");
        for (Invoice inv : invoices) {
            inv.displayInvoice();
        }
        System.out.println("-----------------------------------");
        System.out.println("Gaji Akhir (Setelah Potongan): " + getPayableAmount());
        System.out.println("====================================");
    }
}