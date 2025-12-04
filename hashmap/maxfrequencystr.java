
import java.util.HashMap;

//package hashmap;

public class maxfrequencystr {
    public static void main(String[] args) {
        String str= "abccc";
        char res=maxfreq(str);
        System.out.println(res);
    }
    public static char  maxfreq(String s){
        StringBuilder sb= new StringBuilder(s);
        HashMap<Character,Integer> map = new HashMap<>();
        //traversing through the string given
        for(int i=0;i<sb.length();i++){
            if(map.containsKey(sb.charAt(i))){//true increment freq
            map.put(sb.charAt(i),map.getOrDefault(sb.charAt(i),0)+1);
        }
        else{
            //false add the new char in map making freq 1 
            map.put(sb.charAt(i),1);
        }
        }
        //traversing through map to het max key value
        int max=0;
        char maxchar=' ';
        for(char key:map.keySet()){
            if(map.get(key)>max){
                max=map.get(key);
                maxchar=key;
            }

        }
return maxchar;

    }
    
}
