public class Sequence {
    int nextNumber;
    final int secuenceLimit = 100;
    int firstNumber = 0;
    int secondNumber = 1;

    public void displaySequence() {
        System.out.print(firstNumber + " " + secondNumber + " ");
        nextNumber = firstNumber + secondNumber;
        while(nextNumber<=secuenceLimit){
            System.out.print(nextNumber+" ");
            firstNumber=secondNumber;
            secondNumber=nextNumber;
            nextNumber=firstNumber+secondNumber;
        }
        System.out.println();
    }
}
