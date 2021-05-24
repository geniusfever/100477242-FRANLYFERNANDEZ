public class TestJava{
    public static void main(String args[]) {
        Semaforo MySemaforo; //Variable de referencia del tipo de la interface Semaforo.

        if(args.length>0){
            switch(args[0]){
                case "SEBA" :
                    MySemaforo = new Seba();
                    MySemaforo.setColor(args[0]);
                    MySemaforo.displayState();
                    break;
                case "SEES" :
                    MySemaforo = new Sees();
                    MySemaforo.setColor(args[0]);
                    MySemaforo.displayState();
                    break;
                case "SEAV" :
                    MySemaforo = new Seav();
                    MySemaforo.setColor(args[0]);
                    MySemaforo.displayState();
                    break;
            }
        }
        else {
            System.out.println("¡ERROR! No selecciono ningun Semaforo.");
        }
    }
}