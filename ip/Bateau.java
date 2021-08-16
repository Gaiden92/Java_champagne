package ip;

public class Bateau extends Vehicules implements Flyable {
    public Bateau(){
        this.m_MovementSpeed = 16;
    
    }

    public void movexy(int x, int y){
        System.out.println("Le navire brasse les flots en " +x+ " en X et :" +y+ " en Y.");
    }

    public void voler(String energie){
        System.out.println("Le navire vole a present grace a " + energie);
    }

    public void booster(int x){
        System.out.println("Le navire est booste de " +x);
    }

    

}
