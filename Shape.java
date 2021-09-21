public class Shape {
    public static void main(String[] args) {
        
       shapeArea(3);
    }
    public static int shapeArea(int n) {
        int compteur = 2;
        int i = n;
        int aire = 0;
        int somme = 0;
        int totalnb = 0;
        int[] total = new int[n+1];
        do{
        
           
            aire = i*i;
            somme += aire;
            
            System.out.println(somme);
            i--;
            compteur--;
        }
        while(compteur != 0);
    
        for(int j = 0;j < total.length;j++){
            totalnb += total[j]; 
        }
        return somme;
         
    }
}
