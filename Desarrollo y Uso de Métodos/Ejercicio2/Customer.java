public class Customer {
    private int ID;
    private String name;
    private String address;
    private float phoneNumber;
    private String email;

    public void setCustomerInfo(int parID, String parName, String parAddress, float parPhoneNumber){
        this.ID = parID;
        this.name = parName;
        this.address = parAddress;
        this.phoneNumber = parPhoneNumber;
    }

    public void setCustomerInfo(int parID, String parName, String parAddress, float parPhoneNumber, String parEmail){
        this.ID = parID;
        this.name = parName;
        this.address = parAddress;
        this.phoneNumber = parPhoneNumber;
        this.email = parEmail;
    }

    public void displayCustomerInfo1(){
        System.out.println("\n---------------------------");
        System.out.println("ID del Cliente: " + this.ID);
        System.out.println("Nombre: " + this.name);
        System.out.println("Direccion: " + this.address);
        System.out.println("Contacto: " + this.phoneNumber);
        System.out.println("---------------------------\n");
    }

    public void displayCustomerInfo2(){
        System.out.println("ID del Cliente: " + this.ID);
        System.out.println("Nombre: " + this.name);
        System.out.println("Direccion: " + this.address);
        System.out.println("Contacto: " + this.phoneNumber);
        System.out.println("Correo: " + this.email);
        System.out.println("---------------------------\n");
    }
}