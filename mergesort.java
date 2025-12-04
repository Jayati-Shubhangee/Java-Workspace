import java.util.Scanner;

public class mergesort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        //int n2= scn.nextInt();
        int[] arr= new int[n1];
        //int[] arr2= new int[n2];

        //entering the array1 elements
        System.out.println("eneter the array ele");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
    int lo=0;
    int hi=arr.length-1;
   arr= mergesort(arr,lo,hi);
    printsortedarray(arr);
       
        //System.out.println("eneter the second array ele");
        //for(int i=0;i<arr2.length;i++){
            //arr2[i]=scn.nextInt();
       // }
    }
public static int[] mergesort(int[] arr,int low,int high){
    
    int mid= (low+high)/2; 
    if(low==high){
        int[] basearr=new int[1];
        basearr[0]= arr[low];
        return basearr;
    }

int[] firstarray=mergesort(arr,low,mid);
int[] secondarray=mergesort(arr,mid+1,high);
int [] fullsortedarray=mergingsortedarray(firstarray,secondarray);
return fullsortedarray;
}
public static int[] mergingsortedarray(int[] arr1,int[] arr2){
 // merging two sorted arrays
 int[] res= new int[arr1.length+arr2.length];
 int i=0,j=0,k=0;
 while(i<arr1.length && j<arr2.length){
     if(arr1[i]<=arr2[j]){
         res[k]=arr1[i];
         i++;
         k++;

     }
     else{
         res[k]=arr2[j];
         j++;
         k++;

     }
 }
     //if any one of the array teaches its end then
    while(i<arr1.length){
     res[k]=arr1[i];
         i++;
         k++;
    }
    while(j<arr2.length){
     res[k]=arr2[j];
         j++;
         k++;

    }
   
    return(res);
 }
 public static void printsortedarray(int[] arr){
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+"\t");
}
 }
}
   
        


    
    
