package tasmaneger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract  class Person {
    private String lname = "";
    private  String fname ="";
    private  Integer age =0;
    private Integer Id = 0;
    private ArrayList<TaskGlav> taskGlavs = new ArrayList<>();
    private Integer money =0;
    Person(String lname,String fname,Integer age,Integer id,Integer money){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.money = money;
        this.Id = id;
    }
    public void addTask(TaskGlav taskGlav){
        this.taskGlavs.add(taskGlav);
    }


    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public ArrayList<TaskGlav> getTaskGlavs() {
        return taskGlavs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                ", taskGlavs=" + taskGlavs +
                ", money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(lname, person.lname) && Objects.equals(fname, person.fname) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lname, fname, age);
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
