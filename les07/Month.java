public class Month {
    int monthNumber = 1;
    public Month(int  monthNumber){
        this.monthNumber=monthNumber;

    }
    String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Nobiembre","Diciembre"};

    public void displayMonth() {
        if (monthNumber < 1|| monthNumber > 12){
            System.out.println("numero de mes invalido minimo 1 max 12");
            return;
        }
        System.out.println("numero mes: "+monthNumber +" nombre mes: "+ meses[monthNumber-1]);
    }
}
