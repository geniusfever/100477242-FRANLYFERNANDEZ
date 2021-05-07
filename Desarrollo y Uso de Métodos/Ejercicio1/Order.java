public class Order {

  public double totalPrice = 0.0; // Default price for order

  public double addShirt (Shirt parMyShirts) {

    totalPrice = totalPrice + parMyShirts.price;

    return totalPrice;
  }
} // end of class