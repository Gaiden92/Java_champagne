import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.util.Arrays;

public class Pendu { 
    public static void main(String[] args) throws Exception { 
        String motSecret = "mouton";
        String motCrypte = "******";
        
        
        char crypte = '*';
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader lire = new BufferedReader(str);
        System.out.println("Bienvenue dans le pendu");
        int i = 10;
        do{
            System.out.println("\n Devinez le mot secret: " + motCrypte);
            System.out.println("Entrez une voyelle:");
            char reponse = lire.readLine().charAt(0);

            for(int j = 0; j < motSecret.length(); j++){
                if(motSecret.charAt(j) == reponse){
                    char ancienneLettre = motCrypte.charAt(j);
                    motCrypte += reponse;
                } else {
                    motCrypte += '*';
                }
            }


           
            i--;
        }
        while(i > 0);
        
    }


}
