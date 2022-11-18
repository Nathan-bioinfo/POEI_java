package classes;

public class House_ad extends Basic_ad
{
    float surface;
    Localisation localisation;
    public House_ad(String p_name,String p_seller_name,float p_price,float p_surface, Localisation p_localisation)
    {
        super(p_name,p_seller_name,p_price);
        this.surface = p_surface;
        this.localisation = p_localisation;
    }

}