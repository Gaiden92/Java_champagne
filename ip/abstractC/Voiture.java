package ip.abstractC;

public class Voiture extends Vehicules{
    public Voiture(){
        this.m_MovementSpeed = 80;
    }

    public void movexy(int x, int y){
        System.out.println("La voiture roule trés vite et fonce en : "+x+", "+y+".");
    }
}
