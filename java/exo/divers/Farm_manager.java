import java.util.*;
import java.util.ArrayList.*;

class Farm
{
    ArrayList<Animal> animals  = new ArrayList();
    public void add_animal(Animal p_animal)
    {
        animals.add(p_animal);
    }
    public void display_animals()
    {
        for(Animal animal : animals)
        {
            animal.affiche();
        }
    }
}

class Animal
{
    protected String name;
    protected int weight;
    public Animal(String n, int p)
    {
        this.name = n;
        this.weight = p;
    }
    public Animal()
    {
        this.name = "unknown";
        this.weight = 0;
    }
    public void affiche()
    {
        System.out.println( String.format("name: %s\nweight: %d kg", this.name,this.weight));
    }
}

class Ruminant extends Animal
{
    protected String food;
    public Ruminant(String n,int p)
    {
        super(n,p);
        this.food = "grass";
    }
    public void affiche()
    {
        System.out.println( String.format("name: %s\nweight: %d kg\nfood: %s", this.name,this.weight, this.food));
    }
}

class Bird extends Animal
{
    protected String food;
    public Bird(String n,int p)
    {
        super(n,p);
        this.food = "corn";
    }
    public void affiche()
    {
        System.out.println( String.format("name: %s\nweight: %d kg\nfood: %s", this.name,this.weight, this.food));
    }
}

class Feline extends Animal
{
    protected String food;
    public Feline(String n,int p)
    {
        super(n,p);
        this.food = "meat";
    }
    public void affiche()
    {
        System.out.println( String.format("name: %s\nweight: %d kg\nfood: %s", this.name,this.weight, this.food));
    }
}

class Farm_manager
{
    public static void main(String[] args) 
    {
        Farm hill_valley_farm = new Farm();
        Ruminant animal_1 = new Ruminant("Margueritte",350);
        hill_valley_farm.add_animal(animal_1);
        Bird animal_2 = new Bird("Poupoulette",4);
        hill_valley_farm.add_animal(animal_2);
        Feline animal_3 = new Feline("Minette",7);
        hill_valley_farm.add_animal(animal_3);
        Feline animal_4 = new Feline("Matou",9);
        hill_valley_farm.add_animal(animal_4);
        Animal animal_5 = new Animal();
        hill_valley_farm.add_animal(animal_5);
        hill_valley_farm.display_animals();
    }
}
