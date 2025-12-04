


public class wednesday {
    public static void main(String[] args) {
        /*Scanner scn =new Scanner(System.in);
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
}*/

/*Scanner scn =new Scanner(System.in);
System.out.println("enter the size ofarray");
int size = scn.nextInt();
int[] arr;
arr=new int[size];
//Scanner scn =new Scanner(System.in);
int max;
int min;
int span=0;
for(int i =0; i<arr.length;i++){
    System.out.println("enter the array ele");
     arr[i] =scn.nextInt();
}
System.out.print("inputted array is");
for ( int i = 0; i < arr.length; i++) {
   
    System.out.print(arr[i]+"\t");

    
}
max=arr[0];
min=arr[0];
for ( int i = 0; i < arr.length; i++) {
    if(arr[i]>max){
        max=arr[i];
       } 
    if(arr[i]<min){
        min=arr[i];
       }    
}
System.out.println("max"+"="+max);
System.out.println("min"+"="+min);
//span of max min
span=max-min;
System.out.println("span of array is"+span);
    }
}*/

//finding position of the array
/*Scanner scn= new Scanner(System.in);
System.out.println("enter the array size");
int size=scn.nextInt();
int[] arr= new int[size];
for(int i=0;i<arr.length;i++){
    arr[i]=scn.nextInt();

}
//printing the array
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"\t");
}
//searching for a value
//Scanner scn= new Scanner(System.in);
System.out.println("enetr the value to be searched");
int value=scn.nextInt();
int found=0;
for(int i=0;i<arr.length;i++){
    if(value==arr[i]){
        System.out.println(value+"found at index"+i);
        found=1;

    }
}
if(found==0) {
    System.out.println(value+"not found");
}
    }
} */
//BAR CHART QUESTION 
/*Scanner scn= new Scanner(System.in);
System.out.println("enter the array size");
int size=scn.nextInt();
int[] arr= new int[size];
for(int i=0;i<arr.length;i++){
    arr[i]=scn.nextInt();

}
//printing the array
System.out.println("inputted array is");
for(int i=0;i<arr.length;i++){
   System.out.print(arr[i]+"\t");
}
 System.out.println("\n");   
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i];j++){
        System.out.print("*");
    }
        System.out.print("\t");

    }
 

//printing star 
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"\t");
}
    }
}*/


/*Scanner scn= new Scanner(System.in);
System.out.println("enter the array size");
int size=scn.nextInt();
int[] arr= new int[size];
for(int i=0;i<arr.length;i++){
    arr[i]=scn.nextInt();

}
//printing the array
System.out.println("inputted array is");
for(int i=0;i<arr.length;i++){
   System.out.print(arr[i]+"\t");
}
//star pattern logic for bar chart
int max=arr[0] ;
for(int i=0;i<arr.length;i++){
    if(arr[i]>max){
        max=arr[i];

    }
}
for(int i=max;i>=1;i--){
    for(int j=0;j<arr.length;j++){
        if(arr[j]>=i){
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

//sum of two array
/*Scanner scn= new Scanner(System.in);
System.out.println("enter the array size1");
int size1=scn.nextInt();
System.out.println("enter the array size2");
int size2=scn.nextInt();
int[] arr1= new int[size1];
int[] arr2= new int[size2];
int maxsize;
if(size1>size2){
    maxsize=size1;
}
else{
    maxsize=size2;
}
int[] sum=new int[maxsize];
System.out.println("enter ele of first array");
for(int i=0;i<arr1.length;i++){
    
    arr1[i]=scn.nextInt();

}
//printing the array1
System.out.println("inputted array is");
for(int i=0;i<arr1.length;i++){
   System.out.print(arr1[i]+"\t");
}
System.out.println("enter ele of 2 array");
for(int i=0;i<arr2.length;i++){
    
    arr2[i]=scn.nextInt();

}
//printing the array2
System.out.println("inputted array is");
for(int i=0;i<arr2.length;i++){
   System.out.print(arr2[i]+"\t");
}
//sum of two arrayy based on index mapping
/*int k=0;
for(int i=0;i<arr1.length;i++){
    for( int j=0;j<arr2.length;j++){
        if(i==j){
        sum[k]=arr1[i]+arr2[j];
        }

    }
    System.out.print("the sum array is"+sum[k]+"\t");
}*/
/*for (int i = 0; i < maxsize; i++) {
    int val1 = (i < arr1.length) ? arr1[i] : 0; // If arr1 has no value at index, use 0
    int val2 = (i < arr2.length) ? arr2[i] : 0; // If arr2 has no value at index, use 0
    sum[i] = val1 + val2;
}

// Printing the sum array
System.out.println("The sum array is:");
for (int i = 0; i < sum.length; i++) {
    System.out.print(sum[i] + "\t");
}
}
}*/
    }}



