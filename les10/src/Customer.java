public class Customer {
    private int customerID = 0;
    private static int currentID = 0;
    private String name = "-name required-";
    private String address = "-address requiried-";
    private String phoneNumber = "-phone requiried";
    private String eMail = "-eMail optional";

    Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        customerID = currentID++;

    }

    Customer(String name, String address, String phoneNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        customerID = currentID++;

    }
    public void displayInformation(){
        System.out.println("client id = "+customerID);
        System.out.println("client name = "+name);
        System.out.println("client address = "+address);
        System.out.println("client phone = "+phoneNumber);
        System.out.println("client eMail = "+eMail);
    }
}
