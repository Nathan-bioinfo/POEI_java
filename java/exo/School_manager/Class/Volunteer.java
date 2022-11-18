package Class;
public class Volunteer extends Person
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