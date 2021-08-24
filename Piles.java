import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;


/*

ArrayList (tableau dynamique): mono -thread, acces direct, optimisé pour de la lecture
LinkedList: insertion rapide
Vector: multi -thread, acces direct, optimisé pour de la lecture
Stack: multi -thread, LIFO "last in, last out"

Capacité = combien peut ton placer dans le arraylist ou dans le vector
Taille = combien d'élement y a t il actuellement dans le arraylist ou dans le vector
*/



public class Piles {
    public static void main(String[] args) {
        
        Cat Felix = new Cat("Felix", 5);
        Cat Garfield = new Cat("Garfield", 8);
        Cat Grosminet = new Cat("Grosminet", 4);
        Felix.miauler();
        Garfield.miauler();
        Grosminet.miauler();

        Felix.SePresenter();
        
        /*
        ArrayList<Cat> groupe = new ArrayList<Cat>(5);

        //Création nouveau chat
        Cat Sheba = new Cat("Sheba", 2);
        
        //On ajoute le chat au groupe a l'index 0
        groupe.add(0, Sheba);

        //On ajoute les autres matous
        groupe.add(Felix);
        groupe.add(Garfield);
        groupe.add(Grosminet);

        //On appel la méthode "SePresenter" pour le chat a l'index 0
        groupe.get(0).SePresenter();

        //On appel la méthode "SePresenter" pour tout les chats
        for (Cat cat : groupe) {
            cat.SePresenter(); 
        }
        
        //Connaitre la taille de notre ArrayList "groupe"
        System.out.println("Taille = " + groupe.size());
        for (Cat chat : groupe) {
            chat.SePresenter();        }
            
        };

        /**************************LISTE CHAINEES (LinkedList)************************/
        
        /*LinkedList<Personnage> sayian = new LinkedList<Personnage>();

        Personnage Vegeta = new Personnage("Vegeta");
        Personnage Gohan = new Personnage("Sangohan");
        Personnage Goku = new Personnage("Sangoku");
        Personnage Broly = new Personnage("Broly");
        
        sayian.add(Vegeta);
        sayian.add(Gohan);
        sayian.add(Goku);
        sayian.add(Broly);
        */

    
        
        /**************************LES ITERATEURS (ListIterator)************************/
        //Tres utile pour parcourir des collections. Place un "curseur"
        /*ListIterator<Personnage> iterateur = sayian.listIterator();
            while(iterateur.hasNext())
                iterateur.next().sePresenter();
                /*
        /**************************LES PILES (Stack)************************/
            
        Stack<Cat> catPile= new Stack<Cat>();

        catPile.push(Felix);
        catPile.push(Grosminet);
        catPile.push(Garfield);

        Cat Cheba = new Cat("Cheba", 5);
        catPile.push(Cheba);

        ListIterator<Cat> it = catPile.listIterator();
       
        
        while(it.hasNext())
            it.next().donnerAge();
        
            catPile.pop();
        catPile.peek().SePresenter();
    }
}
