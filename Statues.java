import java.lang.reflect.Array;

public class Statues {
    public static void main(String args[]){
        int[] statuesnb = {6,2,3,8};
        int[] statuesnb2 = {0,3};
        System.out.println(makeArrayConsecutive2(statuesnb2));
        
    }
    public static int makeArrayConsecutive2(int[] statues) {
      
        int compteur = 0;
        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE; 
        for(int i = 0;i < statues.length;i++){
            if(statues[i] < maxValue){
                maxValue = statues[i];
            }
            if(statues[i] > minValue){
                minValue = statues[i];
            }
        }
        int k = maxValue;
        int j = 0;
       int somme = maxValue + minValue-1;
      
       int newarray[] = new int[somme];
       for(int i = maxValue; i < somme;i++){
         newarray[i] = i; 
        }

        
        do{
            if(newarray[j] != statues[j]){
                compteur++;
            }
            j++;
        }while(j < statues.length);
        
       return compteur;

    }
    
}
