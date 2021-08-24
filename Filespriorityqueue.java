
import java.util.PriorityQueue;
import java.util.Iterator;

/**
 * PriorityQueue: ordonnée, accepte les doublons, refuse les valeurs nulles, pas Thread-Safe. 
 * 
*/
public class Filespriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> entier = new PriorityQueue<Integer>();


        entier.add(122);
        entier.add(1215);
        entier.add(0);

        Iterator it = entier.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
         }

        }


}
