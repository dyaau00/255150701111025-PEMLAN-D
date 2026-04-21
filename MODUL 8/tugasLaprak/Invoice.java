package tugasLaprak;
public class Invoice implements Payable {
    private String productName;
    private int quantity;
    private double pricePerItem;

    public Invoice(String productName, int quantity, double pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double getPayableAmount() {
        return quantity * pricePerItem;
     }
    
     public void displayInvoice() {
        System.out.println("- " + productName + " | Qty: " + quantity + " | Harga/Item: " + pricePerItem);
    }
}