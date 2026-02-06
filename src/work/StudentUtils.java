package work;

public class StudentUtils {

    public  static  Student find_by_name(Student[] students,String targetname)
    {
        for(Student student:students)
        {
            if( student!= null &&student.getFirst_name().equals( targetname))
            {
                return  student;
            }
        }
        return  null;
    }
    public  static  Student  getAll(Student[] students)
    {
        for(Student student:students)
        {
            if (student != null ) {
                System.out.println(student);
            }
        }
        return  null;
    }
}
