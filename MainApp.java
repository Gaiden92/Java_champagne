/*
Base numérique  décimal     (10 -> 0 à 10)
                binaire     (2 -> 0 à 1)
                octal       (8 -> 0 à 7)
                hexadécimal (16 -> 0 à F)
Nombre entier   15
                12_000
                74_500_000
Binaire                     0b1110010
Octale                      0755
Hexadécimale                0x1EF5T58     
*/    
public class MainApp 
{
    public static void main(String[] args)
    {
        System.out.println("\tHello World\n Baby\n");
        
        // Variables
        int ageUtilisateur = 34;
        System.out.println(ageUtilisateur + "\n");

        // Constantes
        final int VIE = 20;
        System.out.println(VIE + "\n\n");

        //Boucles et conditions
        int i = 0;
        for(i = 1; i <= 100; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("Ho yes et no");
            } else if(i % 3 == 0){
                System.out.println("Ho no");
            } else if(i % 5 == 0){
                System.out.println("Ho yes");
            } else{
            System.out.println(i);
            }
        }

        //Les opérateurs
            //opérateurs d 'affecation
            int age = 12; 
            System.out.println(age);

            //Concaténation
            System.out.println("Tu as " + age + " ans." );

            //Opérations + - * / %
            int result = 0;
            int annee = 33;
            int mois = 12;
            result = annee * mois;
            System.out.print(result + "\n");

            /*Comparaison
            != different
            == valeur
            === valeur et type
            <> <= >=*/ 

            //Conditions
                // && (et) || (ou)
      
           
            //if else if
            int test = 18;
            if(test != 24)
            
                System.out.println(true);
             else 
                System.out.println(false);
            //Switch
            int option = 2;
            switch (option)
            {
                case 1:
                System.out.println("option est égale à " + option);
                break;
                case 2 : 
                System.out.println("option est égale à " + option);
                break;
                default: 
                System.out.println("l'égalité d'option est inconnue");
                break;
            }
        //Boucles
            //while
            int k = 0;
            while(k != 10){
                System.out.println(k);
                k++;
                //break interrombre une boucle
                //continue réiterer la boucle
            }
            //Do while
            int j = 0;
            do
            { System.out.println(j);
                j++;

            } while(j < 10 );

            //for
            int r ;
            for(r = 0; r < 10; r++){
                System.out.println(r);
            }
    }
}