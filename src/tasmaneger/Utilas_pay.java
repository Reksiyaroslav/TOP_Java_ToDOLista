package tasmaneger;

import java.lang.ref.Cleaner;
import java.util.ArrayList;

public class Utilas_pay extends  AbUtils {
    public void master_addMoney_Client_remove(Master master, Client client){
        Integer client_pay_remvo_momey=0;
        Integer master_add_momey=0 ;
        if (master == null || client == null){
            System.out.println("Мастер или клинет не выбран");
        }else
        {

            ArrayList<TaskGlav> taskGlavsMaster = master.getTaskGlavs();
            ArrayList<TaskGlav> taskGlavsClient = client.getTaskGlavs();
            if(taskGlavsClient.isEmpty() || taskGlavsMaster.isEmpty() ) {
                System.out.println("У мастер или у клинета путые списко такски ");
                return;

            }else {
                for (TaskGlav clienttask : taskGlavsClient) {
                    for (TaskGlav mastertask : taskGlavsMaster) {
                        boolean equals = clienttask.getId().equals(mastertask.getId());
                        if (equals) {
                            client_pay_remvo_momey =  client.remove_money(clienttask.getPointe());
                            master_add_momey = master.add_money(clienttask.getPointe());
                        }
                    }
                }
            }

        }
        if (client_pay_remvo_momey>0 && master_add_momey>0){
            System.out.println("У клинета списалось "+client_pay_remvo_momey);
            System.out.println("У мастеру  пришло  "+master_add_momey);
        }else
        {
            System.out.println("Мастера  или у клинета не хватает денег");
        }

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
