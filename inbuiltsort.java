
import java.util.Arrays;
import java.util.Scanner;

public class inbuiltsort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr= new int[n];
        //entering array elemenets
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            
        }
        //printing elemnts
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+"\t");
            
        }
        //printing sorted array using inbuilt sort
        Arrays.sort(arr);
        for(int i : arr){
            System.out.print(i+" ");


        }
        


    }
}
