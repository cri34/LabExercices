public class Temperature {
    private final double fahrenheit = 78.9;
    private double celcius;

    public void calculateCelsius() {
        celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println("celcius: " + celcius);
    }
}
