public class Palindrome {
    public static void main(String[] args) {

        System.out.println(checkPalindrome("abba"));
    }



    public static boolean checkPalindrome(String inputString) {
        String motInverser = "";
        for(int i = inputString.length()-1 ; i >= 0; i-- ){
                    motInverser += inputString.charAt(i);
                }
        
        return inputString.equals(motInverser) ? true : false;
        
     
    }
}