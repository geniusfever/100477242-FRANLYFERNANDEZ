import java.util.ArrayList;

public class GraphicIllustrator extends Employee{
    private ArrayList<String> skills = new ArrayList<String>();

    public void setSkill(String skill){
        if(skill != null){
            this.skills.add(skill);
        }
    }

    public ArrayList<String> getSkill(){
        return skills;
    }

    public void displayGraphicsIllustratorInformation(){
        System.out.println("\n***************** Ilustrador Grafico *****************");
        System.out.println("ID DE EMPLEADO: " + getId());
        System.out.println("NOMBRE: " + getName());
        System.out.println("POSICION O CARGO: " + getJobTitle());
        System.out.println("NIVEL: " + getLevel());
        System.out.print("HABILIDADES: ");
        for(int i=0; i<skills.size(); i++){
            System.out.print(skills.get(i));
            if(i != skills.size()-1){
                System.out.print(", ");
            }
        }
        System.out.println("\n");
    }
}