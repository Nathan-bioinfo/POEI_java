package Class;

public class Grade
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