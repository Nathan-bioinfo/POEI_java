package classes;
import java.util.Scanner;

public class Basic_ad
{
    String name;
    String seller_name;
    int price;
    Scanner sc = new Scanner(System.in);
    public Basic_ad()
    {   
    }
    public String toString()
    {
        System.out.println("---------------");
        return (String.format("name:%s\nseller name:%s\nprice:%d",this.name,this.seller_name,this.price));
    }
    public void set_ad()
    {
        System.out.println("name ?");
        this.name = sc.nextLine();
        System.out.println("seller name ?");
        this.seller_name = sc.nextLine();
        System.out.println("price ?");
        try
        {
            this.price = Integer.parseInt(sc.nextLine());
        }
        catch(Exception e)
        {
            System.out.println("Need an int for price, setting the price to zero.");
            this.price = 0;
        }
    }

    public String save_request()
    {
        String req = String.format("INSERT INTO basics (name,seller,price) VALUES(%s,%s,%d)",this.name,this.seller_name,this.price);
        System.out.println(req);
        return req;
    }

    public void set_name(String p_name)
    {
        this.name = p_name;
    }
    public void set_seller_name(String p_s_name)
    {
        this.seller_name = p_s_name;
    }
    public void set_price(int p_price)
    {
        this.price = p_price;
    }
    public String get_name()
    {
        return this.name;
    }
    public String get_seller_name()
    {
        return this.seller_name;
    }
    public int get_price()
    {
        return this.price;
    }
}