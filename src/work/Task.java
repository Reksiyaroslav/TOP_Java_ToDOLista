package work;

public abstract class Task {
    private Integer id = 1;
    private String name_task = "New work";
    private  Status status = Status.new_task;
    Task(Integer id,String name_task){
        this.id = id;
        this.name_task = name_task;
    }
    public  void Show(){
        System.out.println("id "+this.id+" Name_task "+this.name_task+" status "+status+"\n");
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
