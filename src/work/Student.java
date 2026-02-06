package work;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String first_name= "Ivan";
    private String last_name="Ivanov";
    private Integer age = 1;
    public Student(String first_name,String last_name,Integer age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLast_name() {
        return last_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(first_name, student.first_name) && Objects.equals(last_name, student.last_name)
                && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first_name, last_name, age);
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.age,otherStudent.age);
    }

}
