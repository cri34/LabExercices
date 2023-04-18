public abstract class Employee implements Printable{
    private String name ;
    private String jobTitle;
    private int level;
    private final int employeeId;
    private static int currentEmployeeID = 0;
    public Employee(String name, String jobTitle, int level){
        this.setName(name);
        this.setJobTitle(jobTitle);
        this.setLevel(level);
        employeeId = currentEmployeeID;
        calculateEmployeeId();
    }
    public Employee(){
        employeeId = currentEmployeeID;
        calculateEmployeeId();
    }


    private void calculateEmployeeId(){
        currentEmployeeID++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (!checkValidLevel(level)){
            System.out.println("incorrect Level Number , be insert te default level");
            return;
        }
        this.level = level;
    }
    private boolean  checkValidLevel(int level){
        final int minLevel=1;
        final int maxLevel=3;
        return (level >= minLevel && level <= maxLevel);
    }

    public int getEmployeeId() {
        return employeeId;
    }
    @Override
    public String toString(){
        return "ID : "+getEmployeeId()+" Job Title : "+ getJobTitle();
    }
    @Override
    public void print(){
        System.out.println("Employee Information:\nID : "+getEmployeeId()+ "\nName : "+ getName() +"\nJob Title : "+ getJobTitle()+"\nLevel : "+getLevel()+"\n");
    }
}
