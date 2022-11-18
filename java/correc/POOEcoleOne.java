import java.util.*;
import java.util.ArrayList.*;

class Ecole 
{
    ArrayList<Individus> individus = new ArrayList<>();
    ArrayList<Classe> classes = new ArrayList<>();

    public void ajouter_classe(Classe p_classe)
    {
        classes.add(p_classe);
    }

    public void ajouterPersonne(Individus a) 
    {
        individus.add(a);
    }

    public Classe chercher_classe(String nomATrouver) 
    {
        for (Classe classe : classes) 
        {
            if (classe.nom.equals(nomATrouver))
                return classe;
        }
        return null;
    }

    public Individus chercher(String nomATrouver) 
    {
        for (Individus personne : individus) 
        {
            if (personne.nom.equals(nomATrouver))
                return personne;
        }
        return null;
    }

    public ArrayList<Eleve> listerEleve() 
    {
        ArrayList<Eleve> listRetour = new ArrayList<>();

        for (Individus personne : individus) 
        {
            if (personne.getClass().getSimpleName().equals("Eleve")) 
            {
                listRetour.add((Eleve) personne);
            }
        }
        return listRetour;
    }

    public void sonnerOuverture()
    {
        System.out.println("Dring ouverture");
    }

    public void sonnerFermeture()
    {
        System.out.println("Dring Dring fermeture");
    }


}

class Classe
{
    String nom;
    ArrayList<Eleve> eleves;
    public Classe(String p_nom)
    {
        this.nom = p_nom;
        eleves = new ArrayList<>();
    }
    public void ajouter_eleve(Eleve p_eleve)
    {
        eleves.add(p_eleve);
    }
    public void montre_eleves()
    {
        for(Eleve e : eleves)
        {
            System.out.println(String.format("Eleve: %s\nMoyenne: %f",e.nom,e.get_average()));
        }
    }
}

class Individus 
{
    String nom;
    public Individus(String nom) 
    {
        this.nom = nom;
    }
}

class Staff extends Individus 
{
    int salaire;

    public Staff(String nom) 
    {
        super(nom);
        this.salaire = 0;
    }

    public Staff(String nom, int salaire) 
    {
        super(nom);
        this.salaire = salaire;
    }
}

class Eleve extends Individus 
{
    ArrayList<Float> notes = new ArrayList<>();
    public Eleve(String nom) 
    {
        super(nom);
    }
    public void add_note(float p_note)
    {
        notes.add(p_note);
    }
    public float get_average()
    {
        float avg = 0;
        for(float n : notes)
        {
            avg += n;
        }
        avg /= notes.size();
        return avg;
    }
}

class Prof extends Staff 
{
    public Prof(String nom, int salaire) 
    {
        super(nom, salaire);
    }
}

class Cuisinier extends Staff 
{
    public Cuisinier(String nom, int salaire) 
    {
        super(nom, salaire);
    }

    public ouverture()
    {
        System.out.println( "regarder menu" );
        System.out.println( "sortir les ingrédients" );
        System.out.println( "allumer les fourneaux" );
    }

}

class Pion extends Staff 
{
    public Pion(String nom, int salaire) 
    {
        super(nom, salaire);
    }

    public ouverture()
    {
        System.out.println( "prends cahier appel" );
        System.out.println( "surveiller la cour" );
    }
}

class POOEcoleOne 
{
    // Xavier

    public static void main(String[] args) 
    {

        Ecole jaures = new Ecole();

        jaures.ajouterPersonne(new Eleve("toto"));
        jaures.ajouterPersonne(new Eleve("tata"));
        jaures.ajouterPersonne(new Prof("Marie", 1700));
        jaures.ajouterPersonne(new Cuisinier("René", 2000));
        //Classe c6A = new Classe("6eme A");
        jaures.ajouter_classe(new Classe("6eme A"));

        Individus inconnu = jaures.chercher("toto");

        if ( inconnu != null && inconnu.getClass().getSimpleName().equals("Eleve")) 
        {
            Eleve monEleve = (Eleve) inconnu;
            monEleve.add_note(12);
            monEleve.add_note(13);
            monEleve.add_note(17);
            System.out.println(monEleve.get_average()); 
        }

        Classe classe_inconnu = jaures.chercher_classe("6eme A");

        ArrayList<Eleve> lesEleves = jaures.listerEleve();

        if ( classe_inconnu != null && classe_inconnu.getClass().getSimpleName().equals("Classe")) 
        {
            Classe ma_classe = (Classe) classe_inconnu;
            for (Eleve eleve : lesEleves) 
            {
                System.out.println(eleve);
                ma_classe.ajouter_eleve(eleve);
            }
            ma_classe.montre_eleves();
        }
        
        jaures.sonnerOuverture();

    }
}