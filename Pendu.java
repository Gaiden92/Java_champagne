import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;

public class Pendu { 
    public static void main(String[] args) throws Exception { 
        String motSecret = "Mouton";
        char crypte = '*';
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader lire = new BufferedReader(str);
        System.out.println("Bienvenu dans le pendu");

        do{
            System.out.println("Devinez le mot secret:" + motSecret);
            System.out.println("Entrez une voyelle:");
            
            String reponse = lire.readLine();
            System.out.println("Yes");
            motSecret = motCrypter(reponse, motSecret);
            System.out.println(motSecret);
        }
        while( motSecret.indexOf(crypte) > 0);
        
    }


    public static String motCrypter(String x, String mot){
        String nouveauMot = "";
        try {
            if(mot.indexOf(x) == 1){
                nouveauMot += x;
            } else {
                nouveauMot += '*';
            }
        } catch (Exception e) {
            System.out.println("Merci d'entrez une lettre");
        }
        
        return nouveauMot;
    }
}
