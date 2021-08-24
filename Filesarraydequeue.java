import java.util.ArrayDeque;
import java.util.Iterator;
/** 
 * ArrayDeque: ordonnée, accepte les doublons, refuse les valeurs null, non thread safe.
    Agie comme une pile mais non threadé.
*/
public class Filesarraydequeue{
    public static void main(String[] args) {
        ArrayDeque<String> entier = new ArrayDeque<String>();

        entier.addFirst("sami");
        entier.addLast("Fouchal");
        entier.add("Lebeau");
        entier.addLast("Fouchal");

        entier.removeLastOccurrence("Fouchal");

        Iterator it = entier.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        
        String Sami = entier.element();


        
    }
}