import java.util.ArrayList;

public class Customer {
    private String name;
    ArrayList<Double> transactions;


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public  Customer (String name, double initialTransactionAmount) {
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransactionAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }
}
