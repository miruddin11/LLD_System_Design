package SolidPrinciples.SRP.GoodCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional functionality
    public void generateInvoice() {
        System.out.println("Invoice generated & Printed for amount :" + amount);
    }
}
