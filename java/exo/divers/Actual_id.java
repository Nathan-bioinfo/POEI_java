import java.util.*;
import java.util.ArrayList.*;

public class Actual_id
{
    int act_id;
    public Actual_id(int p_id)
    {
        this.act_id = p_id;
    }
    public void set_act_id(int p_id)
    {
        this.act_id = p_id;
    }
    public int get_id()
    {
        act_id ++;
        return act_id;
    }
}