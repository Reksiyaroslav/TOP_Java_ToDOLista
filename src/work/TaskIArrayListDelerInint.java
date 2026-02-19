package work;

import java.util.ArrayList;
import java.util.Random;

public class TaskIArrayListDelerInint {
    private  TaskDataDeler taskDataDeler = new TaskDataDeler();
    private  TaskDeler[] taskDelers = new TaskDeler[]{taskDataDeler.getTaskDeler1()
            ,taskDataDeler.getTaskDeler2(),taskDataDeler.getTaskDeler3()
            ,taskDataDeler.getTaskDeler4(),taskDataDeler.getTaskDeler5()
            ,taskDataDeler.getTaskDeler6()};
    private   int relult = 1;
    public ArrayList<TaskDeler> init(ArrayList<TaskDeler> taskDelerArrayList){

        if(relult==1)
        {    relult+=1;
            for (int i = 0; i < this.taskDelers.length/2; i++) {
                taskDelerArrayList.add(taskDelers[i]);
            }

        }
        else
        {
            for (int i = this.taskDelers.length/2; i < this.taskDelers.length; i++) {
                taskDelerArrayList.add(taskDelers[i]);
            }

        }
        return  taskDelerArrayList;
    }
}
