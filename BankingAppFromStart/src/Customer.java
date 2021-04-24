import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>(); // has to be initialized
        addTransaction(initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount); //equal to --> this.transactions.add(Double.valueOf(amount));
    }

    public String getName() {
        return name;
    }
}
