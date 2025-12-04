
import java.util.ArrayList;

public class fizzbuzz {
    public static void main(String[] args) {
        //String s= "FizzBuzz";
        ArrayList<String> str =new ArrayList<>();
        int n = 15;
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                str.add("FizzBuzz");
            }
            else if(i%3==0){
                str.add("Fizz");

            }
            else if(i%5==0){
                str.add("Buzz");
            }
            else{
                str.add(Integer.toString(i));
            }
        }
        System.out.println("arraylist str:"+ str);
    }
    
}
