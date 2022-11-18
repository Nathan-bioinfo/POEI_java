import java.util.*;
import java.util.ArrayList.*;
import Actual_id.java;

class Grade
{
    float value;
    String section;
    String date;
    public Grade(float p_value,String p_section,String p_date)
    { 
        this.value = p_value;
        this.section = p_section;
        this.date = p_date;
    }
    public void get_value(float p_value)
    {
        this.value = p_value;
    }
    public float get_value()
    {
        return this.value;
    }
    public void get_section(String p_section)
    {
        this.section = p_section;
    }
    public String get_section()
    {
        return this.section;
    }
    public void get_date(String p_date)
    {
        this.date = p_date;
    }
    public String get_date()
    {
        return this.date;
    }
}

class Person
{
    String first_name;
    String last_name;
    int id;
    public Person(String p_first_name,String p_last_name,int p_id)
    {
        this.first_name = p_first_name;
        this.last_name = p_last_name;
        this.id = p_id;
    }
    public void display_infos()
    {
        System.out.println(String.format("Personal id: %d\nName:%s %s",id,first_name,last_name));
    }
}

class Student extends Person
{
    String section;
    public ArrayList<Grade> grades; 
    float average_grade;
    public Student(String p_first_name,String p_last_name,int p_id,float p_avg, String p_section)
    {
        super(p_first_name,p_last_name,p_id);
        this.section = p_section;
        this.average_grade = 0;
        this.grades = new ArrayList<>(); 
    }
    public void display_infos()
    {
        System.out.println(String.format("---------\nType : Student\nPersonal id: %d\nName:%s %s\nAverage grade: %.2f\nSection: %s",id,first_name,last_name,average_grade,section));
    }
    public void add_grade(Grade p_grade)
    {
        grades.add(p_grade);
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

class Teacher extends Person
{
    String speciality;
    float wage;
    public Teacher(String p_first_name,String p_last_name,int p_id,float p_wage, String p_speciality)
    {
        super(p_first_name,p_last_name,p_id);
        this.wage = p_wage;
        this.speciality = p_speciality;
    }
    public void display_infos()
    {
        System.out.println(String.format("---------\nType : Teacher\nPersonal id: %d\nName:%s %s\nWage: %.2f\nSpeciality: %s",id,first_name,last_name,wage,speciality));
    }
    public void set_wage(float p_wage)
    {
        this.wage = p_wage;
    }
}

class Volunteer extends Person
{
    String work_type;
    public Volunteer(String p_first_name,String p_last_name,int p_id,String p_work_type)
    {
        super(p_first_name,p_last_name,p_id);
        this.work_type = p_work_type;
    }
    public void display_infos()
    {
        System.out.println(String.format("---------\nType : Volunteer\nPersonal id: %d\nName:%s %s\nWork type: %s",id,first_name,last_name,work_type));
    }
}

class Classeroom
{
    String name;
    Teacher teacher;
    ArrayList<Student> students;
    public Classe(String p_name,Teacher p_teacher)
    {
        this.name = p_name;
        this.teacher = p_teacher;
        students = new ArrayList<>();
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
    public void show_students()
    {
        for(Student s : students)
        {
            System.out.println(String.format("Student: %s\nAverage: %f",s.name,s.get_average_grade()));
        }
    }
}

class School
{
    ArrayList<Person> persons = new ArrayList<>(); 
    ArrayList<Classeroom> classerooms = new ArrayList<>();

    public void add_classeroom(Classeroom p_classeroom)
    {
        classerooms.add(p_classeroom);
    }

    public void add_person(Person p) 
    {
        persons.add(p);
    }

    public Classeroom get_classeroom(String p_name) 
    {
        for (Classeroom c : classerooms) 
        {
            if (c.name.equals(p_name))
                return c;
        }
        return null;
    }

    public ArrayList<Person> get_person(String p_f_name, String p_l_name) 
    {
        ArrayList<Person> persons_founds = new ArrayList<>();
        for (Person p : persons) 
        {
            if (p.first_name.equals(p_f_name) && p.last_name.equals(p_l_name))
                persons_founds.add((Person)p);
        }
        return persons_founds;
    }
}

public class School_manager 
{   
    public static void main(String[] args) 
    {
        Actual_id actual_id = new Actual_id(0);
        School harvart = new School();
        harvart.add_person(new Student("John", "Rambo",actual_id.get_id(),12,"Biologie"));
        ArrayList<Person> my_research =  harvart.get_person("John","Rambo");
        System.out.println(my_research.size());
        for(Person p: my_research)
        {
            System.out.println("test");
            if(p != null && p.getClass().getSimpleName().equals("Student"))
            {
                System.out.println("test 2");
                Student my_student = (Student) p;
                System.out.println(my_student.get_average_grade()); 
                my_student.add_grade(new Grade(18f,"Biologie","12/02/2022"));
                my_student.add_grade(new Grade(20f,"Maths","18/02/2022"));
                my_student.add_grade(new Grade(12f,"French","14/03/2022"));
                System.out.println(my_student.get_average_grade()); 
            }
        }

        // add devoir pour les élèves
        // un prof par classe ou même plusieurs
    }
}
