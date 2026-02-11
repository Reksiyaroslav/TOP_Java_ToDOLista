package work;

import java.util.Comparator;

public class TaskComparotor  implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        return task1.getStatus().compareTo(task2.getStatus());




    }

}
