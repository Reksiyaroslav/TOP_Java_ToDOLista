package work;

public class Utils {
    // не работает коректоно
    public TaskGlav[] Status_Task(TaskGlav[] taskGlavs){

        for (int i = 0; i < taskGlavs.length ; i++) {
            Integer count = count_task_suces(taskGlavs[i]);
            // Сдесь не правельна логика проерки там должно быть если он больше >=1
            if (taskGlavs[i].getTaskDelers().length==1)
            {
                taskGlavs[i].setStatus(Status.inprogers);

            } else if (count==taskGlavs.length) {
                count = 0;
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
        System.out.println(count);
        return  count;
    }



    public  void Update_status(TaskDeler[] taskDelers,Integer count ){
        int count_done = 0;
        for (int i = 0; i < taskDelers.length; i++) {

            taskDelers[i].setStatus(Status.done);
            if(count ==2)
            {// сдесб не должно быть вызов это стуки протсо  нужно было else дописать
                // и сделать при там break при i == 3 чтобы он не записал кортное число
                // чтобы сделать вид что у нас толтко несколько выполднены
                taskDelers[i].setStatus(Status.done);
                count_done++;
                if (i ==5)
                {
                    break;
                }
            }
        }
    }
}