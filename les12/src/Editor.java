public class Editor extends SkilledEmployee{
    private boolean prefersPaperEditing;
    public Editor(String workersName, String jobTitle, int level,boolean prefersPaperEditing){
        super(workersName,jobTitle,level);
        this.prefersPaperEditing = prefersPaperEditing;
    }
    public Editor(){

    }
    public void setPrefersPaperEditing(boolean prefersPaperEditing){
        this.prefersPaperEditing=prefersPaperEditing;
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Prefers Editing: " + getPrefersEditing());
    }
    public String getPrefersEditing(){
        return (prefersPaperEditing)?"Paper":"electronic";
    }

}
