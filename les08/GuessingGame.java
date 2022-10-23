public class GuessingGame {
    public static void main(String[] args) {
//falta limitar parametros >0 <6;
        if (args.length == 0 || args[0].compareTo("help") == 0) {
            System.out.println("valores invalidos");
            return;
        }
        int randomNum = (int) (Math.random() * (5) + 1);
        int guess = Integer.parseInt(args[0]);
        if (guess < 1 || guess > 5) {
            System.out.println("valores invalidos min 1 max 5");
            return;
        }
        if (randomNum == guess) {
            System.out.println("correct number " + "numberGuess : " + guess + " numberToGuess : " + randomNum);
            return;
        }
        System.out.println("The number to Guess isn't " + guess + " is : " + randomNum);
    }
}
