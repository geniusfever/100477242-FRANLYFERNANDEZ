import java.lang.reflect.Array;
import java.security.Principal;

public class GuessingGame {

    public boolean isNumeric(String str){ // COMPROBAR SI EL ARGUMENTO ES UN NUMERO O UN STRING.
        try{
            int value = Integer.valueOf(str);
            return true;
        }
        catch (NumberFormatException error){
            return false;
        }
    }
    public static void main(String[] args) {
        if(args.length == 1){
            GuessingGame myGuess = new GuessingGame();

            if(myGuess.isNumeric(args[0])){
                if((Integer.valueOf(args[0]) >= 1) && (Integer.valueOf(args[0]) <= 5)){
                    int randomNumber = ((int)(Math.random() * 5) + 1);
                    if(Integer.valueOf(args[0]) == randomNumber){
                        System.out.println("\nFelicidades!! Ha acertado el numero.");
                    }
                    else{
                        System.out.println("\nTe equivocaste!! Intenta denuevo.");
                        System.out.println("\nEl numero generado fue: " + randomNumber);
                    }
                }
                else{
                    System.out.println("\nERROR!! Debe introducir un numero mayor o igual a 1 y menor o igual a 5.");
                }
            }
            else if(args[0].equals("help")){
                System.out.println("\n\n\n************************** INSTRUCCIONES **************************");
                System.out.println("\nPrimero: Agregar un numero entre 0 y 6.");
                System.out.println("\nSegundo: Comprobar si el numero coincide.");
            }
            else{
                System.out.println("\nSolo puede agregar numeros mayores o iguales a 1 y menores o iguales a 5 y/0 "
                                    + "la palabra reservada \"help\"");
            }
        }
        else{
            System.out.println("\nDebe agregar un rango valido de argumentos.");
        }
    }
}