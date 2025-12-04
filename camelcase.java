
import java.util.ArrayList;
import java.util.Arrays;



public class camelcase {
    public static void main(String[] args) {
       /*  String arr1[] ={"HelloWorld","HelloWolrdIs","cello"};
        
       // for(String str:arr){
           // System.out.println(str);  
       // }
        ArrayList<String> arr= new ArrayList<>(Arrays.asList(arr1));
        //arr.add("Hi");
        ////arr.add("HiTech");
        ////arr.add("HiGeek");
        //arr.add("HelloWorld");
        //System.out.println(arr);
        String pat="HW";
        ArrayList<String> abbreviations= new ArrayList<>();

        for(String str:arr){
            StringBuilder abb=new StringBuilder();
            for(char ch:str.toCharArray()){
                if(Character.isUpperCase(ch)){
                    abb.append(ch);
                }
         }
        
        abbreviations.add(abb.toString());
        }

        for(int i=0;i<arr.size();i++){
            if(abbreviations.get(i).contains(pat)){
                System.out.println(arr.get(i));
            }

        }

    */
        String arr1[] ={"Hi", "Hello", "HelloWorld", "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab"};    
    
    ArrayList<String> arr= new ArrayList<>(Arrays.asList(arr1));
    String pat="HT";
    ArrayList<String>ans= new ArrayList<>();
    for(String str: arr){
        StringBuilder current= new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch>='A' && ch<='Z'){
                current.append(ch);
                System.out.println(current);
                if(current.toString().equals(pat)){
                    ans.add(str);
                    break;

                }
            }

        }

    }
    System.out.println(ans);
}
}
