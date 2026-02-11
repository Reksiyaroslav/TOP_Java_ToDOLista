package work;

public class TaskDataGlav {
    private  TaskDataArrayDeler taskDataArrays = new TaskDataArrayDeler();
    private  TaskGlav taskGlav1 = new TaskGlav("moler",1,taskDataArrays.getTaskDelers1());
    private  TaskGlav taskGlav2 = new TaskGlav("oler",2,taskDataArrays.getTaskDelers2());

    public TaskGlav getTaskGlav1() {
        return this.taskGlav1;
    }

    public TaskGlav getTaskGlav2() {
        return this.taskGlav2;
    }
}
