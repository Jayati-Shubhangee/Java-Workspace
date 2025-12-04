
import java.util.Scanner;

//package recursion;

public class maxofarray {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int max=maxarray(arr,0);
        System.out.println(max);

        
    }
    public static int maxarray (int[] arr,int idx){
    
       if(idx==arr.length-1){
        return arr[idx];
    }
          
int maxn1tn=maxarray(arr,idx+1);
//int maxzero=maxarray(arr,idx);

if(arr[idx]>maxn1tn){
    return arr[idx];
   
}
else{
  return maxn1tn;
}


    }
        
    }

    

