public class getException {
    public getException(String [] cadena){
        try{
            int iterator = 0;
            if(!cadena[0].equals("NO-ACTION")){
                while(iterator < cadena.length){
                    System.out.println("\n------------------PARAMETRO " + (iterator + 1) + "------------------");
                    System.out.println("Cantidad de caracteres: " + cadena[iterator].length());
                    System.out.println("Caracteres en mayuscula: " + cadena[iterator].toUpperCase());
                    System.out.println("Caracteres en minuscula: " + cadena[iterator].toLowerCase());
                    iterator++;
                }
            }
        }
        catch(Exception exception){
            System.out.println("\n¡ERROR! ¡No ha escrito nada!");
            System.out.println("\n******************************************************************************************************************************************************");
            System.out.print("Se a producido el siguiente error: ");
            exception.printStackTrace();
            System.out.println("******************************************************************************************************************************************************\n");
        }
    }
    public getException(){

    }
}