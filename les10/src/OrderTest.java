public class OrderTest {
    public static void main(String[] args) {
        Order o = new Order();
        Shirt s= new Shirt();
        Shirt s1= new Shirt();
        s.price=14.99;
        s1.price=2.01;
        double totalCost=0.0;
        o.addShirt(s);
        totalCost=o.addShirt(s1);
        System.out.println(totalCost);

    }
}
