package ip;

public class Chaumiere extends Batiment {
    public Chaumiere(){
        System.out.println("La parcelle se met en place");
    }

    public void construire(String materiel){
        System.out.println("La chaumiere est en construction en " +materiel+ ".");
    }
}
