package Class;
import java.util.*;

public class Student extends Person
{
    public ArrayList<Grade> grades; 
    public float average_grade;
    public ArrayList<Homework> homeworks;
    public Classeroom classeroom;
    public Student(String p_first_name,String p_last_name,int p_id,float p_avg, Classeroom p_classeroom)
    {
        super(p_first_name,p_last_name,p_id);
        this.classeroom = p_classeroom;
        this.average_grade = 0;
        this.grades = new ArrayList<>(); 
        this.homeworks = new ArrayList<>();
    }
    public String get_classeroom()
    {
        return classeroom.get_name();
    }
    public void display_infos()
    {
        System.out.println(String.format("---------\nType : Student\nPersonal id: %d\nName:%s %s\nAverage grade: %.2f\nSection: %s",id,first_name,last_name,average_grade,classeroom));
    }
    public void add_grade(Grade p_grade)
    {
        grades.add(p_grade);
    }
    public void add_homework(Homework p_homework)
    {
        homeworks.add(p_homework);
    }
    public ArrayList<Homework> get_homeworks()
    {
        return homeworks;
    }
    public float get_average_grade()
    {
        float  avg = 0;
        for(Grade g : grades)
        {
            avg += g.get_value();
        }
        avg /= grades.size();
        return avg;
    }
}