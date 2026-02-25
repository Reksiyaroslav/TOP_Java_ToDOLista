package tasmaneger;

import java.util.ArrayList;

public interface Utilss {
    public TaskGlav Status_Task(TaskGlav taskGlav);
    public  void Update_status_sub(ArrayList<TaskDeler> taskDelers, Integer count);
    public   void Sort(TaskGlav taskGlav);
    public Integer count_done_status_sub(TaskGlav taskGlav);

    public static TaskGlav achev(ArrayList<TaskGlav> taskGlavArrayList){return  null;} ;

}
