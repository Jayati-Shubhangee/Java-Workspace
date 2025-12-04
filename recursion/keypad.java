
import java.util.ArrayList;
import java.util.Scanner;

public class keypad {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str= scn.next();
        ArrayList<String> words =getKPC(str);
        System.out.println(words);
        
    }
    static String[] codes={".;,","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static ArrayList<String> getKPC(String str) {
        //base case if no keyword pressed by deafult we have to assume that blank willl be printed in the arraylist it will not be an empty array list concept 2 raised to the power 0;
        if(str.length()==0){
            ArrayList<String> bres =new ArrayList<>();
            bres.add("");
            return bres;
        }
        //main logic 
        char ch = str.charAt(0);
        String ros=str.substring(1);
        //recursively calling 
        ArrayList<String> rres=getKPC(ros);
        ArrayList<String> myres=new ArrayList<>();

        String codeforch=codes[ch-'0'];
        for(int i=0;i< codeforch.length();i++){
            char chcode= codeforch.charAt(i);
            for(String rstr:rres){
                myres.add(chcode+rstr);
            }
        }
        return myres;
    }
    
}
