package work;

import java.util.ArrayList;

public class TaskDataArrayList {
    private TaskDataArrayListGlav taskDataArrayListGlav = new TaskDataArrayListGlav();
    public void inti_task(){
        taskDataArrayListGlav.init();
    }
    public ArrayList<TaskGlav> getArrayGlavs ()
    {
        return  this.taskDataArrayListGlav.getTaskGlavs();
    }
}
