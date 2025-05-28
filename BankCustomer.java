class BankCustomer {
    String cust_name, cust_adress;
    int cust_id;

    BankCustomer(int cust_id, String cust_name, String cust_address) {
        this.cust_name = cust_name;
        this.cust_adress = cust_address;
        this.cust_id = cust_id;
        System.out.println("Customer id :" + cust_id + "\nCustomer name : " + cust_name + "\nCustomer address : " + cust_address+ "\n");
    }
}