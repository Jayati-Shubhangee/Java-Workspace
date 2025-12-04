



/*public class recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        /*pdi(n);
        
    }
    public static void pdi(int n){
        //base case
        if(n==0){
            return;
        }


       System.out.println(n);
       pdi(n-1);
       System.out.println(n);

 
  
    }
}*/
/*import java.util.Scanner;
public class recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f=fact(n);
        System.out.println(f);
    }
public static  int fact(int n){

//base case

if(n==0){
    return 1;
}
return (n*fact(n-1));

}
    }*/

    /*import java.util.Scanner;
    public class recursion {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int x = scn.nextInt();
            //Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int pxn=powxn(x, n);
            System.out.println(pxn);
        }
    public static  int powxn(int x,int n){
    
    //base case
    
    if(n==0){
        return 1;
    }
    return (x*powxn(x,n-1));
    
    }
        }*/
        import java.util.Scanner;
        public class recursion {
            public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                int x = scn.nextInt();
                //Scanner scn = new Scanner(System.in);
                int n = scn.nextInt();
                int pxn=powxn(x, n);
                System.out.println(pxn);
            }
        public static  int powxn(int x,int n){
        
        //base case
        if(n<1){
            return 1;
        }
        //or base case n===0 return 1 
        //sirs method intxpnb2 = power(x,n/2);
        //int xn =xpnb2 *xpnb2;
        //if n%2==1
        //xn=xn*x

       if(n%2==0){
        return(powxn(x,n/2)*powxn(x,n/2));
       }
        else{
            return(powxn(x,n/2)*powxn(x,n/2))*x;
        
        }
            
        }
            }
        
        
    


