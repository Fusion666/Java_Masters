public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56667", 300, "Tinka", "tinka@mail.com", "359 666 111");
        System.out.println("Empty constructor called.");
    }

    public BankAccount(String number, double balance, String customerName, String email, String customerPhoneNumber) {
        this.accountNumber = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public BankAccount(String customerName, String email, String customerPhoneNumber) {
        this("99999", 2345.66,customerName,email, customerPhoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public double deposit(double depositSum) {
        this.balance += depositSum;
        return balance;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public double withdrawal(double withdrawal) {
        if((balance - withdrawal) < 0) {
            System.out.println("You can not withdrawal more than what you currently have in your balance");
            System.out.println("You currently have: " + balance);
            System.out.println("You are trying to withdrawal: " + withdrawal);
        }
        else {
            this.balance -= withdrawal;
        }
        return balance;
    }
}
