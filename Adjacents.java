import java.util.function.ToIntFunction;

public class Adjacents {
    
    public static void main(String[] args) {
        int tableau[] = {-23, 4, -3, 8, -12};

             
        adjacentElementsProduct(tableau);
    }


    public static int adjacentElementsProduct(int[] inputArray) {
        int i = 0;
        int a = 0;
        int b = 0;
        
        int length = inputArray.length - 1;
        int arrayNb[] = new int[length];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
    
       do{

        a = inputArray[i];
        b = inputArray[i+1];
        arrayNb[i] =  a*b;

        i++;
       } while (i < length);
        
        for(int j = 0; j < arrayNb.length; j++){
            if(arrayNb[j] < max)
            max = arrayNb[j];
            if(arrayNb[j] > min)
            min = arrayNb[j];
      }
       return min;
    }
}

//-92, -12,-24, -96