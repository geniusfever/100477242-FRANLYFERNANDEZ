public class Employee {
    private String name, jobTitle;
    private static int employeeID;
    private static int count=1;
    private int level;

    public boolean isNumeric(String str){ // COMPROBAR SI EL ARGUMENTO ES UN NUMERO O UN STRING.
        try{
            int value = Integer.valueOf(str);
            return true;
        }
        catch (NumberFormatException error){
            return false;
        }
    }

    public void setName(String name){
        if(name != null){
            if(!(isNumeric(name))){
                this.name = name;
            }
            else{
                System.out.println("ERROR! No puede agregar numeros.");
            }
        }
        else{
            System.out.println("ERROR! El nombre del empleado esta en blanco.");
        }
    }

    public String getName(){
        return name;
    }

    public void setJobTitle(String title){
        if(name != null){
            if(!(isNumeric(title))){
                this.jobTitle = title;
            }
            else{
                System.out.println("ERROR! No puede agregar numeros.");
            }
        }
        else{
            System.out.println("ERROR! El cargo del empleado esta en blanco.");
        }
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public void calculateEmployeeID(){
        employeeID = count++;
    }

    public int getId(){
        return employeeID;
    }

    public void setLevel(int level){
        if((level >= 1) && (level <= 3)){
            this.level = level;
        }
        else{
            System.out.println("¡NIVEL INVALIDO! Debe agregar un nivel en el rango de 1 a 3.");
        }
    }

    public int getLevel(){
        return level;
    }
}