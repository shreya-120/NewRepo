public class Bank_Transaction extends BankCustomer {
    String accountType;
    String accountNumber;
    String accountHolder;
    String accountName;
    double balance;

    Bank_Transaction(int cust_id, String cust_name, String cust_address, String accountHolder, String accountName,
            String accountType, String accountNumber, double balance) {
        super(cust_id, cust_name, cust_address);
        System.out.println("Account Details \n Account Holder : " + accountHolder + "\nAccount Name : " + accountName
                + "\nAccount Type : " + accountType + "\nAccount Number : " + accountNumber + "\nBalance : " + balance);
    }

    public static void main(String[] args) {
        Bank_Transaction bt = new Bank_Transaction(101, "Yasee", "Hubli", "Yasee", "Savings Account", "Savings",
                "374302010917", 27000.00);

    }
}