import java.util.Scanner;

public class firstindex {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int value= scn.nextInt();
        int[] arr={10,2,3,9,8,2,3,5,7,5,2,3};
        int index= fstidx(arr,0,value);
        System.out.println(index);
        
    }
    public static int fstidx(int[] arr, int idx,int value){
        //base case
        if(idx==arr.length){
            return -1;
        }
        if(value==arr[idx]){
            return idx;
        }
        else{
        int fi=fstidx(arr,idx+1,value);
        return fi;
    }
    }
        
    
    
}

