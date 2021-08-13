import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Lecture {
    /*
    BufferReader
        synchrone
        thread-safe
        lecture de la chaine de caractere String
        tampon de 8192

    read() -> lire un caractere 
    readLine() -> lire une chaine
    skip(N) -> ignore N caractére

    Scanner
        asynchrone
        no thread -safe
        lecture de données + parsing
        tampoon de 1024 caracteres
    */
    public static void main(String[] args) throws Exception{
        
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader lire = new BufferedReader(str);
        System.out.print("Comment t'appel tu?");
        String reponse = lire.readLine();

        System.out.println(reponse);
        
    }
    
}
