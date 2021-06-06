public class VacationScale {
    public int [] vacationDays;

    public void setVacationScale(){
        vacationDays = new int [] {10, 15, 15, 15, 20, 20, 25};
    }

    public void displayVacationDays(int yearsOfService){
        if((yearsOfService >= 0) && (yearsOfService <= vacationDays.length))
            System.out.println("Dia de vacaciones: " + vacationDays[yearsOfService]);
        else if(yearsOfService > vacationDays.length)
            System.out.println("Dia de vacaciones: " + vacationDays[vacationDays.length-1]);
    }
}