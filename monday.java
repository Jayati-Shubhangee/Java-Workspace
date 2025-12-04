
import java.util.Scanner;



public class monday {
    public static void main(String[] args) {
       /*  Scanner scn=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=scn.nextInt();
        int i,j,sp=n-1;
        int st=1;
        for(i=1;i<=n;i++){
            //System.out.println(sp+","+st);
            for(j=1;j<=sp;j++){
                System.out.print("\t");
            }
            for(j=1;j<=st;j++){
                System.out.print("*\t");
            }

            sp--;

            System.out.println();
    }
    

    
}
}*/
/*Scanner scn=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=scn.nextInt();
        int i,j;
        //int st=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i+j==n+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");

                }
                
            }
            System.out.println(); 
        }
        

    }
}*/
/*Scanner scn=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int n=scn.nextInt();
        int i,j;
        //int st=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i+j==n+1||i==j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");

                }
                
            }
            System.out.println(); 
        }
        

    }
}*/
/*Scanner scn = new Scanner(System.in);
System.out.println("enter the max size of the array");
int size=scn.nextInt();
int [] arr =new int[size];
System.out.println("enter the array elements");
for (int i =0;i<arr.length;i++){
    arr[i]=scn.nextInt();
}
System.out.println("inputted array is :");
for (int i =0;i<arr.length;i++){
    System.out.print(arr[i]+'\t');
}
int currentsum=arr[0];
int bestsum=arr[0];
for (int i =1;i<arr.length;i++){
    if(currentsum>=0){
        currentsum+=arr[i];
    }
    else{
        currentsum=arr[i];
    }
    if(currentsum>bestsum){
        bestsum=currentsum;
    }

} 
System.out.println("max sub array sum is "+bestsum);
   }
}*/
//2 D MATRIX IMPLENTATION
Scanner scn = new Scanner(System.in);
System.out.println("enter row size");
int row= scn.nextInt();
System.out.println("enter col size");
int col=scn.nextInt();
int [][] arr=new int[row][col];
System.out.println("\n entering array elemnts \n ");
for(int i =0;i<row;i++){
    for(int j =0;j<col;j++){
        arr[i][j]=scn.nextInt();

    }
   
}
System.out.println("\n inputted array is:\n ");

for(int i =0;i<row;i++){
    for(int j =0;j<col;j++){
        System.out.print(arr[i][j]+" \t");

    }
   System.out.println();
}
    }
}
