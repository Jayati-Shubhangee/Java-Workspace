import java.util.Scanner;

public class lastindex {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int value= scn.nextInt();
        int[] arr={10,2,3,9,8,2,3,5,7,5,2,3};
        int li= lstidx(arr,0,value);
        System.out.println(li);
        
    }
    
    public static int lstidx(int[] arr,int idx,int value){
 //base case
 if(idx==arr.length){
    return -1;
}
int lisa=lstidx(arr,idx+1,value);
if(lisa==-1){
    if(arr[idx]==value){
        return idx;
    }
    else{
        return -1;
    }

} 
else{
    return lisa;
}
}
}
    

