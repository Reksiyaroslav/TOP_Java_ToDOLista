import tasmaneger.*;
import work.TaskDataArrayList;
import work.TaskDataArrayListDeler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static tasmaneger.Utilss_Task.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskDataArrayListDeler  taskDataArrayListDeler = new TaskDataArrayListDeler();
        taskDataArrayListDeler.init_TaskDelerArrayList();
        Utilss_Task  utilssTask = new Utilss_Task();
        Utilas_pay utilasPay = new Utilas_pay();
        TaskGlav taskGlav1 = new TaskGlav("Туалет",1,200);
        TaskGlav taskGlav2 = new TaskGlav("Водопровот",2,10);
        taskGlav1.AddSubs(taskDataArrayListDeler.getTaskDelerArrayList());
        taskGlav2.AddSubs(taskDataArrayListDeler.getTaskDelerArrayList());
        Master master = new Master("Olerg","Moler",40,12,0,"сантехник");
        Client client = new Client("Oler","Roler",50,16,400);
        utilasPay.master_addMoney_Client_remove(master,client);
        client.addTask(taskGlav1);
        client.addTask(taskGlav2);
        client.givesTask_The_Master(master,1);
        client.givesTask_The_Master(master,2);
        System.out.println(master);
        System.out.println(client);
        utilssTask.Update_Tasl(master.getTaskGlavs());
        utilasPay.master_addMoney_Client_remove(master,client);
        System.out.println(master);
        System.out.println(client);
        while (true)
        {
            System.out.println("Выберете то хотите полуить самые большие такски - 1 Самые мальнькие таски -2 Выход-0");
            Scanner scanner = new Scanner(System.in);
            Integer values = scanner.nextInt();
            if(values==1)
            {
                utilasPay.show_money_task(values,client.getTaskGlavs());
            }else if(values==2)
            {
                utilasPay.show_money_task(values,client.getTaskGlavs());
            }
            else
            {
                System.out.println("Вы вышли из этого");
             break;
            }
        }
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