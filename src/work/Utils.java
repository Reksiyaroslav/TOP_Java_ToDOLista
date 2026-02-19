package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Utils {
    // не работает коректоно
    public ArrayList<TaskGlav> Status_Task(ArrayList<TaskGlav> taskGlavs){
        if (taskGlavs==null) return null;
        for (TaskGlav taskGlav : taskGlavs) {
            Integer count = count_task_suces(taskGlav);
            if (taskGlav.getTaskDelers().size()>1)
            {
                taskGlav.setStatus(Status.inprogers);
            }
            if (count==taskGlav.getTaskDelers().size()) {
                taskGlav.setStatus(Status.done);
            }
        }
        return  taskGlavs;
    }
    public Integer count_task_suces(TaskGlav taskGlav)
    { Integer count = 0;
        if(taskGlav==null) return  0;
        else{
            for (TaskDeler taskDeler : taskGlav.getTaskDelers()) {
                if (taskDeler.getStatus()==Status.done){
                    count++;
                }

            }
        }

        return  count;
    }



    public  void Update_status(ArrayList<TaskDeler> taskDelers, Integer count){
        Integer i= 0;
        if (taskDelers==null) return;
        for (TaskDeler taskDeler : taskDelers) {
            if(count ==1)
            {// сдесб не должно быть вызов это стуки протсо  нужно было else дописать
                // и сделать при там break при i == 3 чтобы он не записал кортное число
                // чтобы сделать вид что у нас толтко несколько выполднены
                if (i ==2)
                {
                    break;
                }
                else
                {   taskDeler.Show_status();
                    taskDeler.setStatus(Status.done);
                    i++;
                }
            }
            else
            {
                taskDeler.setStatus(Status.done);
                taskDeler.Show_status();
            }
        }
    }
    public  static void Sort(TaskManager taskManager){
        Comparator<Task> comparator = Comparator.comparing(Task::getStatus);
        taskManager.getTaskGlavs().sort(comparator);
        if( taskManager.getTaskGlavs()==null) return;
        for (TaskGlav taskGlav : taskManager.getTaskGlavs()) {
            taskGlav.getTaskDelers().sort(comparator);
        }
    }
    static public TaskGlav acherv(ArrayList<TaskGlav> taskGlavs)
    {
        System.out.println("\nВ архиве вот така такска");
        if(taskGlavs ==null) {
            return  null;
        }
        else {
            for (TaskGlav taskGlav : taskGlavs) {
                Status status = taskGlav.getStatus();
                if (status == Status.done) {
                    return taskGlav;
                }
            }
        }
        return  null;

    }
}