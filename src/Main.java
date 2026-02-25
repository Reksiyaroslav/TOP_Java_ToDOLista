import tasmaneger.*;
import work.TaskDataArrayList;

import java.util.ArrayList;

import static tasmaneger.Utilss_Task.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskDataArrayList taskDataArayGlava = new TaskDataArrayList();
        Utilss_Task  utilssTask = new Utilss_Task();
        Utilas_pay utilasPay = new Utilas_pay();
        taskDataArayGlava.inti_task();
        ArrayList<TaskDeler> taskDelerArrayList = new ArrayList<>();
        taskDelerArrayList.add(new TaskDeler("Сдлетаь раковлению ",1));
        taskDelerArrayList.add(new TaskDeler("Сдлетаь пароливрлав ",2));
        TaskGlav taskGlav = new TaskGlav("Туалет",1,20);
        taskGlav.AddSubs(taskDelerArrayList);
        Master master = new Master("Olerg","Moler",40,12,0,"сантехник");
        Client client = new Client("Oler","Roler",50,16,400);
        utilasPay.master_addMoney_Client_remove(master,client);
        client.addTask(taskGlav);
        client.givesTask_The_Master(master,1);
        System.out.println(master);
        System.out.println(client);
        utilssTask.Update_Tasl(master.getTaskGlavs());
        utilasPay.master_addMoney_Client_remove(master,client);
        System.out.println(master);
        System.out.println(client);
        System.out.print(client.getTaskGlavs().toString());
        System.out.println(achev(client.getTaskGlavs()));

    }
    /// создать магазин котторые будет выводить уже готовый продукт вот функци вывода должа быть стаиеским и несколько класов один шитате функий
    /// 1- enum  три мода inprogers  new  dan
    /// 2 - сделай  два массивы  где есть глана задаа и от него есть  базовые действи
    /// другой   провеку тобы если оно новео то пока такски не сделаны если уже делаетс то нужно наать закакниввать доплнительные такски
    ///  то закрывает
    ///  comtetor
    /// новый метод которы оправлетс в архив

    /// 1 -мастер и персон  клиент от персона
    ///  2 -  массив или когото одна зада  одал зада  нова зада


    //        String  title_areare="Квратиры";
//        Integer with_apartment = 20;
//        Integer length_apartment = 40;
//        Integer S_apartment = with_apartment*length_apartment;
//        String title_home = "Дом";
//        Integer with_home  =40;e
//        Integer length_home = 50;
//        Integer S_home =  with_home*length_home;
//        String  relult = (S_apartment>S_home)?"Больше":(S_apartment<S_home)?"Меньше":"Равны";
//        System.out.println(String.format("Название %s  ширина м %d  Длина  м %d Плошать кв.м^2 %d",title_areare,with_apartment,length_apartment,S_apartment) );
//        System.out.println(String.format("Название %s  ширина м %d  Длина  м %d Плошать кв.м^2 %d",title_home,with_home,length_home,S_home) );
//
//        System.out.println(String.format("Плошать %s %s  Плошать %s" ,title_areare,relult,title_home));
//        String[] titels = {title_areare,title_home};
//        for( String title:titels)
//        {
//            System.out.println(String.format("Назавание %s",title));
//        }
}