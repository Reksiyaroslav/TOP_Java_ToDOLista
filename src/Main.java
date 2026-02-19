import work.Master;
import work.TaskDataArrayList;
import work.TaskGlav;
import work.TaskManager;

import java.util.ArrayList;
import java.util.Arrays;

import static work.Utils.Sort;
import static work.Utils.acherv;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskDataArrayList taskDataArayGlava = new TaskDataArrayList();
        taskDataArayGlava.inti_task();
//        Master master= new Master("lore","moler",40,"Static eleg");
//        Master[] masters = new Master[]{};
        TaskManager taskManager;
        taskManager = new TaskManager(taskDataArayGlava.getArrayGlavs());
        taskManager.Update_tas();
        Sort(taskManager);
        System.out.print(taskManager.getTaskGlavs().toString());
        System.out.println(acherv(taskManager.getTaskGlavs()));
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
    /// создать магазин котторые будет выводить уже готовый продукт вот функци вывода должа быть стаиеским и несколько класов один шитате функий
    /// 1- enum  три мода inprogers  new  dan
    /// 2 - сделай  два массивы  где есть глана задаа и от него есть  базовые действи
    /// другой   провеку тобы если оно новео то пока такски не сделаны если уже делаетс то нужно наать закакниввать доплнительные такски
    ///  то закрывает
    ///  comtetor
    /// новый метод которы оправлетс в архив
}