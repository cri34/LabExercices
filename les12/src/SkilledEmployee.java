import java.util.ArrayList;

public abstract class SkilledEmployee extends Employee{
    private final ArrayList <String> skills = new <String>ArrayList();
    public SkilledEmployee(String name, String jobTitle, int level){
        super(name, jobTitle, level);
    }
    public SkilledEmployee(){
    }
    public void setSkill(String skillName){
        skills.add(skillName);
    }
    public String getSkill(int number)throws IllegalArgumentException{
       if (!skillIndexValid(number)){
           throw new IllegalArgumentException("invalid index number");
       }
       return skills.get(number);
    }
    private boolean skillIndexValid(int number){
        final int minNumber=0;
        final int maxNumber = skills.size()-1;
       return number >= minNumber && number <= maxNumber;
    }
    @Override
    public void print(){
       super.print();
       displaySkills();
    }
    public void displaySkills(){
        StringBuilder out = new StringBuilder();
        out.append("list of Skills : \n");
        for (int i = 0; i < skills.size();i++){
            out.append(getSkill(i)+" \n");
        }
        System.out.println(out);
    }


}
