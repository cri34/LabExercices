public class Clock {
    int timeOfDay;

    public Clock(int time) {
        this.timeOfDay = time;
    }

    public void displayPartOfDay() {

        boolean[] condicionEtapaTiempo = {timeOfDay >= 801 && timeOfDay <= 1200, timeOfDay >= 1201 && timeOfDay <= 1700, timeOfDay >= 1701 && timeOfDay <= 2400, timeOfDay >= 1 && timeOfDay <= 800};

        String[] etapaTiempo = {"Morning", "Afternoon", "Evening", "Early Morning"};

        for (int index = 0; index < 4; index++) {
            if (condicionEtapaTiempo[index]) {
                System.out.println("etapa dia: " + etapaTiempo[index]);
                break;
            }
        }
        if (timeOfDay < 1 || timeOfDay > 2400) {
            System.out.println("hora invalida minimo valor 1 max 2400");
        }
    }
}
