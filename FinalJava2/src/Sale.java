public class Sale{
        private Customer customer;
        private String date;
        private double serviceExpense;
        private double productExpense;
        public Sale(Customer customer, String date) {
            this.customer = customer;
            this.date = date;
        }
        public double getServiceExpense() {
            return serviceExpense;
        }
        public void setServiceExpense(double serviceExpense) {
            this.serviceExpense = serviceExpense;
        }
        public double getProductExpense() {
            return productExpense;
        }
        public void setProductExpense(double productExpense) {
            this.productExpense = productExpense;
        }
        public void displayInfo() {
            System.out.println("================Expense Info================");
            System.out.println("Date: " + date);
            System.out.println("Name: " + customer.getName());
            System.out.println("Membership: " + customer.getType());
            System.out.println("Expense on service: $" + serviceExpense);
            System.out.println("Expense on Product: $" + productExpense);
            System.out.println("Discount: $" + getTotalDiscount());
            System.out.println("Total: $" + getTotalBill());
        }
        public double getServiceDiscount() {
            return serviceExpense * customer.getServiceDiscountRate(customer.getType());
        }
        public double getProductDiscount() {
            return productExpense * customer.getProductDiscountRate(customer.getType());
        }
        public double getTotalDiscount() {
            return getServiceDiscount() + getProductDiscount();
        }
        public double getTotalBill() {
            return serviceExpense + productExpense - getTotalDiscount();
        }
        public Customer getCustomer() {
            return customer;
        }
        public void setCustomer(Customer customer) {
            this.customer = customer;
        }
        public String getDate() {
            return date;
        }
        public void setDate(String date) {
            this.date = date;
        }
}
