

public class Inverser {
    public static void main(String[] args) {
        String mot = "claudi";
        System.out.println(InverserVoyelles(mot));
    }



    public static String InverserChaine(String string){
        String stringInverser = "";
        for(int j = string.length() - 1 ; j >= 0; --j ){
            stringInverser += string.charAt(j);
        }
        return stringInverser;
    }



    public static String InverserVoyelles(String string){
        String mot = "";
        String nouveauMot = "";
        char voyelle;
        int i = 0;

        for(i = 0; i < string.length();i++){
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'y'){
                mot += string.charAt(i); 
            } 
        }
        
       mot = InverserChaine(mot); //retourne ma chaine de voyelles inversées
       
      
       
        
       do{
           //Ma condition
           if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'y'){
           
                voyelle = mot.charAt(0); //on insére la 1ere voyelle
                mot = mot.substring(1); // on la supprime ensuite
                nouveauMot += voyelle; //on ajoute la voyelle dans le mot

                } else {
                nouveauMot += string.charAt(i); //on ajoute la consonne dans le mot
            }
            i++;
       } while(i < string.length());
       
        return nouveauMot;
      
    }
}
