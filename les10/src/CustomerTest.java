/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Administrator
 */
public class CustomerTest {

    public static void main(String args[]) {
        Customer c = new Customer("paco", "direccion", "telefono");
        Customer c1 = new Customer("pepe", "direccion2", "telefono2", "email@gmail.com");
        c1.displayInformation();
        c.displayInformation();


    }
}
