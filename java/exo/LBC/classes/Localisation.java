package classes;

public class Localisation
{
    String street;
    int number;
    String city;
    int zip;

    public Localisation(String p_street, int p_number, String p_city, int p_zip)
    {
        this.street = p_street;
        this.number = p_number;
        this.city = p_city;
        this.zip = p_zip;
    }
}