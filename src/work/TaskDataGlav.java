package work;

public class TaskDataGlav {
    private  TaskDataArrayListDeler taskDataArrays = new TaskDataArrayListDeler();
    private  TaskIArrayListDelerInint taskIArrayListDelerInint = new TaskIArrayListDelerInint();
    private  TaskGlav taskGlav1 = new TaskGlav("moler",1,taskIArrayListDelerInint
            .init(taskDataArrays.getTaskDelers1()));
    private  TaskGlav taskGlav2 = new TaskGlav("oler",2,taskIArrayListDelerInint
            .init(taskDataArrays.getTaskDelers2()));

    public TaskGlav getTaskGlav1() {
        return this.taskGlav1;
    }

    public TaskGlav getTaskGlav2() {
        return this.taskGlav2;
    }
}
