import java.util.ArrayList;

public class NamesList {
    public ArrayList listOfnames;

    public void setList(){
        String name;
        char a='a';
        listOfnames=new ArrayList<>();
        for (int i=0;i<5;i++){
            name= ""+ (char)(a+i);
            listOfnames.add(name);
        }
        System.out.println(listOfnames);
        System.out.println("tamaño : "+listOfnames.size());
    }
    public void manipulateList(int removeIndex,int newIndex,String newName){
        listOfnames.remove(removeIndex);
        listOfnames.add(newIndex,newName);
        System.out.println("content"+ listOfnames);
        System.out.println("size : "+ listOfnames.size());
    }
    public void manipulateList(int newIndex,String newName){
        listOfnames.add(newIndex,newName);
        System.out.println("content"+ listOfnames);
        System.out.println("size : "+ listOfnames.size());
    }
}
