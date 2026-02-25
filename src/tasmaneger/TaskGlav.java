package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class TaskGlav extends  Task{
    private ArrayList<TaskDeler> taskDelers =new ArrayList<TaskDeler>();
    private  Integer pointe =0;
    public  TaskGlav(String name_task,Integer id ,ArrayList<TaskDeler>  data){
        super(id,name_task);
        this.taskDelers = data;

    }

    @Override
    public void  Show() {
        super.Show();
        for (TaskDeler taskDeler : taskDelers) {
            taskDeler.Show();
        }
    }

    public ArrayList<TaskDeler>  getTaskDelers() {
        return taskDelers;
    }

    public void setTaskDelers(ArrayList<TaskDeler>  taskDelers) {
        this.taskDelers = taskDelers;
    }
    @Override
    public void Show_status() {
        System.out.println("Task glav");
        for (TaskDeler taskDeler : taskDelers) {
            taskDeler.Show_status();
        }
        super.Show_status();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TaskGlav taskGlav)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(taskDelers, taskGlav.taskDelers) && Objects.equals(pointe, taskGlav.pointe);
    }

    @Override
    public String toString() {
        return "TaskGlav{" +
                " status " +this.getStatus()+"\n"+
                "taskDelers=" + taskDelers +
                ", pointe=" + pointe +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taskDelers, pointe);
    }

    public Integer getPointe() {
        return pointe;
    }

    public void setPointe(Integer pointe) {
        this.pointe = pointe;
    }
    @Override
    public Integer sum_tast() {
        int sum = 0;
        for (TaskDeler taskDeler : taskDelers) {
            if (taskDeler.getStatus() == Status.done) {
                sum += 30;
            }
        }

        this.setPointe(sum);
        return sum;
    }
}



