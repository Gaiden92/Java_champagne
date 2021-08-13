import java.util.StringTokenizer;
public class Caracteres {
    public static void main(String[] args) {
        // les chaines de caractére
        /*Les chaines de caracteres sont immuables
        .concat() -> concatener 2 chaines
        .lenght() -> connaitre la taille d'une string
        .toUpperCase -> mets en majuscule
        .toLowerCase -> met en minuscule
        .trim() -> enleve les espaces devant et aprés la chaine de caractére
        .replace(old, new) -> permet de remplace un caractere par un autre
        .substring(index, nombre) -> permet de couper une chaine a partir de l'index demander par le nombre.
        
       
        
        
        */
        String prenom = "Sami";
        String nom = "Fouchal";
        String adresse = "                 9 alle des orangers";
        adresse = adresse.trim();
        System.out.println(prenom.concat(" ").concat(nom));
        System.out.println(prenom.length());
        System.out.println(adresse);

        /* Classes spécifique
        StringTokenizer
        StringBuilder
        append();
        lenght();
        StringBuffer fonctionne exactement de la meme maniére que StringBuilder MAIS
        StringBuilder (asynchronise): a utilisé pour du code monothreadé : grosso modo 1 seule route
        StringBuffer (synchronisé et thread-safe): a utilisé pour du code multithreadé : grosso modo plusieurs routes

        //Muable (modifiable)*/
        String s = "https/sami-fouchal.fr/home";
        StringTokenizer st = new StringTokenizer(s, "/");
        while(st.hasMoreTokens())
        System.out.println(st.nextToken());

        StringBuilder strBuil = new StringBuilder("Bonjour");
        strBuil.insert(0, "Hello ");
        System.out.println(strBuil);
    }
}
