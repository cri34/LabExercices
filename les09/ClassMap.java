public class ClassMap {
    String[][] deskArray;
    String name;

    public void setClassMap() {
        deskArray = new String[3][4];
    }

    public void setDesk() {
        boolean isAssigned = false;
        for (int index = 0; index < 3; index++) {

            for (int ind = 0; ind < 4; ind++) {
                if (deskArray[index][ind] == null) {
                    deskArray[index][ind] = name;
                    System.out.println("desk position row "+index+" column "+ind +" is assigned to "+name);
                    isAssigned = true;
                    break;
                }
            }
            if (isAssigned) {
                break;
            }
        }
        if (!isAssigned) {
            System.out.println("classe llena");
        }
    }
    public void searchDesk(String name){
        boolean isName=false;
        for (int row=0;row<3;row++){
            for (int col=0;col<4;col++){
                isName = deskArray[row][col]!=null && deskArray[row][col].equals(name);
                if (isName){
                    System.out.println("desk position to "+name+" is row "+row+" col "+col);
                    break;
                }
            }
            if (isName){
                break;
            }
        }
        if (!isName){
            System.out.println(name+" don't stay in any desk");
        }
    }

    public void displayDeskMap() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
        System.out.print(" "+deskArray[fila][col]);
            }
            System.out.println();
        }
    }
}
