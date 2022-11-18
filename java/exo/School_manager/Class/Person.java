package Class;
public class Person
{
    public String first_name;
    public String last_name;
    public int id;
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