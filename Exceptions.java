import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Exceptions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try { //Essayer ces instructions. 1 seul try
            System.out.println("Quel est votre année de naissance?");
            int anneeNaissance = sc.nextInt();
            int annee = Year.now().getValue();
            int age = annee - anneeNaissance;
            System.out.println("Vous avez " + age + " ans.");
        } catch (Exception e) { //Si erreur, on "attrape" l'erreur est on peut mettre un message à la place pour l'utilisateur. Plusieurs catch
            
            e.printStackTrace(); //permet de ressortir pas a pas l'origine de l'erreur
            System.out.println("Erreur : " + e.getMessage());
            
        } 

        
    }
}
