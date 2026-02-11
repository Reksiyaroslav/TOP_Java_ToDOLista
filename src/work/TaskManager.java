package work;

import java.util.Arrays;

public class TaskManager {
    private  TaskGlav[]taskGlavs = new TaskGlav[]{};
    public TaskManager(TaskGlav[]data){
        this.taskGlavs = data;
    }
    public Utils utils = new Utils();
    public void  Update_tas()
    { int count = 0;
        for (int i = 0; i < this.taskGlavs.length; i++) {
            if (i == 1)
            {count++;
                utils.Update_status(taskGlavs[i].getTaskDelers(),count);
            }
            else{
                TaskDeler[] task_del = taskGlavs[i].getTaskDelers();
                utils.Update_status(task_del, count);
                this.taskGlavs[i].setTaskDelers(task_del);
                TaskGlav[] taskGlavs1 = utils.Status_Task(this.taskGlavs);
                setTaskGlavs(taskGlavs1);
            }


        }

    }
    public void   Show(){
        for (int i = 0; i < this.taskGlavs.length; i++) {
            this.taskGlavs[i].Show();
        }
    }

    public TaskGlav[] getTaskGlavs() {
        return taskGlavs;
    }

    public void setTaskGlavs(TaskGlav[] taskGlavs) {
        this.taskGlavs = taskGlavs;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "taskGlavs=\n" + Arrays.toString(taskGlavs) +
                '}'+"\n";
    }

}
