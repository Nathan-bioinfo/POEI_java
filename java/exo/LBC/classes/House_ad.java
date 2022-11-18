package classes;

public class House_ad extends Basic_ad
{
    int surface;
    String localisation;
    public House_ad()
    {
    }
    public String toString()
    {
        String res = "House ad\n";
        res += super.toString();
        res += String.format("\nsurface:%s\nlocalisation:%s",this.surface,this.localisation);
        return res;
    }
    public void set_ad()
    {
        super.set_ad();
        System.out.println("surface ?");
        try
        {
            this.surface = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("Need an int for surface, setting the surface to zero.");
            this.surface = 0;
        }
        System.out.println("localisation ?");
        this.localisation = sc.nextLine();
    }

}