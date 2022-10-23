public class Sequence {
    int nextNumber;
    final int secuenceLimit = 100;
    int firstNumber = 0;
    int secondNumber = 1;

    public void displaySequence() {
        //while loop
        System.out.print(firstNumber + " " + secondNumber + " ");
        nextNumber = firstNumber + secondNumber;
        while (nextNumber <= secuenceLimit) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
        System.out.println();
        //for loop
        final int sequenceCount = 10;
        firstNumber = 0;
        secondNumber = 1;
        nextNumber = firstNumber + secondNumber;
        System.out.print(firstNumber + " " + secondNumber + " ");
        for (int i = 2; i < sequenceCount; i++) {
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            nextNumber = firstNumber + secondNumber;
        }
    }
}
