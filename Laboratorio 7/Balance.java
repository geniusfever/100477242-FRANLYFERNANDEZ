import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Balance {
    private String [][] customers,accounts,balance;
    public int maxRow, maxCol;
    public float floatValue;
    public String [][] currentArray;
    public final int MAXBALANCECOL = 4;
    public final String encabezadoBalance = "NUMERO DE CUENTA, NOMBRE Y APELLIDO, FECHA NACIMIENTO, BALANCE";
    public final String ROOT = System.getProperty("user.dir");
    public final String customersUrl = ROOT + "/CLIENTES.txt";
    public final String accountsUrl = ROOT + "/CUENTAS.txt";

    public String[][] SplitFiles(String fileUrl){
        try{
            Scanner scanner = new Scanner(new File(fileUrl));

            maxRow = 0;
            maxCol = 0;

            if(scanner.hasNext()){
                String value = scanner.nextLine(); //SALTAR ENCABEZADO
                maxCol = value.split("\\|").length; //CANTIDAD DE COLUMNAS EN EL ENCABEZADO.
            }

            while(scanner.hasNext()){ //NUMERO DE FILAS
                maxRow++;
                scanner.nextLine();
            }
            scanner.close();

            scanner = new Scanner(new File(fileUrl)); //RESET SCANNER

            if(scanner.hasNext()){
                scanner.nextLine(); //SALTAR ENCABEZADO
            }

            currentArray = new String[maxRow][maxCol];

            while(scanner.hasNext()){
                for(int i=0; i<maxRow; i++){
                    for(int j=0; j<maxCol; j=maxCol){
                        currentArray[i] = (scanner.nextLine()).split("\\|", maxCol);
                    }
                }
            }
            scanner.close();
        }
        catch(Exception e){
            System.out.println("Se ha producido una exepcion: " + e);
        }

        return currentArray;
    }

    public void setFileData(){
        SplitFiles(customersUrl);
        customers = new String [maxRow][maxCol]; //INICIALIZAR EL ARRAY BIDIMENSIONAL CON LOS VALORES EXTRAIDOS.
        customers = currentArray;

        SplitFiles(accountsUrl);
        accounts = new String [maxRow][maxCol]; //INICIALIZAR EL ARRAY BIDIMENSIONAL CON LOS VALORES EXTRAIDOS.
        accounts = currentArray;
    }

    public float isFloat(String value){
        floatValue = Float.parseFloat(value);
        return floatValue;
    }

    public void generateBalance(){
        balance = new String [accounts.length][MAXBALANCECOL];
        balance[0] = encabezadoBalance.split(","); //ASIGNAR ENCABEZADO

        int k=1;//SALTAR ENCABEZADO
        for(int i=0; i<customers.length; i++){
            for(int j=0; j<accounts.length; j++){
                if(customers[i][0].equals(accounts[j][0])){//VERIFICANDO CEDULAS
                    isFloat(accounts[j][3]);
                    if((customers[i][2].equals("SI")) && (floatValue > 3000)){//ESTATUS ACTIVO
                        balance[k][0] = accounts[j][1];
                        balance[k][1] = customers[i][1];
                        balance[k][2] = customers[i][3];
                        balance[k][3] = accounts[j][3];
                        k++;
                    }
                }
            }
        }
        //Create File
        try {
            File myNewFile = new File("BALANCE.txt");
            FileOutputStream fileOut = new FileOutputStream(myNewFile);
            BufferedWriter bW = new BufferedWriter(new OutputStreamWriter(fileOut));
            String currentText = "";

            for(int i=0; i<balance.length;i++){
                String [] currentArray = new String[MAXBALANCECOL];
                for(int j=0; j<MAXBALANCECOL;j++){
                    if(balance[i][j] != null){
                        currentArray[j] = balance[i][j];
                    }
                }
                if(currentArray[0] != null){
                    currentText = String.join(",", currentArray);
                    bW.write(currentText);
                    bW.newLine();
                }
            }
            bW.close();
            System.out.println("El arcivo BALANCE.TXT fue generado con exito.");
        }
        catch(Exception e){
            System.out.println("Se ha producido una exepcion: " + e);
        }
    }
    public static void main(String[] args) {
        Balance myBalance = new Balance();

        myBalance.setFileData();
        myBalance.generateBalance();
    }
}