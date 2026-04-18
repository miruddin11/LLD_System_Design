package SolidPrinciples.SRP.BadCode;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional functionality
    public void generateInvoice() {
        System.out.println("Invoice generated & Printed for amount :" + amount);
    }

    public void saveToDatabase() {
        System.out.println("saving Invoice to Database");
    }

    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice ");
    }
}
