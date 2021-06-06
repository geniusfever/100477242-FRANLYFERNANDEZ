public class ClassMap {
    public int roomNo;
    public String [][] deskArray;
    public final int MAXROW = 3;
    public final int MAXCOL = 4;

    public ClassMap(){

    }
    public ClassMap(int id){
        roomNo = id;
        deskArray = new String [MAXROW][MAXCOL];
    }

    public void setDesk(String studentName){
        outLoop: //LABEL BLOCK PARA SALIR DEL FOR ANIDADO ANTES DE QUE AGREGUE MAS FILAS
                for (int row = 0; row < MAXROW; row++) {
                    for (int col = 0; col < MAXCOL; col++) {
                        if (deskArray[row][col] == null) {
                            deskArray[row][col] = studentName;
                            System.out.println("Ha anadido un estudiante en la columna: " + col + ", fila: " + row);
                            break outLoop;
                        }
                    }
                }
    }
    public void displayDeskMap(){
        System.out.println("\n********************************* LISTA DE ESTUDIANTES *********************************");
        System.out.println("\n          | COLUMNA 1 | COLUMNA 2 | COLUMNA 3 | COLUMNA 4 |");
        for(int row=0; row<MAXROW; row++){
            System.out.print("Fila " + row + ": ");
            for(int col=0; col<MAXCOL; col++){
                if (deskArray[row][col] != null)
                    System.out.print("      " + deskArray[row][col] + "  ");
            }
            System.out.println();
        }
    }

    public void searchArray(String studentName){
        boolean isFinded = false;

        outLoop:
                for(int row=0; row<MAXROW; row++){
                    for(int col=0; col<MAXCOL; col++){
                        if (deskArray[row][col] != null && deskArray[row][col].equals(studentName)){
                            System.out.println("\nEl estudiante que busca esta en la fila: " + row + ", columna: " + col);
                            System.out.println("Nombre del Estudiante: " + deskArray[row][col]);
                            isFinded = !isFinded;
                            break outLoop;
                        }
                    }
                }
                if(isFinded == false){
                    System.out.println("\nERROR! No se encuentra el estudiante con nombre: " + studentName);
                }
    }
}