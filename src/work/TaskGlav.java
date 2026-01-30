package work;

public class TaskGlav extends  Task{
    private  TaskDeler[] taskDelers =new TaskDeler[]{};
    public  TaskGlav(String name_task,Integer id ,TaskDeler[] data){
        super(id,name_task);
        for (int i = 0; i < data.length; i++) {
            this.taskDelers =  data;
        }

    }
    @Override
    public void  Show() {
        super.Show();
        for (int i = 0; i < this.taskDelers.length ;i++) {
            taskDelers[i].Show();
        }
    }

    public TaskDeler[] getTaskDelers() {
        return taskDelers;
    }

    public void setTaskDelers(TaskDeler[] taskDelers) {
        this.taskDelers = taskDelers;
    }
}
