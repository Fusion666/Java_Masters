public class Main {
    public static void main(String[] args) {
//        BankAccount simeonAccount = new BankAccount();
//        simeonAccount.setAccountNumber("123456789");
//        simeonAccount.setBalance(375.90);
//        System.out.println("The amount of cash in your bank account is: " + simeonAccount.deposit(987.89));
//        System.out.println("The amount of cash in your bank account is: " + simeonAccount.withdrawal(55.44));

//        BankAccount milenAccount = new BankAccount();
//        simeonAccount.setAccountNumber("123456789");
//        simeonAccount.setBalance(375.90);
//        System.out.println("The amount of cash in your bank account is: " + milenAccount.deposit(987.89));
//        System.out.println("The amount of cash in your bank account is: " + milenAccount.withdrawal(9955.44));

//        BankAccount bobsAccount = new BankAccount();//("123456", 232.34, "Bob Ross", "myemail@bobross.com",
//                //"089-777-111");
//          //bobsAccount.setBalance(175.90);
//          System.out.println("The amount of cash in your bank account is: " + bobsAccount.deposit(987.89));
//          System.out.println("The amount of cash in your bank account is: " + bobsAccount.withdrawal(55.44));
//        System.out.println(bobsAccount.getCustomerPhoneNumber());

        VipCustomer Ania = new VipCustomer("Ania", 2000.99, "ania@mail.com");
        System.out.println(Ania.getName());
        System.out.println(Ania.getCreditLimit());
        System.out.println(Ania.getEmail());

        VipCustomer Hana = new VipCustomer("Hanna",3000.99);
        System.out.println(Hana.getName());
        System.out.println(Hana.getCreditLimit());
        System.out.println(Hana.getEmail());

        VipCustomer alexandra = new VipCustomer();
        System.out.println(alexandra.getName());
        System.out.println(alexandra.getCreditLimit());
        System.out.println(alexandra.getEmail());
    }
}
