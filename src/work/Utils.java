package work;

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
                taskGlavs[i].Show();
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
                }else
                {
                    continue;
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
                }else
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
}