package tasmaneger;

import java.util.ArrayList;
import java.util.Comparator;

public class Utilss_Task extends  AbUtils{
      public void Update_Tasl(ArrayList<TaskGlav> taskGlavArrayList){
        int count = 0;
        for (TaskGlav taskGlav : taskGlavArrayList) {
            this.Update_status_sub(taskGlav.getTaskDelers(),count);
            this.Status_Task(taskGlav);
        }
    }
    @Override
    public TaskGlav Status_Task(TaskGlav taskGlav) {
        if (taskGlav==null) return null;
        var count = count_done_status_sub(taskGlav);
        if (taskGlav.getTaskDelers().size()>1){
            taskGlav.setStatus(Status.inprogers);
        }
        if (taskGlav.getTaskDelers().size() == count) {
            taskGlav.setStatus(Status.done);
        }
        return  taskGlav;
    }

    @Override
    public void Update_status_sub(ArrayList<TaskDeler> taskDelers, Integer count) {
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

    @Override
    public void Sort(TaskGlav taskGlav) {
        Comparator<Task> comparator = Comparator.comparing(Task::getStatus);
        if( taskGlav==null) return;
        else {
            taskGlav.getTaskDelers().sort(comparator);
        }

    }

    @Override
    public Integer count_done_status_sub(TaskGlav taskGlav) {
        Integer count = 0;
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

    static  public ArrayList<TaskGlav> achev(ArrayList<TaskGlav> taskGlavArrayList) {


        ArrayList<TaskGlav> achev_task = new ArrayList<>();
        if(taskGlavArrayList ==null) {
            return  null;
        }
        else {
            for (TaskGlav taskGlav : taskGlavArrayList) {
                Status status = taskGlav.getStatus();
                if (status == Status.done) {
                    achev_task.add(taskGlav);
                }
            }
        }
        if (achev_task.size()>0){
            System.out.println("\nВ архиве вот така такска");
            return achev_task;
        }
        System.out.println("\nВ архиве нет тасок  ");
        return  null;
    }



}
