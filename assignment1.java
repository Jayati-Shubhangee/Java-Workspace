
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        /*Scanner scn =new Scanner (System.in);
        int n=scn.nextInt();
        int rev=0;
        int rem=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;

        }
        System.out.println(rev);

    }
    
}*/
/*Scanner scn = new Scanner (System.in);
System.out.println("enter the number to find factorial");
int n = scn.nextInt();
int fact=1;
int i;
for(i=1;i<=n;i++){
    fact=fact*i;
}
System.out.println("factorial of\t" + n +"is\t"+ fact);
    
    }
}*/
/*Scanner scn= new Scanner(System.in);
System.out.println("enter the two numbers for product");
int n1=scn.nextInt();
int n2=scn.nextInt();
int prod= n1*n2;
System.out.println("the product of "+n1+"and"+n2+"is"+prod);
    }
}*/

/*Scanner scn= new Scanner(System.in);
System.out.println("enter the value of limit ");
int n = scn.nextInt();
int avg=0;
int sum=0;
int i;
for(i=0;i<n;i++){
    System.out.println("enter the number : ");
    int num = scn.nextInt();
    sum+=num;
}
avg=sum/n;
System.out.println("the average of all input number is "+avg);
    }
}*/


/*Scanner scn =new Scanner (System.in);
int n=scn.nextInt();
int rev=0;
int rem=0;
int orig=n;
while(n!=0){
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
}
if(rev==orig){
    System.out.println("yes its a pallindrome");
}
else{
    System.out.println("no not a pallindrome");
}
    }
}
*/
/*while(n!=0){
    digit=n%10;
    sum=sum+digit;
    n=n/10;
    
}*/
/*Scanner scn =new Scanner(System.in);
System.out.println("enter the number");
int n =scn.nextInt();
int digit=0;
int sum=0;
int orig=n;

for(sum=0;n!=0;n=n/10){
    sum=sum+n%10;

}
System.out.println("sum of digits of number"+orig+"is"+sum);
    }
}*/
Scanner scn =new Scanner(System.in);
System.out.println("enter any number");
int num=scn.nextInt();
int count=1;
int div;
for(div=2;div<num;div++){
    if(num%div==0){
        count++;
    }
}
if(count>1){
    System.out.println("no its a composite no");
}
else{
    System.out.println("yes its a prime no");
}
    }
}



