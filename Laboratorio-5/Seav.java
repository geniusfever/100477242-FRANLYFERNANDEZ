public class Seav implements Semaforo{
    private String color, productType;
    private int isGreen, isYellow, isRed, nRand, iterator;

    public void setColor(String parProductType){
        productType = parProductType;
        iterator = (int) Math.round(Math.random()*49); //Numero Random del 0 al 49.

        for(int i=0; i<iterator; i++){
            nRand = (int) Math.round(Math.random()*2); //Numero Random del 0 al 2.

            switch(nRand){
                case 0:
                    color = "Verde";
                    isGreen++;
                    break;
                case 1:
                    color = "Amarillo";
                    isYellow++;
                    break;
                case 2:
                    color = "Rojo";
                    isRed++;
                    break;
            }
        }
    }

    public void displayState(){
        System.out.println("-----------------------------------");
        System.out.println("Tipo de producto: " + productType);
        System.out.println("Color del Semaforo: " + color);
        System.out.println("Veces que ha cambiado a Verde: " + isGreen);
        System.out.println("Veces que ha cambiado a Amarillo: " + isYellow);
        System.out.println("Veces que ha cambiado a Rojo: " + isRed);
        System.out.println("-----------------------------------");
    }
}