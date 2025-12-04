
public class insertionsort {
    public static void main(String[] args) {
        //Scanner scn = new Scanner(System.in);
        //int n = scn.nextInt();
        int [] arr= {90,14,56,78,-13,-6,99,101};
        //logic for 
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]= arr[i];
                    arr[i]=temp;
                    i--;
                }
                else{
                    break;
                }
            }
        }
        //printing sorted array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        
    }
    
}
