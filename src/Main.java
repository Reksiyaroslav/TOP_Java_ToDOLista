import dir_OOP.Cat;
import dir_OOP.UserService;
import dir_OOP.Employee;
import java.util.*;
import static work.Shop.total_sum_sovar;
import static work.Shop.Show_product;

import work.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskDeler taskDeler = new TaskDeler("Oler mom ",1) ;
        TaskDeler taskDeler1 = new TaskDeler("Oler mom ",3) ;
        TaskDeler taskDeler2 = new TaskDeler("Oler mom ",2) ;
        TaskDeler taskDeler4 = new TaskDeler("Oler mom ",3) ;
        TaskDeler taskDeler5 = new TaskDeler("Oler mom ",1) ;
        TaskDeler taskDeler6 = new TaskDeler("Oler mom ",2) ;
        TaskDeler[] taskDelers = new TaskDeler[]{taskDeler,taskDeler1,taskDeler2};
        TaskDeler[] taskDelers1 = new TaskDeler[]{taskDeler4,taskDeler5,taskDeler6};
        TaskGlav taskGlav1 = new TaskGlav("moler",1,taskDelers);
        TaskGlav taskGlav2 = new TaskGlav("oler",2,taskDelers1);
        TaskGlav[] taskGlavs = new TaskGlav[]{taskGlav1,taskGlav2};
        TaskManager taskManager = new TaskManager(taskGlavs);
        taskManager.Update_tas();
        System.out.println(Arrays.toString(taskManager.getTaskGlavs()));

    }
    /// создать магазин котторые будет выводить уже готовый продукт вот функци вывода должа быть стаиеским и несколько класов один шитате функий
    /// 1- enum  три мода inprogers  new  dan
    /// 2 - сделай  два массивы  где есть глана задаа и от него есть  базовые действи
    /// другой   провеку тобы если оно новео то пока такски не сделаны если уже делаетс то нужно наать закакниввать доплнительные такски
    ///  то закрывает
}