import java.util.Scanner;

public class partitionrule {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        insertarray( arr);
        quicksort(arr, 0, arr.length-1);
        printarray(arr);
    }
        // function of entering array elements
        public static void insertarray(int arr[]){
            Scanner scn = new Scanner(System.in);
          
            for(int i=0;i<arr.length;i++){
                arr[i]=scn.nextInt();
            }
            
           // System.out.println("enter the pivot value");
           
           // partition(arr,pivot);
        }
        //logic for quicksort
        public static void quicksort(int arr[],int start,int end){
            if(start>=end){
                return;
            }
            int pivot = arr[end];
            int pivotidx = partition(arr, pivot, start, end);
            quicksort(arr, start, pivotidx-1);
            quicksort(arr, pivotidx+1, end);
            
        }
        
        //logic for partition
public static int partition(int arr[],int pivot,int start,int end){
    int i=start,j=start;
    while(i<=end){
       
            if(arr[i]>pivot){
                i++;
            }
           else{
               swapping(arr,i,j);
                i++;
                j++;
            }
            
        }
        return j-1;
       
        //printarray(arr);
}
public static void swapping(int arr[],int i,int j){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
public static void printarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+"\t");
    }    
}
 
    
}

          
            

    

    

