public class Sees implements Semaforo{
    private String color, productType;
    private int nChanges, nRand, iterator;

    public void setColor(String parProductType){

        productType = parProductType;
        iterator = (int) Math.round(Math.random()*49); //Numero Random del 0 al 49.

        for(int i=0; i<iterator; i++){
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

            nChanges++;
        }
    }

    public void displayState(){
        System.out.println("-----------------------------------");
        System.out.println("Tipo de producto: " + productType);
        System.out.println("Color del Semaforo: " + color);
        System.out.println("Veces que ha cambiado: " + nChanges);
        System.out.println("-----------------------------------");
    }
}