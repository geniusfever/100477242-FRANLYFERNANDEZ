public class Seba implements Semaforo {
    private String color, productType;
    private int nRand;

    public void setColor(String parProductType){

        productType = parProductType;
        nRand = (int) Math.round(Math.random()*2); //Numero Random del 0 al 2.

        switch(nRand){
            case 0:
                color = "Verde";
                break;
            case 1:
                color = "Amarillo";
                break;
            case 2:
                color = "Rojo";
                break;
        }
    }

    public void displayState(){
        System.out.println("-----------------------------------");
        System.out.println("Tipo de producto: " + productType);
        System.out.println("Color del Semaforo: " + color);
        System.out.println("-----------------------------------");
    }
}