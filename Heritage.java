import jc.entities.*;

public class Heritage {
    public static void main(String[] args){
        Horse h = new Horse("Ablette");
        h.Move(15, 10);

        Pegasus p = new Pegasus("Pegase");
        p.Move(15, 10);

        p.fly(50);

        if(p instanceof Pegasus){ // Vérifié si un objet est bien une instance d'une classe 
            System.out.println("C'est un pegase");
        }
    }    
}
