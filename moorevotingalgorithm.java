
import java.util.Scanner;

public class moorevotingalgorithm {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int size= scn.nextInt();
        int[] arr= new int[size];
      
        //entering array 
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
       int majority=findMajority(arr);
        System.out.println("the majority element in array is:"+majority);
    }
        //voting algorithm greater n/2
        public static int findMajority(int[] arr) {
        int freq=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(freq==0){
                ans=arr[i];
                freq=1;
            }
           else if(ans==arr[i]){
                freq++;
            }
            freq--;

        }

        freq =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ans)
            freq++;
        }
        if(freq>(arr.length/3))
        return ans;
    return -1;
    


    }
    
    
}
//brute force algorithm 
//optimized



