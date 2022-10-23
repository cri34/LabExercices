public class Clock {
    int time=000;
    public void displayPartOfDay(){
if(time >= 801 && time<=1200 ){
    System.out.println("Morning");
}else if(time >= 1201 && time<=1700 ){
    System.out.println("Afternoon");
}else if(time >= 1701 && time<=2400){
    System.out.println("Evening");
}else if(time >= 1 && time <= 800 ){
    System.out.println("Early Morning");
}else{
    System.out.println("hora invalida mino valor 1 max 2400");
}
    }
}
