package classes;

public class Job_ad extends Basic_ad
{
    String position;
    int wage;
    String localisation;
    public Job_ad()
    {
    }
    public String toString()
    {
        String res = "Job ad\n";
        res += super.toString();
        res += String.format("\nposition:%s\nwage:%d\nlocalisation:%s",this.position,this.wage,this.localisation);
        return res;
    }
    public void set_ad()
    {
        super.set_ad();
        System.out.println("position ?");
        this.position = sc.nextLine();
        System.out.println("wage ?");
        try
        {
            this.wage = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("Need an int for wage, setting the wage to zero.");
            this.wage = 0;
        }
        this.localisation = sc.nextLine();;
    }
}