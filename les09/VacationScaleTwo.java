
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author administrator
 */
public class VacationScaleTwo {
    public ArrayList vacationDays;
    
    public void setVacationScale(){
        vacationDays = new ArrayList(7);
        vacationDays.add(10);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(15);
        vacationDays.add(20);
        vacationDays.add(20);
        vacationDays.add(25);
    }
    public void displayVacationDays(){
for(int index=0;index < vacationDays.size();index++){
    System.out.println(" the vacation for "+index+" years of service is "+vacationDays.get(index));
}
    }
}
