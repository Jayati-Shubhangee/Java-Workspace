
import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i=0;i<t;i++){
            int n = scn.nextInt();
        
        int count=0;
        for(int div=2;div*div<=n;div++){
            if(n%div==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("is  a prime no");

        }
        else{
            System.out.println("is not a prime no");

        }
    }
}
}
     /*Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        
        for(int i=low;i<high;i++){
            int count=0;
            for(int div=2;div*div<=i;div++){

                if(i%div==0)
                {
                    count++;
                    break;
                }
            }
           
            
        
        if(count==0){
            System.out.println(i);

        }
    }
    }*/
    /*Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();
    int x=0 ;
    int y=1;
    int z;
    for(int i=0;i<n;i++){
        System.out.println(x);
    
        z=x+y;
        x=y;
        y=z;
       
    }
   
}
}*/
/*Scanner scn=new Scanner(System.in);
int n= scn.nextInt();
int count=0;
while(n!=0){
    n=n/10;
    count++;
    
}
System.out.println(count);
    }
}*/
/*Scanner scn =new Scanner(System.in);
int n = scn.nextInt();
int nod=0;
int temp=n;

while(temp!=0){
    temp=temp/10;
    nod++;
}
int div =(int)Math.pow(10,nod-1);
while(div!=0){
    int q=n/div;
    System.out.println(q);
    n=n%div;
    div=div/10;
   
}
    }
}*/
/*Scanner scn =new Scanner (System.in);
int n = scn.nextInt();
int rem ;
while(n>0){
    rem=n%10;
    n=n/10;
    System.out.println(rem);
}

    }
}*/
/*Scanner scn= new Scanner (System.in);
int n=scn.nextInt();
int inv=0;
int temp;
int op=1;
while(n!=0){
      int od =n% 10;
      temp=op;
      op=od;
      od=temp;
      inv += od*(int)Math.pow(10,  op-1);
      n=n/10;
      op++;
}
System.out.println(inv);
}
}*/










             
               
        

    

