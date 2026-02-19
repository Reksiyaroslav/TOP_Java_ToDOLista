package work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public abstract  class Person {
    private String lname = "";
    private  String fname ="";
    private  Integer age =0;
    private  ArrayList<TaskGlav> taskGlavs = new ArrayList<TaskGlav>();
    Person(String lname,String fname,Integer age,ArrayList<TaskGlav>  taskGlavs){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.taskGlavs = taskGlavs;
    }

    public ArrayList<TaskGlav> getTaskGlavs() {
        return taskGlavs;
    }

    public void setTaskGlavs(ArrayList<TaskGlav> taskGlavs) {
        this.taskGlavs = taskGlavs;
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

    @Override
    public String toString() {
        return "Person{" +
                "lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", age=" + age +
                ", taskGlavs=" + taskGlavs +
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
}
