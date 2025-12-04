//package recursion;

import java.util.Scanner;

public class printingarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//entering the size of the array
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
           arr[i] =scn.nextInt();
        }
        //entering index to be displayed
        //int idx=scn.nextInt();
        displayArr(arr, n-1);


        
    }
    public static void displayArr(int[] arr,int idx) {
        //base case
        if(idx<0){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx-1);
        
         
    }
    
}

