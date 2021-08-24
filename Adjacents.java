import java.util.function.ToIntFunction;

public class Adjacents {
    
    public static void main(String[] args) {
        int tableau[] = {-23, 4, -3, 8, -12};
       System.out.println(adjacentElementsProduct(tableau));
    }


    public static int adjacentElementsProduct(int[] inputArray) {
        int i = 0;
        
        int a = 0;
        int b = 0;
        int resultTemp = 0;
        
       int result = 0;
       do{

        a = inputArray[i];
        b = inputArray[i+1];
        resultTemp = a*b;
        
            if(resultTemp > result){
               result = resultTemp;
               
            } 
            i++;
       } while (i < inputArray.length-1);
         
      return result;

    }
}