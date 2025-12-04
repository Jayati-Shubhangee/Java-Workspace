import java.util.Scanner;

public class sortingalgo {
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        bubbleSort(arr);
    }
    public static void bubbleSort(int arr[]) {
        //logic for bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //printing the sorted array
        for(int i=0;i<arr.length;i++){
            if(i<arr.length-1){
                System.out.print(arr[i]+",");
            }
            else {
                System.out.println(arr[i]);
            }
            
        }*/
        //selection sort rough logic 
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min =arr[i];
            }
            for(int j =i;j<i+1;j++){
                int temp=arr[j];
                arr[j]=min;
                min=temp;
            }
        }

    }
    
}

