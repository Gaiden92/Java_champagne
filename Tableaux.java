public class Tableaux {

    public static void printTab(int[] tab){
        for (int string : tab) {
            System.out.println(string);
        }
    }
    public static void main(String[] args){

        
        /*
        Plusieurs syntaxes :
        int tab[] = new int[3]; valeurs non initialisé
        int tab[] = {1,2,3};
        int tab[] = new int[]{1,2,3};
        */

        //Tableau de chiffre
       /* int tab[] = {1,2,3};
        System.out.println(tab[0]);

        ///Tableau de valeurs
        String tabS[] = {"Sami", "Terry", "Claudy"};
        System.out.println(tabS[2]);
        
        for(int i = 0;i < tab.length; i++){
            System.out.println(tabS[i]);
        }*/

        //Tableau 2 dimensions de string
        String tab2D[][] = {
            {"Sami", "Terry", "Claudi"}, 
            {"Thomas", "Iggy"}
        };

        for (String[] el : tab2D) {
            for (String el2 : el) {
                System.out.println(el2);
            }
        
        }

        //Tableau 2 dimensions de nombre
        int[][] tab2DNombre = 
        {
            {1,2,3}, 
            {4,5}
        };

        for (int[] i : tab2DNombre) {
            
            for (int j : i) {
                System.out.println(j);
            }
        }

        //Methode pour afficher un tableau
        int tab[] = {1, 2};
        printTab(tab);
        
       }
}
