package work;

public class TaskDataArrayDeler {
   private TaskDataDeler taskDataDeler = new TaskDataDeler();

    private TaskDeler[] taskDelers1 = new TaskDeler[]{taskDataDeler.getTaskDeler1(),taskDataDeler.getTaskDeler2(),taskDataDeler.getTaskDeler3()};
    private TaskDeler[] taskDelers2 = new TaskDeler[]{taskDataDeler.getTaskDeler4(),taskDataDeler.getTaskDeler5(),taskDataDeler.getTaskDeler6()};



    public  TaskDeler[] getTaskDelers1() {
        return this.taskDelers1;
    }

    public   TaskDeler[] getTaskDelers2() {
        return this.taskDelers2;
    }
}
