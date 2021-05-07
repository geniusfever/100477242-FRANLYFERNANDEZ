public class OrderTest {
    public static void main (String args[]) {
        double totalCost = 0.0;

        Order myOrder = new Order();
        Shirt myShirt = new Shirt();
        Shirt myShirt2 = new Shirt();
        Shirt myShirt3 = new Shirt();

        myShirt2.price = 25.10;
        myShirt3.price = 10.12;

        myOrder.addShirt(myShirt);
        myOrder.addShirt(myShirt2);
        myOrder.addShirt(myShirt3);

        totalCost = myOrder.totalPrice;
        System.out.println("El monto total de la orden es: " + totalCost);
    }
}