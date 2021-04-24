import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;
    private double initialTransactionAmount;


    public Branch(String nameBranch) {
        this.name = nameBranch;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean isNewCustomer(String customerName, double initialTransactionAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(name, initialTransactionAmount));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomerTransaction (String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer!= null) {
            existingCustomer.addTransaction(amount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.equals(customerName)) {
                return checkedCustomer;
            }

        }
        return null;
    }

}
