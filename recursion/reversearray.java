public class reversearray {
    
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        revarr(arr);

        
    }

    static void reverse(int[] arr,int idx){
        if(idx==arr.length){
            return;
        }

        reverse(arr, idx+1);
        System.out.println(arr[idx]);

    }
    public static void revarr(int[]arr){
        //int n = arr.length;
        reverse(arr,0);



    }
    }

