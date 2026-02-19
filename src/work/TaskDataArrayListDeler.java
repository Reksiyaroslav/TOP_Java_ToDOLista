package work;

import java.util.ArrayList;

public class TaskDataArrayListDeler {
    private ArrayList<TaskDeler> taskDelers1 = new ArrayList<TaskDeler> ();
    private ArrayList<TaskDeler>  taskDelers2= new ArrayList<TaskDeler>();



    public  ArrayList<TaskDeler> getTaskDelers1() {
        return this.taskDelers1;
    }

    public   ArrayList<TaskDeler> getTaskDelers2() {
        return this.taskDelers2;
    }

    public void setTaskDelers1(ArrayList<TaskDeler> taskDelers1) {
        this.taskDelers1 = taskDelers1;
    }

    public void setTaskDelers2(ArrayList<TaskDeler> taskDelers2) {
        this.taskDelers2 = taskDelers2;
    }
}
