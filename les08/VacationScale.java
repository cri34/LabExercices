public class VacationScale {
    private int[] vacationDays;
    public int yearsOfService;

    public void displayVacationDays() {
        if (yearsOfService >=0 && yearsOfService < 7){
            System.out.println("dias" + vacationDays[yearsOfService]);
            return;
        }
        if (yearsOfService >6) {
            System.out.println("dias" + vacationDays[vacationDays.length - 1]);
            return;
        }
            System.out.println("error año invalido");



    }

    public void setVacationScale() {
        vacationDays = new int[7];
        int diasVacaciones = 0;
        for (int index = 0; index < vacationDays.length; index++) {
            if (index == 0) {
                diasVacaciones = 10;
            }
            if (index == 1 || index == 2 || index == 3) {
                diasVacaciones = 15;
            }
            if (index == 4 || index == 5) {
                diasVacaciones = 20;
            }
            if (index == 6) {
                diasVacaciones = 25;
            }
            vacationDays[index] = diasVacaciones;
        }

    }

}
