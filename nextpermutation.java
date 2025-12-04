public class nextpermutation {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,5,4};
        int rme=arr[arr.length-1];
        int pivot=0;
        int temp=0;
        //backword loop to find the first smallest elemnt (dip)
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i-1]<arr[i]){
                pivot=arr[i-1];
                break;
            }
        }
        temp=rme;
        rme= pivot;
        pivot=rme;
    //reversing the remaining part
    for(int i=arr.length-1;i>arr[pivot+1];i++)

    }
    
}
