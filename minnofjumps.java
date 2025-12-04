
import java.util.Scanner;

public class minnofjumps {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] arr= {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int maxreach=arr[0];
        int step=arr[0];
        int n = arr.length;
        //int i=0;
        int jump=1;

        /*while( i <= n){
            if(i==n){
                break;
            }
            while(maxjump<=arr[i] ){
                maxjump++;
            }
            i+=arr[i];
            count++;

        } 
        System.out.println(count);*/

//logic used
if(arr.length==1){
    jump=0;
    System.out.println(jump);
}
else if(arr[0]==0){
    jump=-1;
    System.out.println(jump);

}
else{
    for(int i=1;i<n;i++){
       if(i==n-1){
        System.out.println(jump);
       }
        maxreach=Math.max(maxreach, i+arr[i]);
        step--;
        if(step==0){
            jump++;
            if(i>=maxreach){
                jump=-1;
               
            }
            step=maxreach-i;  
           
        }
      // if(arr[i]==0){
        //jump=-1;
       //}
    }
      
    
   
    }
    //System.out.println(jump);
        }

}
