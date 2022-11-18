import java.util.*;
import java.util.ArrayList.*;

class LaFerme
{
    ArrayList<Animal> animaux = new ArrayList<>(); 

    public void ajouteAnimal( Animal a )
    {
        animaux.add( a );
    }

    public void atable( )
    {
        for (Animal a : animaux ) 
        {
            a.manger();    
        }
    }

    // getAnimalByName( )
    public Animal appeler( String nom )
    {
        for (Animal a : animaux ) 
        {
            if ( a.nom.equals(nom) )
                return a;    
        }
        return null;
    }
}

class Animal
{
    String nom;

    public Animal( String nom  )
    {
        this.nom = nom;
    }

    public Animal()
    {
        this.nom = "inconnu" ;
    }

    public void manger()
    {        
    }
}

class Bovin extends Animal
{
    public Bovin( String nom )
    {
        super( nom );
    }
    public void manger()
    {
        System.out.println( String.format("je m'appelle %s, je suis un bovin et, je mange de l'herbe." , this.nom )  );
    } 
}

class Ovipare extends Animal
{
    int nbrAile = 2;

    public Ovipare( String nom )
    {
        super( nom );
    }
    public void manger()
    {
        System.out.println( String.format("je m'appelle %s, je suis un ovipare et, je mange des graines." , this.nom )  );
    } 
}

class Lapin extends Animal
{
    public Lapin( String nom )
    {
        super( nom );
    }
    public void manger()
    {
        System.out.println( String.format("je m'appelle %s, je suis un lapin et, je mange des carottes.", this.nom )  );
    } 
}


class  POOLaFermeOne {
    // Xavier

    public static void main(String[] args) 
    {

        Bovin v2 = new Bovin( "noiraude" ); 
        Bovin v3 = new Bovin( "Charal" ); 

        Ovipare p1 = new Ovipare( "Gasby"  );
        Ovipare p2 = new Ovipare( "KFC"  );
        Ovipare p3 = new Ovipare( "Doux"  );

        Lapin l1 = new Lapin( "jeannot"  );
        Lapin l2 = new Lapin( "Bugs"  );
        Lapin l3 = new Lapin( "Panpan"  );


        LaFerme f1 = new LaFerme();

        f1.ajouteAnimal( new Bovin( "marguerite" ) );
        f1.ajouteAnimal( v2 );
        f1.ajouteAnimal( v3 );

        f1.ajouteAnimal( p1 );
        f1.ajouteAnimal( p2 );
        f1.ajouteAnimal( p3 );

        f1.ajouteAnimal( l1 );
        f1.ajouteAnimal( l2 );
        f1.ajouteAnimal( l3 );

        f1.atable();
        
        Animal animal = f1.appeler( "marguerite" );
        animal.nom = "margot";

        f1.atable();

    }
}