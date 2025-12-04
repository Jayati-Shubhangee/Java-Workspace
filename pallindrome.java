

public class pallindrome {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("");
        
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)>='A' && sb.charAt(i)<='Z' ){
               sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
            }
            if(Character.isLetterOrDigit(sb.charAt(i))==false){
                sb.deleteCharAt(i);
                i--;
            }


        }
        //System.out.println(sb);
        StringBuilder rev = new StringBuilder(sb).reverse();
        System.out.println((sb.toString().equals(rev.toString())));
       
    }
    
}
