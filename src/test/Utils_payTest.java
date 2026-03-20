package test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import tasmaneger.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
public class Utils_payTest {
    private Utilas_pay utilsPay;
    @BeforeEach
    void setup(){
        utilsPay = new Utilas_pay();
    }
    @Test
    @DisplayName("is_not_null:оба не null")
    void is_not_null_master_not_null(){
        Master master = new Master();
        Client client = new Client();
        boolean result = utilsPay.is_not_null_master(master, client);
        assertTrue(result);
    }
    @Test
    @DisplayName("is_not_null:оба не master null")
    void is_null_master_not_null(){
        Client client = new Client();
        boolean result = utilsPay.is_not_null_master(null, client);
        assertFalse(result);
    }
    @Test
    @DisplayName("is_not_null:оба не master null")
    void is_not_null_master_null_client(){
        Master master = new Master();
        boolean result = utilsPay.is_not_null_master(master, null);
        assertFalse(result);
    }
    @Test
    @DisplayName("isStatusTask: оба статуса DONE → true")
    void isStatusTask_bothDone_returnsTrue() throws MyExepts {
        boolean result = utilsPay.isStatusTask(Status.done, Status.done);
        assertTrue(result);
    }
    @Test
    @DisplayName("isStatusTask: один статуса DONE и Inprogers → true")
    void isStatusTask_one_task_inprogeks() throws MyExepts {
        boolean result = utilsPay.isStatusTask(Status.done, Status.inprogers);
       assertThrows(MyExepts.class,()->{
           utilsPay.isStatusTask(Status.done, Status.inprogers);
       });
    }
    @Test
    @DisplayName("isStatusTask: один статуса DONE и Inprogers → true")
    void isStatusTask_one_task_null() throws MyExepts {
        boolean result = utilsPay.isStatusTask(Status.done, Status.inprogers);
        assertThrows(MyExepts.class,()->{
            utilsPay.isStatusTask(Status.done, null);
        });
    }
    @Test
    @DisplayName("get_prise_full_task:пустые списки → пустой результат")
    void get_prise_full_task_emptyLists_returnsEmpty() {
        ArrayList<TaskGlav> clientTasks = new ArrayList<>();
        ArrayList<TaskGlav> masterTasks = new ArrayList<>();
        ArrayList<Integer> result = utilsPay.get_prise_full_task(clientTasks, masterTasks);
        assertTrue(result.isEmpty());

    }
    @Test
    @DisplayName("get_prise_full_task:нет совпадений по ID → пустой результат")
    void get_prise_full_task_emptyLists_not_id() {
        ArrayList<TaskGlav> clientTasks = new ArrayList<>();
        ArrayList<TaskGlav> masterTasks = new ArrayList<>();
        TaskGlav clientTask = new TaskGlav("sjkdhs",1,100);
        clientTask.setStatus(Status.done);

        TaskGlav masterTask = new TaskGlav("JGHFjhsddfg",2,100);
        masterTask.setStatus(Status.done);
        clientTasks.add(clientTask);
        masterTasks.add(masterTask);
        ArrayList<Integer> result = utilsPay.get_prise_full_task(clientTasks, masterTasks);

        assertTrue(result.isEmpty());

    }
    @Test
    @DisplayName("get_prise_full_task:одикавы id и таски")
    void get_prise_full_task_emptyLists_good_id() {
        ArrayList<TaskGlav> clientTasks = new ArrayList<>();
        ArrayList<TaskGlav> masterTasks = new ArrayList<>();
        TaskGlav clientTask = new TaskGlav("sjkdhs",1,100);
        clientTask.setStatus(Status.done);
        clientTasks.add(clientTask);
        masterTasks.add(clientTask);
        ArrayList<Integer> result = utilsPay.get_prise_full_task(clientTasks, masterTasks);

        assertTrue(result.isEmpty());

    }

}
