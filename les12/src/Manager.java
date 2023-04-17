import java.util.ArrayList;
public class Manager extends Employee{
    ArrayList <Employee> employees = new ArrayList<Employee>();
    public Manager (String name, String jobTitle, int level){
        super(name, jobTitle, level);
    }
    public Manager(){

    }

    public void setEmployee(Employee e){
        employees.add(e);
    }
    @Override
    public void displayInformation(){
       super.displayInformation();
       displayEmployees();
    }
    public void displayEmployees(){
        StringBuilder out = new StringBuilder();
        out.append("list of Employees: \n");
        for (int i=0;i < employees.size();i++){
            out.append(employees.get(i) +"| ");
        }
        System.out.println(out);
    }

}
