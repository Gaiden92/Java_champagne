import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Lecture {
    /*
    
    read() -> lire un caractere 
    readLine() -> lire une chaine
    skip(N) ->

    
    */
    public static void main(String[] args) throws Exception{
        
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader lire = new BufferedReader(str);
        System.out.print("Comment t'appel tu?");
        String reponse = lire.readLine();

        System.out.println(reponse);
        
    }
    
}
