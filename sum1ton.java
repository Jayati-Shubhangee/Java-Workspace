
import java.util.Scanner;

public class sum1ton {
    public static void main(String[] args) {
        Scanner scn =new Scanner (System.in);
        int n = scn.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    sum+=j;
                }
            }
        }
        System.out.println(sum);
    }
    //more optimized approach 
    //for(int i=1;i<=n;i++){
       // for(int j=i;j<=n;j+=i){
            
                //sum+=i;
            
}
