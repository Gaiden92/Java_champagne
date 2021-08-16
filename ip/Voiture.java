package ip;

public class Voiture extends Vehicules implements Flyable{
    public Voiture(){
        this.m_MovementSpeed = 80;
    }

    public void movexy(int x, int y){
        System.out.println("La voiture roule trés vite et fonce en : "+x+", "+y+".");
    } 

    public void voler(String energie){
        System.out.println("La voiture vole a present grace a " + energie);
    }

    public void booster(int x){
        System.out.println("La voiture est booste de " +x);
    }
}
