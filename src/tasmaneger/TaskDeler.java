package tasmaneger;

public class TaskDeler extends  Task{
    public TaskDeler(String name_task,Integer id){
        super(id,name_task);
    }
    @Override
    public  void Show(){
        super.Show();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public void Show_status() {
        System.out.println("TaskDelever progress");
        super.Show_status();
    }
}
