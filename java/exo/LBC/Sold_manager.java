import classes.*;

public class Sold_manager
{   
    public static void main(String[] args) 
    {
        Basic_ad a1 = new Basic_ad();
        a1.set_ad();
        System.out.println(a1);
        a1.save_request();
    }
}