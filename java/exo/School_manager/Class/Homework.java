package Class;
public class Homework {
    String name;
    Teacher teacher;
    Boolean is_finished;
    public Homework(String p_name,Teacher p_teacher)
    {
        this.name = p_name;
        this.teacher = p_teacher;
        this.is_finished = false;
    }
    public String get_name()
    {
        return this.name;
    }
}
