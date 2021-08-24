import java.util.HashSet;
/*
HashSet: pas de doublons, pas thread-safe, accés direct
A réimplémenter
equals()
hashCode()


*/
import java.util.Iterator;


public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hi = new HashSet<Integer>();
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
