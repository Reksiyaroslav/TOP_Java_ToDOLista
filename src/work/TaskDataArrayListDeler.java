package work;

import tasmaneger.TaskDeler;

import java.util.ArrayList;

public class TaskDataArrayListDeler {
    private ArrayList<TaskDeler> taskDelers1 = new ArrayList<TaskDeler> ();
    private ArrayList<TaskDeler>  taskDelers2= new ArrayList<TaskDeler>();
    ArrayList<TaskDeler> taskDelerArrayList = new ArrayList<>();


    public ArrayList<TaskDeler> getTaskDelerArrayList() {
        return this.taskDelerArrayList;
    }
    public  void init_TaskDelerArrayList(){this.taskDelerArrayList.add(new TaskDeler("Сдлетаь раковлению ",1));
        this.taskDelerArrayList.add(new TaskDeler("Сдлетаь пароливрлав ",2));
    }
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
