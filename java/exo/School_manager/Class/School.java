package Class;
import java.util.*;
public class School
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

    public ArrayList<Person> get_all_persons() 
    {
        return persons;
    }
}
