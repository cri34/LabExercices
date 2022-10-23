public class Order {
    long orderValue = 0;
    int itemQuantity = 10000000;
    int itemPrice = 555500;

    public void calculateTotal() {
        orderValue=(long)itemQuantity * itemPrice;
        System.out.println("ordervalue : "+orderValue);
    }
}
