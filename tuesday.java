
import java.util.Scanner;



public class tuesday {
    public static void main(String[] args) {
        /*Scanner scn= new Scanner (System.in);
        System.out.println("enter two numbers");
        int n1 = scn.nextInt();
        int n2= scn.nextInt();
        int max=0;
        int div;
        int rem=1;
        int og1=n1;
        int og2=n2;
        if(n1>n2){
            max=n1;
            div=n2;
        }
        else{
            max=n2;
            div=n1;
        }
        // checking for gcd
        while(rem!=0){
             rem=max%div;
            max=div;
            div=rem;

        }
        int gcd=max;
        System.out.println("the gcd of"+n1+"and"+n2+"is"+gcd);

        int lcm= (og1*og2)/gcd;
        System.out.println("the lcm of"+n1+"and"+n2+"is"+lcm);


    }
    
}*/


/*Scanner scn = new Scanner(System.in);
System.out.println("enter 3 sides of triangle");
int a = scn.nextInt();
int b = scn.nextInt();
int c = scn.nextInt();
int hyp;
int s1;
int s2;
if(a>b){
    if(a>c){
        hyp=a;
        s1=b;
        s2=c;
    }
    else{
        hyp=c;
        s1=a;
        s2=b;
    }
}
else if (b>a){
    if(b>c){
        hyp=b;
        s1=a;
        s2=c;

    }
    else{
        hyp=c;
        s1=a;
        s2=b;
    }
}
else{
    hyp=c;
    s1=a;
    s2=b;
}
if(hyp*hyp==s1*s1+s2*s2){
    System.out.println("yes its a pythogrean triplet");
}
else{
    System.out.println("no its not a pythogrean triplet");
}



}
}*/
/*System.out.println("hello world");
    }
}*/

//hollow rectangle pattern
/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=scn.nextInt();
int i,j;*/

/*Scanner scn=new Scanner(System.in);
System.out.println("enter the no to check");
int n=scn.nextInt();
int a=0;
int b=1;
int c=0;
while(c<n){
    a=b;
    b=c;
    c=a+b;
}
if(c==n){
    System.out.println(n+"is a fibbonaci number");
}
else{
    System.out.println(n+"is not a fibbonaci number");
}
    }
}*/

//bubble sort algorithm
/*Scanner scn=new Scanner(System.in);
System.out.println("enetr the array size");
int size = scn.nextInt();
int arr[]=new int[size];
System.out.println("inputting array elements");
//inputting array elements
for(int i =0;i<size;i++){
    arr[i]=scn.nextInt();
}
System.out.println("inputted array is");
for(int i =0;i<size;i++){
    System.out.println(arr[i]+"\t");
}
//bubble sort 
int temp=0;
for(int i=0;i<size-1;i++){
    for(int j=0;j<size-i-1;j++){
        if(arr[j]>arr[j+1]){
            temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

        }

    }
}
System.out.println("sorted array is:");
for(int i=0;i<size;i++){
    System.out.println(arr[i]+"\t");
}
    }
}*/
//selection sort 
/*Scanner scn=new Scanner(System.in);
System.out.println("enetr the array size");
int size = scn.nextInt();
int arr[]=new int[size];
System.out.println("inputting array elements");
//inputting array elements
for(int i =0;i<size;i++){
    arr[i]=scn.nextInt();
}
System.out.println("inputted array is");
for(int i =0;i<size;i++){
    System.out.print(arr[i]+"\t");
}
//selection sort 
int temp=0;
for(int i =0;i<size-1;i++){
    int min =arr[i];
    for(int j =i+1;j<size;j++){
        if(arr[j]<min){
            min=arr[j];
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }

}
System.out.println("sorted array is:");
for(int i =0;i<size;i++){
    System.out.print(arr[i]+"\t");
}
    }
}*/

//insertion sort
Scanner scn=new Scanner(System.in);
System.out.println("enetr the array size");
int size = scn.nextInt();
int arr[]=new int[size];
System.out.println("inputting array elements");
//inputting array elements
for(int i =0;i<size;i++){
    arr[i]=scn.nextInt();
}
System.out.println("inputted array is");
for(int i =0;i<size;i++){
    System.out.print(arr[i]+"\t");
}
//sorting
int temp=0;
for(int i=1;i<size;i++){
    int j=i;
    while(j!=0){
        if(arr[j-1]>arr[j]){
            temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
        }
        j--;
    }
}
System.out.println("sorted array is :-");
for(int i =0;i<size;i++){
    System.out.print(arr[i]+"\t");
}
    }
}

