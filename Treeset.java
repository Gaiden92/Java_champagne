import java.util.TreeSet;
/*
TreeSet: (arbre binaire, pas de doublons, pas thread-safe, ordonnée, pas d'acces direct
A réimplementer
compare()
compareTo()
*/
import java.util.Iterator;


public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> hi = new TreeSet<Integer>();
        hi.add(5);
        hi.add(10);
        hi.add(105);
        hi.add(-5);

        if(hi.contains(105)){
            System.out.println("Yes\n");
        } else {
            System.out.println("No");
        }
        Iterator i = hi.iterator();

        while(i.hasNext())
            System.out.print(i.next()+ ", ");
            
    }
}
