import java.util.Scanner;

public class allindices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int value = scn.nextInt();
        int[] arr= {2,3,6,9,8,3,2,3,6,4};
        int[] iarr=allindex(arr, value, 0, 0);
        if(iarr.length==0){
            System.err.println();
            return;
        }
        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]);
        }    
    }
    public static int[] allindex(int[] arr, int value,int idx,int fsf) {
        if(idx==arr.length){
            return new int[fsf];
        }
        if(arr[idx]==value){
            
            int [] iarr=allindex(arr,value,idx+1,fsf+1);
            iarr[fsf]=idx;
            return iarr;
        }
        
        else{
            int[] iarr= allindex(arr, value, idx+1, fsf);
            return iarr;
        }
    

    }
    
}
