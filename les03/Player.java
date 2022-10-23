public class Player {
    private String nom;
    private String lli1;
    private String lli2;
    private int number;
    private int goalsScore;

    public Player() {
        this.nom = "Pepe";
        this.lli1 = "Albarez";
        this.lli2 = "Muñoz";
        this.number=0;
        this.goalsScore=0;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLli1(String lli1) {
        this.lli1 = lli1;
    }

    public void setLli2(String lli2) {
        this.lli2 = lli2;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setGoalsScore(int goalsScore){
        this.goalsScore=goalsScore;
    }

    public void display() {
        System.out.println("nombre " + nom);
        System.out.println("apellido 1 " + lli1);
        System.out.println("apellido 2 " + lli2);
        System.out.println("number " + number);

    }

}
