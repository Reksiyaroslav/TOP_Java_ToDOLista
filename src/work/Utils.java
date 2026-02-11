package work;

import java.util.Arrays;
import java.util.Comparator;

public class Utils {
    // не работает коректоно
    public TaskGlav[] Status_Task(TaskGlav[] taskGlavs){

        for (int i = 0; i < taskGlavs.length ; i++) {
            Integer count = count_task_suces(taskGlavs[i]);
            if (taskGlavs[i].getTaskDelers().length>1)
            {
                taskGlavs[i].setStatus(Status.inprogers);

            }
            if (count==taskGlavs[i].getTaskDelers().length) {
                taskGlavs[i].setStatus(Status.done);


            }

        }

        return  taskGlavs;

    }
    public Integer count_task_suces(TaskGlav taskGlavs)
    { Integer count = 0;

            for (int j = 0; j < taskGlavs.getTaskDelers().length; j++) {
                TaskDeler[] taskDelers = taskGlavs.getTaskDelers();
                if (taskDelers[j].getStatus() == Status.done)
                {
                    count++;
                }
            }
        return  count;
    }



    public  void Update_status(TaskDeler[] taskDelers,Integer count ){
        for (int i = 0; i < taskDelers.length; i++) {


            if(count ==1)
            {// сдесб не должно быть вызов это стуки протсо  нужно было else дописать
                // и сделать при там break при i == 3 чтобы он не записал кортное число
                // чтобы сделать вид что у нас толтко несколько выполднены


                if (i ==2)
                {
                    break;
                }
                else
                {
                    taskDelers[i].setStatus(Status.done);
                }
            }
            else
            {
                taskDelers[i].setStatus(Status.done);
            }
        }
    }
    public  static void Sort(TaskManager taskManager){
        Comparator<Task> comparator = Comparator.comparing(Task::getStatus);
        for (int i = 0; i < taskManager.getTaskGlavs().length; i++) {
            Arrays.sort(taskManager.getTaskGlavs(), comparator);
            Arrays.sort(taskManager.getTaskGlavs()[i].getTaskDelers(), comparator);

        }
    }
    static public TaskGlav acherv(TaskGlav[] taskGlavs)
    {

        for (int i = 0; i < taskGlavs.length; i++) {
            Status status = taskGlavs[i].getStatus();
            if (status == Status.done) {
                return  taskGlavs[i];
            }
        }
        return  null;

    }
}