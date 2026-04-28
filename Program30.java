interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String name, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: " + amount);
    }

    public void generateInvoice(String name, double amount) {
        System.out.println("Invoice for " + name + ": " + amount);
    }

    void showSummary() {
        System.out.println("Operations completed successfully");
    }
}

public class Program30 {
    public static void main(String[] args) {
        CommercialExecutive obj = new CommercialExecutive();

        obj.processSale(5000);
        obj.generateInvoice("ClientA", 5000);
        obj.showSummary();
    }
}