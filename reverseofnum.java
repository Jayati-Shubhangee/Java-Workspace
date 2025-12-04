import java.util.Scanner;

public class reverseofnum {
    //private static int n;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        //int orig=n;
       //int reversed= reverse(n);
      System.out.println(isPalindrome(n)); 
     
    }
       
        /*if(n>=-(int)Math.pow(2, 31) && n<=(int)Math.pow(2, 31)-1){
            while(n!=0){
                rem= n%10;
                rev=rev*10+rem;
                n=n/10;
            }
            System.out.println(rev);

        }
        else{
           System.out.println(0);
        }
       
        
        
    }

    
}*/




       /*  while (n != 0) {
            rem = n % 10;

            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                System.out.println(0); // Overflow for positive numbers
                return;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                System.out.println(0); // Overflow for negative numbers
                return;
            }

            rev = rev * 10 + rem;
            n = n / 10;
        }

        System.out.println(rev);
    }
}*/


        /*while (x != 0) {
             rem = x % 10;

            // Simplified overflow check
            int newRev = rev * 10 + rem;
            if ((newRev - rem) / 10 != rev) { 
                System.out.println(0); // Overflow occurred
                return;
            }

            rev = newRev;
            x = x / 10;
        }

        System.out.println(rev);
        if(orig==rev){
            System.out.println("true its a pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
    }
}*/
public static int reverse(int x){
    int rem,rev=0;


    while (x != 0) {
         rem = x % 10;

        // Simplified overflow check
        int newRev = rev * 10 + rem;
        if ((newRev - rem) / 10 != rev) { 
            System.out.println(0); // Overflow occurred
            return 0;
        }

        rev = newRev;
        x = x / 10;
    }
        return rev;
    }

     public boolean isPalindrome(int orig) {
       
       int reversed=reverse(orig);
        return orig==reversed;


   }
}
    
