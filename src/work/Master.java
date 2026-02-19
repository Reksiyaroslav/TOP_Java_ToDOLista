package work;

import java.util.ArrayList;

public class Master extends  Person{
    private String type_master ="";
    public  Master(String lname, String fname, Integer age, String type_master, ArrayList<TaskGlav> taskGlavs){
        super(lname,fname,age,taskGlavs);
        this.type_master = type_master;
    }
    public ArrayList<TaskGlav> delete_task(Integer id){
        this.getTaskGlavs().remove(id);
        return  this.getTaskGlavs();
    }

    @Override
    public String toString() {
        return "Master{" +
                "type_master='" + type_master + '\'' +
                '}';
    }
}
