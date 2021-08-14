import sf.Abstrait;
import sf.Lion;
import sf.Tigre;
public class ClasseAbstrait {
    public static void main(String[] args) {
        Abstrait Lion = new Lion();
        Abstrait Tigre = new Tigre();
        System.out.println(Lion.Nommer());
        Lion.manger();
        Tigre.manger();

        Lion.parler();
        Tigre.parler();
        System.out.println(Tigre.Nommer());

        
    }
}
