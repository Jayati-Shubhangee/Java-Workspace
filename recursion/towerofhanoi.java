//package recursion;

import java.util.Scanner;

public class towerofhanoi {
    public static void main(String[] args) {
       /* Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1= scn.nextInt();
        int t2= scn.nextInt();
        int t3= scn.nextInt();
        toh(n,t1,t2,t3);


        
    }
    public static void toh(int n,int a,int b,int c){
        if(n==0){
            return; 
        }
        
            toh(n-1,a,c,b);
            System.out.println(n+"["+a+"->"+b+"]");
            toh(n-1,c,b,a);
        
    }
    
}*/
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
String t1= scn.next();
String t2= scn.next();
String t3= scn.next();
toh(n,t1,t2,t3);



}
public static void toh(int n,String a,String b,String c){
if(n==0){
    return; 
}

    toh(n-1,a,c,b);
  System.out.println(n+" "+a+"->"+c);
    toh(n-1,b,a,c);

}

}
