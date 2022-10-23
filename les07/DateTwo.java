public class DateTwo {
    int dayNumber=0;
String [] dias ={"lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};

    public void displayDay(){
        if (dayNumber <1 || dayNumber>7){
            System.out.println(" numero de dia invalido");
        }else {
            System.out.println(" nombre dia : " + dias[dayNumber - 1]);
        }


    }
}
