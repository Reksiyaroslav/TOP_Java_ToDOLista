package work;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskManager {
    private ArrayList<TaskGlav>taskGlavs = new ArrayList<TaskGlav>();
//    private  Master[] masters = new Master[]{};
    //TODO Master[] masters)
    public TaskManager(ArrayList<TaskGlav> taskGlavs){
        this.taskGlavs = taskGlavs;

    }
    public Utils utils = new Utils();
    public void  Update_tas()
    { int count = 0;
        for (TaskGlav taskGlav : this.taskGlavs) {
            if (count == 0)
            {
                utils.Update_status(taskGlav.getTaskDelers(),count);
                count++;
            }
            else{
                ArrayList<TaskDeler> task_del = taskGlav.getTaskDelers();
                utils.Update_status(task_del, count);
                taskGlav.setTaskDelers(task_del);
                ArrayList<TaskGlav> taskGlavs1 = utils.Status_Task(this.taskGlavs);
                setTaskGlavs(taskGlavs1);
            }
        }



    }


    public void   Show(){
        for (TaskGlav taskGlav : taskGlavs) {
            taskGlav.Show();
        }
    }

    public ArrayList<TaskGlav> getTaskGlavs() {
        return taskGlavs;
    }

    public void setTaskGlavs(ArrayList<TaskGlav> taskGlavs) {
        this.taskGlavs = taskGlavs;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "taskGlavs=" + taskGlavs +
//                ", masters=" + Arrays.toString(masters) +
                ", utils=" + utils +
                '}';
    }
}