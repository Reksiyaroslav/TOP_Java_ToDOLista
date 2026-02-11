package work;

import java.util.Comparator;
import java.util.Objects;
//TODO userd Comparable<Task>
// implements Comparable<Task>

public abstract class Task  {
    private Integer id = 1;
    private String name_task = "New work";
    private Status status = Status.new_task;

    Task(Integer id, String name_task) {
        this.id = id;
        this.name_task = name_task;
    }

    public void Show() {
        System.out.println("id " + this.id + " Name_task " + this.name_task + " status " + status + "\n");
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task task)) return false;
        return Objects.equals(id, task.id) && Objects.equals(name_task, task.name_task) && status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name_task, status);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name_task='" + name_task + '\'' +
                ", status=" + status + '}'+"\n";
    }

//    @Override
//    public int compareTo(Task o) {
//        return Integer.compare(this.id,o.id);
//    }


}
