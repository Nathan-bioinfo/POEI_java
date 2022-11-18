import java.util.*;

import Class.Actual_id;
import Class.Classeroom;
import Class.Grade;
import Class.Homework;
import Class.Person;
import Class.School;
import Class.Student;
import Class.Teacher;
import Class.Volunteer;
import Class.Classeroom;
import Class.School;

public class School_manager 
{   
    public static void main(String[] args) 
    {
        Actual_id actual_id = new Actual_id(0);

        School harvart = new School();

        Classeroom sixG = new Classeroom("6th grade",null);
        harvart.add_classeroom(sixG);
        Classeroom fourthG = new Classeroom("4th grade",null);
        harvart.add_classeroom(fourthG);

        Person p = new Student("John", "Rambo",actual_id.get_id(),12,sixG);
        harvart.add_person(p);
        p = new Student("Fifi", "Brindacier",actual_id.get_id(),15,sixG);
        harvart.add_person(p);
        p = new Student("Lionel", "Jospin",actual_id.get_id(),11,fourthG);
        harvart.add_person(p);
        p = new Student("Jeanne", "Calmant",actual_id.get_id(),13,fourthG);
        harvart.add_person(p);
        p = new Student("Paco", "Rabanne",actual_id.get_id(),15,sixG);
        harvart.add_person(p);
        p = new Student("Michel", "Simens",actual_id.get_id(),15,sixG);
        harvart.add_person(p);
        p = new Student("Julius", "Maximus",actual_id.get_id(),18,fourthG);
        harvart.add_person(p);
        p = new Student("Marco", "Polo",actual_id.get_id(),14,sixG);
        harvart.add_person(p);
        p  = new Teacher("John", "Rambo",actual_id.get_id(), 1800, "war");
        harvart.add_person(p);
        p  = new Teacher("Willy", "Wonka",actual_id.get_id(), 2400, "baking");
        harvart.add_person(p);

        for(Person pers: harvart.get_all_persons())
        {
            if(pers.getClass().getSimpleName().equals("Student"))
            {
                Student my_student = (Student) pers;
                if(my_student.get_classeroom().equals(sixG.get_name()))
                {
                    sixG.add_student((Student)pers);
                }
            }
        }

        ArrayList<Person> my_research =  harvart.get_person("John","Rambo");
        
        for(Person pers: my_research)
        {
            if(pers != null && pers.getClass().getSimpleName().equals("Teacher"))
            {
                Teacher rambo = (Teacher)pers;
                sixG.set_teacher(rambo);
                Homework h1 = new Homework("Learn how to save America", rambo);
                for(Student stu : sixG.get_student())
                {
                    stu.add_homework(h1);
                }
            }
        }
        
        for(Student stud : sixG.get_student())
        {
            ArrayList<Homework> student_homework = new ArrayList<>();
            student_homework =  stud.get_homeworks();
            System.out.println(String.format("------------\nStudent name : %s %s\nHomeworks: %s",stud.first_name,stud.last_name,student_homework.get(0).get_name()));
        }
        

        /*
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
        */
    }
}