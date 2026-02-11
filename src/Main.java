import dir_OOP.Cat;
import dir_OOP.UserService;
import dir_OOP.Employee;

import java.awt.*;
import java.util.*;
import static work.Shop.total_sum_sovar;
import static work.Shop.Show_product;

import work.*;

import static work.Utils.Sort;
import static  work.Utils.acherv;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskDataArayGlav taskData = new TaskDataArayGlav();
        TaskManager taskManager = new TaskManager(taskData.getTaskGlavs());
        taskManager.Update_tas();
        Sort(taskManager);
        System.out.print(Arrays.toString(taskManager.getTaskGlavs()));
        System.out.println(acherv(taskManager.getTaskGlavs()).toString());

    }
    /// создать магазин котторые будет выводить уже готовый продукт вот функци вывода должа быть стаиеским и несколько класов один шитате функий
    /// 1- enum  три мода inprogers  new  dan
    /// 2 - сделай  два массивы  где есть глана задаа и от него есть  базовые действи
    /// другой   провеку тобы если оно новео то пока такски не сделаны если уже делаетс то нужно наать закакниввать доплнительные такски
    ///  то закрывает
    ///  comtetor
    /// новый метод которы оправлетс в архив
}