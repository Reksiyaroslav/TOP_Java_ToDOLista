package work;

import tasmaneger.TaskGlav;

import java.util.ArrayList;

public class TaskDataArrayListGlav {
    private  TaskDataGlav taskDataGlav = new TaskDataGlav();
    private ArrayList<TaskGlav>taskGlavs = new ArrayList<TaskGlav>(){};


    public ArrayList<TaskGlav> getTaskGlavs() {
        return this.taskGlavs;
    }
    public void  init(){
        this.taskGlavs.add(taskDataGlav.getTaskGlav1());
        this.taskGlavs.add(taskDataGlav.getTaskGlav2());
    }
}
