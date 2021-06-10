import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Employee> Employees = new ArrayList<Employee>();

    public void setEmployee(Employee employee){
        if(employee != null){
            Employees.add(employee);
        }
    }

    public ArrayList<Employee> getEmployee(){
        return Employees;
    }

    public void displayManagerInformation(){
        System.out.println("\n***************** Gerente *****************");
        System.out.println("ID DE EMPLEADO: " + getId());
        System.out.println("NOMBRE: " + getName());
        System.out.println("POSICION O CARGO: " + getJobTitle());
        System.out.println("NIVEL: " + getLevel());
        System.out.print("EMPLEADOS A CARGO: ");
        for(int i=0; i<Employees.size(); i++){
            System.out.print(Employees.get(i).getName());
            if(i != Employees.size()-1){
                System.out.print(", ");
            }
        }
    }
}