
import java.util.Scanner;

public class validpalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        String s= scn.nextLine();
        System.out.println(ispalindrome(s));
        //System.out.println(isPalindrome(s));
    }
        /*StringBuilder newstr = new StringBuilder();
        for(int i=0;i<s.length();i++){
           
                if(Character.isLetter(s.charAt(i))){
                    if(Character.isUpperCase(s.charAt(i))){
                        newstr.append(Character.toLowerCase(s.charAt(i)));
    
                    }
                    else{
                        newstr.append(s.charAt(i));
    
                    }
                }
                

            
        
        }
        /*System.out.println(newstr);
        String original = newstr.toString();
        String rev = newstr.reverse().toString();
        if(original.equals (rev)){
            System.out.println("True");

        }
        else{
            System.out.println("False");
        }
        String result = newstr.toString();
        System.out.println(ispalindrome(result));

    }
    public static boolean ispalindrome(String result)
     {
        String original = result;
        String rev = new StringBuilder(result).reverse().toString();
     return (original.equals (rev));
        
    }*/
   /* public static  boolean isPalindrome(String s) {
        StringBuilder newstr = new StringBuilder();
        for(int i=0;i<s.length();i++){
             char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                newstr.append(Character.toLowerCase(ch));


            }
        }
        String result = newstr.toString();
        String rev = new StringBuilder(result).reverse().toString();
        return(result.equals(rev));
    }
   
    
}*/
static String reverse(String s, int idx){
   // wrong approach because everytime it will create a fresh string builder so it will not store the reamining one StringBuilder res= new StringBuilder();
    if(idx==s.length()){
        return "" ;
    }
    
    String restreversed=reverse(s, idx+1);//something to hold it 
    return restreversed +s.charAt(idx);
   // return res.toString();

}
public static boolean  ispalindrome(String s){
    //int n = arr.length;
    String rev=reverse(s,0);
    return s.equals(rev);



}
}



