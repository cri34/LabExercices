public class Shirt {

    private char colorCode;
    private String description;
    private double price;
    private int quantityInStock;
    public static int lastShirtID=0;
    private int shirtID;

    public Shirt(){
        this.colorCode='R';
        this.description="is a th";
        this.price=35.6;
        this.quantityInStock=3;
        calculateID();
    }
    private void calculateID(){
        shirtID=lastShirtID++;
    }

    public void displayInformation() {
        System.out.println("colorCode : " + colorCode);
        System.out.println("description : " +description);
        System.out.println("price : " +price);
        System.out.println("quantityInStock : " +quantityInStock);
        System.out.println("shirtID : " +shirtID);
    }
}
