package test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tasmaneger.Status;
import tasmaneger.TaskGlav;
import tasmaneger.Utilss_Task;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Utilss_TaskTest {
    private Utilss_Task utilssTask;

    @BeforeEach
    void setUp() {
        utilssTask = new Utilss_Task();
    }
    @Test
    @DisplayName("count_done_status_sub: null задача → 0")
    public void count_done_status_sub_nullTask_returnsZero() {
        long result = utilssTask.count_done_status_sub(null);

        Assertions.assertEquals(0, result);
    }
    @Test
    @DisplayName("count_done_status_sub: пустой список подзадач → 0")
    void count_done_status_sub_emptySubTasks_returnsZero() {
        TaskGlav task = new TaskGlav("hdjsfkhd",1,10);
        long result = utilssTask.count_done_status_sub(task);
        Assertions.assertEquals(0, result);
    }
    @Test
    @DisplayName("Status_Task: null задача → null")
    void Status_Task_nullTask_returnsNull() {
        TaskGlav result = utilssTask.Status_Task(null);

        Assertions.assertNull(result);
    }
    @Test
    @DisplayName("achev: null список → null")
    void achev_nullList_returnsNull() {
        ArrayList<TaskGlav> result = Utilss_Task.achev(null);
        Assertions.assertNull(result);
    }

    @Test
    @DisplayName("achev: есть выполненная задача → возвращает её")
    void achev_hasDoneTask_returnsIt() {
        ArrayList<TaskGlav> tasks = new ArrayList<>();

        TaskGlav notDone = new TaskGlav("fjds",1,10);
        notDone.setStatus(Status.inprogers);

        TaskGlav done = new TaskGlav("s",1,20);
        done.setStatus(Status.done);

        tasks.add(notDone);
        tasks.add(done);
        ArrayList<TaskGlav>  results = Utilss_Task.achev(tasks);
        System.out.println(results);
        Assertions.assertNotNull(results);
        for (TaskGlav result : results) {
            Assertions.assertEquals(Status.done, result.getStatus());
        }

    }
    @Test
    @DisplayName("achev: нет выполненных задач → null")
    void achev_noDoneTasks_returnsNull() {
        // Arrange
        ArrayList<TaskGlav> tasks = new ArrayList<>();

        TaskGlav task1 = new TaskGlav("ss",11,200);
        task1.setStatus(Status.inprogers);

        TaskGlav task2 = new TaskGlav("s",1,20);;
        task2.setStatus(Status.inprogers);

        tasks.add(task1);
        tasks.add(task2);
        ArrayList<TaskGlav>  results = Utilss_Task.achev(tasks);
        assertNull(results);

    }

}
