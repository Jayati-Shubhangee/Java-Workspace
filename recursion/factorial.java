import java.util.ArrayList;

public class factorial {
    static ArrayList<Long> factorialNumbers(long n) {
        // code here
        //creating an arraylist to store the numbers of n factorial 
         ArrayList<Long> list= new ArrayList<>();
        //base case 
        if(n==1){
            return 1;
        }
        int  fnm1= factorialNumbers(n-1);
        int fn  = n* factnm1;
       
        list.add(fn);
        //checking if the factorial numbers are less than or equal to n 
        for(int i:list){
            if(i<=n){
                return i;
            }
        }
        return list;
    }
}
    

