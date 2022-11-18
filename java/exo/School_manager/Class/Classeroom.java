package Class;
import java.util.*;
public class Classeroom
{
    String name;
    Teacher teacher;
    ArrayList<Student> students;
    public Classeroom(String p_name,Teacher p_teacher)
    {
        this.name = p_name;
        this.teacher = p_teacher;
        students = new ArrayList<>();
    }
    public String get_name()
    {
        return name;
    }
    public void set_teacher(Teacher p_teacher)
    {
        this.teacher = p_teacher;
    }
    public Teacher get_teacher()
    {
        return this.teacher;
    }
    public void add_student(Student p_student)
    {
        students.add(p_student);
    }
    public ArrayList<Student> get_student()
    {
        return students;
    }
}