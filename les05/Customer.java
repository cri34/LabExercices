public class Customer {
   private int customerID=0;
    private char status='N';
    private double totalPurchases=0.0;
   public void displayCustomerInfo(){
       System.out.println("customerID  " + customerID);
       System.out.println("status  " +status );
       System.out.println("totalPurchases  " +totalPurchases );
   }
}
