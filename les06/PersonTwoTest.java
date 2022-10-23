public class PersonTwoTest {
   
  public static void main (String args[]) {
    PersonTwo myPersonTwo = new PersonTwo();
    myPersonTwo.phoneNumber.append("640021715");
    myPersonTwo.name.append("paco");
    myPersonTwo.name.append(" muñoz");
    myPersonTwo.phoneNumber.insert(3,"-");
    myPersonTwo.phoneNumber.insert(7,"-");
    System.out.println("mostrar string de objeto: "+ myPersonTwo.phoneNumber.toString());
    myPersonTwo.displayPersonInfo();
    System.out.println( "largo string: "+myPersonTwo.name.length());
    System.out.println( "capacidad objeto: "+myPersonTwo.name.capacity());

   // myPersonTwo.name.toString();
   // myPersonTwo.displayPersonInfo();

  } 
}
