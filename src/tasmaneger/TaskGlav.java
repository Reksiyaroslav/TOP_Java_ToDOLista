package tasmaneger;

import java.util.ArrayList;
import java.util.Objects;

public class TaskGlav extends  Task{
    private  ArrayList<TaskDeler> taskDelerArrayList = new ArrayList<TaskDeler>();
    private  Integer pointe =0;
    public  TaskGlav(String name_task, Integer id,Integer pointer){
        super(id,name_task);
        this.pointe = pointer;

    }
    public void  AddSub(TaskDeler taskDeler){
        this.taskDelerArrayList.add(taskDeler);
    }
    public  void AddSubs(ArrayList<TaskDeler> taskDelers){
        this.taskDelerArrayList.addAll(taskDelers);


    }

    @Override
    public void  Show() {
        super.Show();
        for (TaskDeler taskDeler : taskDelerArrayList) {
            taskDeler.Show();
        }
    }

    public ArrayList<TaskDeler>  getTaskDelers() {
        return taskDelerArrayList;
    }

    public void setTaskDelers(ArrayList<TaskDeler>  taskDelers) {
        this.taskDelerArrayList = taskDelers;
    }
    @Override
    public void Show_status() {
        System.out.println("Task glav");
        for (TaskDeler taskDeler : taskDelerArrayList) {
            taskDeler.Show_status();
        }
        super.Show_status();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TaskGlav taskGlav)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(taskDelerArrayList, taskGlav.taskDelerArrayList) && Objects.equals(pointe, taskGlav.pointe);
    }

    @Override
    public String toString() {
        return "TaskGlav{" +
                " tittle " + this.getName_task()+
                " status " +this.getStatus()+"\n"+
                "taskDelers=" + taskDelerArrayList +
                ", pointe=" + pointe +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taskDelerArrayList, pointe);
    }

    public Integer getPointe() {
        return pointe;
    }

    public void setPointe(Integer pointe) {
        this.pointe = pointe;
    }

}



