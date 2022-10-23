public class Counter {
    public final int maxCount=100;
    public void displayCount(){
        for(int index=1;index<=maxCount;index++){
            if (index%12==0){
                System.out.print(" "+index);
            }
        }
    }
}
