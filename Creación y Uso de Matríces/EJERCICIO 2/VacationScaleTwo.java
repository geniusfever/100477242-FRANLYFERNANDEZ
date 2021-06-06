public class VacationScaleTwo {
    public int [] vacationDays;

    public void setVacationScale(){
        vacationDays = new int [] {10, 15, 15, 15, 20, 20, 25};
    }

    public void displayVacationDays(){
        for(int i:vacationDays){
            System.out.println(i);
        }
    }
}