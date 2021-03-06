public class Shirt {

  public int shirtID = 0; // Default ID for the shirt
  public String description = "-description required-"; // default

  // The color codes are R=Red, B=Blue, G=Green, U=Unset
  public char colorCode = 'U';
  public double price = 0.0; // Default price for all shirts
  public int quantityInStock = 0; // Default quantity for all shirts

  public Shirt() {
  }

  public Shirt(int ID, String d, char c, double p, int q) {
    shirtID = ID;
    description = d;
    colorCode = c;
    price = p;
    quantityInStock = q;
  }

  // This method displays the values for an item
  public void displayInformation() {
    System.out.println("******SHIRT INFORMATION******");
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: " + price);
    System.out.println("Quantity in stock: " + quantityInStock);
    System.out.println("*****************************");

  } // end of display method
} // end of class



