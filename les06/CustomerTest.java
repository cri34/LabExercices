public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1,cust2;
        cust1=new Customer();
        cust2=new Customer();

        cust1.customerID=1;
        cust1.name="paco";
        cust1.emailAddress="algo@gmail.com";

        cust2.customerID=2;
        cust2.name="pepe";
        cust2.emailAddress="algo2@gmail.com";

        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
        cust1=cust2;
        cust2.customerID=3;
        cust1.displayCustomerInfo();


    }
}
