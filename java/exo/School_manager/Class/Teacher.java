package Class;
public class Teacher extends Person
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