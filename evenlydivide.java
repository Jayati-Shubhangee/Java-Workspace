import java.util.Scanner;

public class evenlydivide {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
                // code here
                int orig=n;
                int rem;
                int count=0;
                while(n!=0){
                    rem=n%10;
                    if( rem!=0){
                        if(orig%rem==0){
                            count++;

                        }   
                    }
                    n=n/10;
                }
                System.out.println(count);
            }
        }

   
