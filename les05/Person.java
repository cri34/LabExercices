public class Person {
    private int years = 1;
    private int days;
    private long minutes, secons, milliseconds;

    public void calculateAge() {
        days = years * 365;
        secons =(long)days * 24 * 3600;
        minutes = secons / 60;
        milliseconds = secons * 1000;
        System.out.println("ageDays " + days);
        System.out.println("ageMinutes " +minutes);
        System.out.println("ageSecons " +secons);
        System.out.println("ageMilliseconds " +milliseconds);
    }

}
