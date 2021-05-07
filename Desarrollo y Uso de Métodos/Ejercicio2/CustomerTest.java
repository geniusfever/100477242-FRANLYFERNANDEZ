public class CustomerTest {

  public static void main (String args[]) {
    Customer myCustomer1 = new Customer();
    Customer myCustomer2 = new Customer();

    myCustomer1.setCustomerInfo(0001, "Franly", "Sin especificar", 8093333333f);
    myCustomer2.setCustomerInfo(0002, "Amelia", "Sin especificar", 8094444444f, "amelianotienecorreo@gmail.com");

    myCustomer1.displayCustomerInfo1();
    myCustomer2.displayCustomerInfo2();
  }
}