package classes;

public class Vehicle_ad extends Basic_ad
{
    int kilometrage;
    String color;
    String brand;
    String model;
    
    public Vehicle_ad()
    {
    }
    public String toString()
    {
        String res = "Vehicle ad\n";
        res += super.toString();
        res += String.format("\nkm:%d\ncolor:%s\nbrand:%s\nmodel:%s",this.kilometrage,this.color,this.brand,this.model);
        return res;
    }
    public void set_ad()
    {
        super.set_ad();
        System.out.println("kilometrage ?");
        try
        {
            this.kilometrage = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("Need an int for kilometrage, setting the kilometrage to zero.");
            this.kilometrage = 0;
        }
        System.out.println("color ?");
        this.color = sc.nextLine();
        System.out.println("brand ?");
        this.brand = sc.nextLine();
        System.out.println("model ?");
        this.model = sc.nextLine();
    }

}