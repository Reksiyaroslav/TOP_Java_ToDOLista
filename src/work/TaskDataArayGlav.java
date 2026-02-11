package work;

public class TaskDataArayGlav {
    private  TaskDataGlav taskDataGlav = new TaskDataGlav();
    private  TaskGlav[] taskGlavs = new TaskGlav[]{taskDataGlav.getTaskGlav1(),taskDataGlav.getTaskGlav2()};

    public TaskGlav[] getTaskGlavs() {
        return taskGlavs;
    }
}
