package tasmaneger;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class Utilas_pay extends  AbUtils {
    public void master_addMoney_Client_remove(Master master, Client client){
        Integer client_pay_remvo_momey=0;
        Integer master_add_momey=0 ;
        if (!this.is_not_null_master(master,client)){
            System.out.println("Мастер или клинет не выбран");
            return;
        }
        ArrayList<TaskGlav> taskGlavsMaster = master.getTaskGlavs();
        ArrayList<TaskGlav> taskGlavsClient = client.getTaskGlavs();
        if(taskGlavsClient.isEmpty() || taskGlavsMaster.isEmpty() ) {
            System.out.println("У мастер или у клинета путые списко такски ");
            return;

        }
        else {
            for (TaskGlav clienttask : taskGlavsClient) {
                for (TaskGlav mastertask : taskGlavsMaster) {
                     boolean equals = clienttask.getId().equals(mastertask.getId());
                    if (equals && this.isStatusTask(clienttask.getStatus(),mastertask.getStatus())) {
                        client_pay_remvo_momey =  client.remove_money(clienttask.getPointe());
                        master_add_momey = master.add_money(clienttask.getPointe());
                    }
                }
            }
        }
        this.show_client_master(client_pay_remvo_momey,master_add_momey);


    }
    public void show_client_master(Integer client_pay_remvo_momey,Integer master_add_momey){
        if (client_pay_remvo_momey>0 && master_add_momey>0){
            System.out.println("У клинета списалось "+client_pay_remvo_momey);
            System.out.println("У мастеру  пришло  "+master_add_momey);
            return;
        }else
        {
            System.out.println("Мастера  или у клинета не хватает денег");
            return;
        }
    }
    public boolean isStatusTask(Status task_user,Status  master_status){
        return task_user == Status.done && master_status == Status.done;
    }
    public boolean is_not_null_master(Master master ,Client client){
        if(master == null || client == null)
        {
            return false;
        }
        return true;
    }
    @Override
    public TaskGlav Status_Task(TaskGlav taskGlav) {
        return null;
    }

    @Override
    public void Update_status_sub(ArrayList<TaskDeler> taskDelers, Integer count) {

    }

    @Override
    public void Sort(TaskGlav taskGlav) {

    }

    @Override
    public Integer count_done_status_sub(TaskGlav taskGlav) {
        return 0;
    }
}
