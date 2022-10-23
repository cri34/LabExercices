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

    public void displayDeskMap() {
        for (int fila = 0; fila < 3; fila++) {
            for (int col = 0; col < 4; col++) {
        System.out.print(" "+deskArray[fila][col]);
            }
            System.out.println();
        }
    }
}
