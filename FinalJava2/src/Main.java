public class Main {
    public static void main(String[] args) {
        System.out.println("==============Customer Info==============");
        Customer c2 = new Customer("Sotheavy", "Premium");
        Customer c3 = new Customer("Panha", "Gold");
        Customer c4 = new Customer("Srey oun", "Silver");
        Customer c1 = new Customer("ly nita", "Normal");

        Sale sale_c1 = new Sale(c1, "2024-02-11");
        Sale sale_c2 = new Sale(c2, "2024-01-2");
        Sale sale_c3 = new Sale(c3, "2024-05-13");
        Sale sale_c4 = new Sale(c4, "2024-08-14");

        sale_c1.setProductExpense(100);
        sale_c1.setServiceExpense(100);
        sale_c1.displayInfo();

        sale_c2.setProductExpense(100);
        sale_c2.setServiceExpense(100);
        sale_c2.displayInfo();

        sale_c3.setProductExpense(100);
        sale_c3.setServiceExpense(100);
        sale_c3.displayInfo();

        sale_c4.setProductExpense(100);
        sale_c4.setServiceExpense(100);
        sale_c4.displayInfo();
    }
}
