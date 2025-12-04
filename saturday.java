
import java.util.Scanner;

public class saturday {
    
        /*int[]origarr={10,20,40,3,89,90,1000};
        int[]revarr;

        for(int i=origarr.length;i>1;i--){
            revarr[]+=origarr[i];

            System.out.println("the reversed array is"+revarr);
        }*/





        //printing prime numbers upto a certain limit 
        /*Scanner scn= new Scanner(System.in);
        System.out.println("enter the limit upto which u want to print prime no");
        int limit=scn.nextInt();
        int i,count,div;
        for(i=2;i<=limit;i++){
            count=0;
            for(div=2;div<=i;div++){
                if(i%div==0){
                    count++;


                }
            }
        if(count>1){
            System.out.println("composite:"+i);
        }
        else{
            System.out.println("prime:"+i);
        }
            

               
    
            }
            
        }

        
    }*/
    
// BENJAMIN BULBS PERFECT SQUARE NUMBER 
/*Scanner scn=new Scanner(System.in);
int n =scn.nextInt();
for(int i=1;i*i<n;i++){
    System.out.println("THE BULBS WHICH WILL LIGHT WILL BE "+i*i);

}
    }
}*/
//pattern questions
//1
/*Scanner star=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=star.nextInt();
int i,j;
for(i=1;i<=n;i++){
    for(j=1;j<=i;j++){
        System.out.print("*\t");
    }
    System.out.println();
    
}
    }
}*/

/*Scanner star=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=star.nextInt();
int i,j;
for(i=n;i>=1;i--){
    for(j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println();
    
}
    }
}*/


/*Scanner star=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=star.nextInt();
int i,j,k;
for(i=1;i<=n;i++){

    for(k=n-1;k>=i;k--){
        System.out.print("\t");
    }
    for(j=1;j<=i;j++){
       
        System.out.print("*\t");
    }
    System.out.println();
    
}
    }
}*/
/*Scanner star=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=star.nextInt();
int i,j,k;
for(i=1;i<=n;i++){

    
    for(j=1;j<i;j++){
       
        System.out.print("\t");
    }
    for(k=i;k<=n;k++){
        System.out.print("*\t");
    }
    System.out.println();
    
}
    }
}*/

/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=0;
int st=n;
for(i=1;i<=n;i++){
    for(j=1;j<=sp;j++){
        System.out.print("\t");
    }
    for(j=1;j<=st;j++){
        System.out.print("*\t");

    }
    sp++;
    st--;
    System.out.println();


}
    }
}*/
/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=n-3;
int st=1;
for(i=1;i<=n;i++){
    //System.out.println(sp+","+st);
    
    if(sp>0){
        
        sp--;
        st=st+2;
    }
    else{
        sp++;
        st=st-2;
    }
}
    for(j=1;j<=sp;j++){
        System.out.print("\t");
    }
    for(j=1;j<=st;j++){
        System.out.print("*\t");

    }
    sp++;
    st--;
    System.out.println();
    }
}*/   
/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=n/2;
int st=1;
for(i=1;i<=n;i++){
    
    for(j=1;j<=sp;j++){
        System.out.print("\t");
    }
    for(j=1;j<=st;j++){
        System.out.print("*\t");

    }
    if(i<=n/2){
        sp--;
        st+=2;

    }
   

else{
    sp++;
    st-=2;

}
System.out.println();

}

    
    
}
}*/
/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=1;
int st=n-2;
for(i=1;i<=n;i++){
   // System.out.println(st+","+sp+","+st);
   for(j=1;j<=st;j++){
        System.out.print("*\t");
    }
    for(j=1;j<=sp;j++){
        System.out.print("\t");

    }
    for(j=1;j<=sp;j++){
        System.out.print("\t");
    }
    for(j=1;j<=st;j++){
        System.out.print("*\t");

    }


    if(i<=n/2){
        sp++;
        st-=1;

    }
   

else{
    sp--;
    st+=1;

}
    
    
    
    
System.out.println();

}

    
    
}
}*/
/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=1;
int st=n-2;
for(i=1;i<=n;i++){
    //System.out.println(st+","+sp+","+st);
   for(j=1;j<=st;j++){
        System.out.print("*\t");
    }
    for(j=1;j<=sp;j++){
        System.out.print("\t");

    }
    for(j=1;j<=st;j++){
        System.out.print("*\t");
    }
   


    if(i<=n/2){
        sp=sp+2;
        st-=1;

    }
   

else{
    sp=sp-2;
    st+=1;

}
    
    
    
    
System.out.println();

}

    
    
}
}*/
/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=0;
int st=1;
for(i=1;i<=n;i++){
    //System.out.println(sp+","+st);
    for(j=1;j<=sp;j++){
        System.out.print("\t");
    }
    for(j=1;j<=st;j++){
        System.out.println("*\t");
    }
    sp++;


}
System.out.println();
    }
}*/

/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j,sp=0;
int st=1;
for(i=1;i<=n;i++){
    //System.out.println(sp+","+st);
    for(j=1;j<=sp;j++){
        System.out.print("\t");
    }
    for(j=1;j<=st;j++){
        System.out.println("*\t");
    }
    sp++;


}
System.out.println();
    }
}*/


//frequency of elements
/*Scanner scn= new Scanner(System.in);
System.out.println("enter the size of the array");
int size=scn.nextInt();
int arr[]=new int[size];
System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
//finding the frequency of each element
int count=0;
for(int i=0;i<size;i++){
    for(int j=0;j<size;j++){
        if(arr[i]==arr[j]){
            count++;
        }


    }
    System.out.println("frequency of each element is :"+arr[i]+count);
}

    }
}*/

/*Scanner scn= new Scanner (System.in);
System.out.println("enter the size of array");
int size= scn.nextInt();
int []arr = new int[size];

System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
int min=arr[0];

for(int i=0; i<size;i++ ){
    if (arr[i]<min){
        min =arr[i];
    }
    
}
System.out.println("MIN of array is"+min);

int max = arr[0];
for(int i=0; i<size;i++ ){
    if (arr[i]>max){
        max =arr[i];
    }
   
}
System.out.println("max of array is"+max);
int range;
range=(max-min+1);
int []fre= new int[range];

for (int i=0;i<size;i++){
    int idx=arr[i]-min;
    fre[idx]++;
}
for(int i=1;i<range;i++){
    fre[i]=fre[i]+fre[i-1];
}
int[] sorted = new int[size];
for(int i =size-1;i>=0;i--){
    int val=arr[i];
    int pos=fre[val-min];
    int idx=pos-1;
    sorted[idx]=val;
    fre[val-min]--;
}
//printing sorted array
System.out.println("Sorted ARRAY");
for(int i =0;i<size;i++){
    System.out.print(sorted[i]+"\t");
}

    }
}*/
// Moores voting algorithm 
/*Scanner scn = new Scanner(System.in);
System.out.println("enter the array size");
int size=scn.nextInt();
int [] arr= new int[size];
boolean visited[]=new boolean[arr.length];
//entering array and printing 
System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }

//traversing for elements
for(int i=0;i<size;i++){
    if(visited[i]== true){
        continue;
    }

    int count=1;
    for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j]){
            visited[j]=true;
            count++;
        }
    }
    System.out.println(arr[i] + " " + count);
    if(count>(arr.length/2)){
        System.out.println(arr[i]+"has count greater than n/2");
    }
    
}

    }
}*/
//FUNCTIONS IN JAVA
/*public static int fact(int x){
    int rv=1;
    for(int i =1;i<=x;i++){
        rv=rv*i;
    }
    return rv;
}*/

/*Scanner scn = new Scanner(System.in);
System.out.println("enter the value of n");
int n =scn.nextInt();
System.out.println("enter the value of n");
int r = scn.nextInt();
int factn=fact(n);
int factnmr=fact(n-r);

//permutation formula
int npr;
npr=(factn)/(factnmr);
System.out.println(n+"p"+r+"="+ npr);
    }
}*/
/*public static int frequency(int x,int y){
    int freq=0;
    while(x!=0){
        int rem=x%10;
        if(rem==y){
            freq++;
        }
        x=x/10;
    }
    return freq;

}
public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int num=scn.nextInt();
    int digit=scn.nextInt();
    int count=frequency(num,digit);
    System.out.println("freq of " + digit+ "is" + count);


}
} */
public static void main(String[] args) {
    

Scanner scn = new Scanner(System.in);
    //int size= scn .nextInt();
    int r1=scn.nextInt();
    int c1=scn.nextInt();
    //int r2=scn.nextInt();
    //int c2=scn.nextInt();
    int [][] arr=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j =0;j<c1;j++){
            arr[i][j]=scn.nextInt();

        }
    }

        
        
  
}
}











