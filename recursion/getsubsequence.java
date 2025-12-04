
import java.util.ArrayList;

public class getsubsequence {
    public static void main(String[] args) {
        String word= "abc";
        ArrayList<String> res = gss(word);
        System.out.println(res);
        
    }
    public static ArrayList<String> gss(String str) {
//base case
if(str.length()==0){
    ArrayList<String>bres= new ArrayList<>();
    bres.add("");
    return  bres;
}
       char ch = str.charAt(0);
        String ros=str.substring(1);
       ArrayList<String> ss1=gss(ros);
       ArrayList <String> myres=new  ArrayList<>();
for(String i:ss1){
    myres.add(""+i);
   


}
for(String i:ss1){
   
    myres.add(ch + i);


}//can be in same loop as well and we can use separate loop as well 
return myres;



    }
    
}
