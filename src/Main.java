import dir_OOP.Cat;
import dir_OOP.UserService;
import dir_OOP.Employee;
import java.util.*;
import static work.Shop.total_sum_sovar;
import static work.Shop.Show_product;
import work.Product;
import work.TaskDeler;
import work.TaskGlav;
import work.TaskManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how GIGA IDE suggests fixing it.
//        String  name_cat = "Vasa";
//        Integer age_cat = 4;
//        String clic_cat = "Va";
//        Cat cat = new Cat(name_cat,age_cat,clic_cat);
//        cat.soung();
//        String[] data =  {"Oleg","2","3"};
//        Date date_user_on = new Date(2025,11,15);
//        String session =  "Username : Oleg Lastname Meler pat : dog patromyc :Lector";
//        UserService service = new UserService(session,data,date_user_on);
//        service.print();
//        String name_employee = "Jane";
//        Integer age_employee = 23;
//        String company_name = "Google";
//        Integer salary_employee = 4000;
//        Employee employee = new Employee(name_employee,age_employee,company_name,salary_employee);
//        employee.Show();
//        Product apple = new Product("Apple",5.5,-200.0);
//        Product banal = new Product("Banal",6.0,4000.0);
//        Product[] products =new Product[]{apple,banal};
//        Show_product(products);
//        total_sum_sovar(products);
        TaskDeler taskDeler = new TaskDeler("Oler mom ",1) ;
        TaskDeler taskDeler1 = new TaskDeler("Oler mom ",2) ;
        TaskDeler taskDeler2 = new TaskDeler("Oler mom ",3) ;
        TaskDeler[] taskDelers = new TaskDeler[]{taskDeler,taskDeler1,taskDeler2};
        TaskGlav taskGlav1 = new TaskGlav("moler",1,taskDelers);
        TaskGlav taskGlav2 = new TaskGlav("oler",2,taskDelers);
        TaskGlav[] taskGlavs = new TaskGlav[]{taskGlav1,taskGlav2};
        TaskManager taskManager = new TaskManager(taskGlavs);
        taskManager.Update_tas();
        taskManager.Show();
    }
    /// создать магазин котторые будет выводить уже готовый продукт вот функци вывода должа быть стаиеским и несколько класов один шитате функий
    /// 1- enum  три мода inprogers  new  dan
    /// 2 - сделай  два массивы  где есть глана задаа и от него есть  базовые действи
    /// другой   провеку тобы если оно новео то пока такски не сделаны если уже делаетс то нужно наать закакниввать доплнительные такски
    ///  то закрывает
}