package tasmaneger;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Comparator;
public class Utilas_pay extends  AbUtils implements Ma_min_prise_task {
    public void master_addMoney_Client_remove(Master master, Client client){
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
            ArrayList<Integer> prise = get_prise_full_task(taskGlavsClient,taskGlavsMaster);
             if (!prise.isEmpty()) {
                for (Integer amount : prise) {
                    pay_task_client_master(client, master, amount);
                }

             }
        }

    }
    public ArrayList<Integer> get_prise_full_task(ArrayList<TaskGlav> taskGlavsClient,ArrayList<TaskGlav> taskGlavsMaster){
        ArrayList<Integer> prise = new ArrayList<>();
        for (TaskGlav clienttask : taskGlavsClient) {
            for (TaskGlav mastertask : taskGlavsMaster) {
                boolean equals = clienttask.getId().equals(mastertask.getId());
                try {


                    if (equals && this.isStatusTask(clienttask.getStatus(), mastertask.getStatus())) {
                        prise.add(clienttask.getPointe());
                        break;
                    }
                }
                catch (MyExepts e)
                {
                    ExceptionHandler.handler(e);
                }
            }

        }
        return prise;
    }
    public void  pay_task_client_master(Client client,Master master,Integer amout){
        Integer client_pay_remvo_momey=0;
        Integer master_add_momey=0 ;
        try {
                client_pay_remvo_momey = client.remove_money(amout);
                master_add_momey = master.add_money(amout);
        } catch (MyExepts e) {
                ExceptionHandler.handler(e);
        }

        this.show_client_master(client_pay_remvo_momey, master_add_momey);
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
    public boolean isStatusTask(Status task_user,Status  master_status) throws MyExepts{
        if(task_user== null || master_status==null ){
            throw  new MyExepts("Нету правил ного статуса у пользовател или у мастера");
        }
        return task_user == Status.done && master_status == Status.done;
    }
    public boolean is_not_null_master(Master master ,Client client){
        if(master == null || client == null)
        {
            return false;
        }
        return true;
    }
    public void show_money_task(Integer values,ArrayList<TaskGlav> taskGlavs){
        if(values==1) {
            taskGlavs.stream().filter(s -> s.getStatus() == Status.done)
                    .sorted(java.util.Comparator.comparingInt(TaskGlav::getPointe).reversed())
                    .forEach(System.out::println);
        }else
        {
            taskGlavs.stream()
                    .filter(s -> s.getStatus() == Status.done)
                    .sorted(java.util.Comparator.comparingInt(TaskGlav::getPointe))
                    .forEach(System.out::println);
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
