public class DateTwo {
    int dayNumber=1;


    public void displayDay(){
        if (dayNumber==1){
            System.out.println(" nombre dia : lunes");
        }else if (dayNumber==2){
            System.out.println(" nombre dia : martes");
        }else if (dayNumber==3){
            System.out.println(" nombre dia : miercoles");
        }else if (dayNumber==4){
            System.out.println(" nombre dia : jueves");
        }else if (dayNumber==5){
            System.out.println(" nombre dia : viernes");
        }else if (dayNumber==6){
            System.out.println(" nombre dia : sabado");
        }else if (dayNumber==7){
            System.out.println(" nombre dia : domingo");
        }else{
            System.out.println(" numero de dia invalido");
        }

    }
}
