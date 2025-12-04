
import java.util.Scanner;

public class rainwatertrappping {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] a ={3,1,2,4,0,1,3,2};
        int [] left=new int[n];
        int [] right=new int[n];
        int i;
        int j;
        int max1=0;
        for(i=0;i<n;i++){
            for(j=i;j<i+1;j++){
                if(a[j]>max1){
                    max1=a[j];
                }
            for(j=i;j<i+1;j++){
                left[j]=max1;
               System.out.print("\t"+left[j]);
               
            }
            }
        }
        System.out.println();
        int max2=0;
        for(i=n-1;i>=0;i--){
            for(j=i;j>i-1;j--){
                if(a[j]>max2){
                    max2=a[j];
                }
            for(j=i;j>i-1;j--){
                right[j]=max2;
               System.out.print("\t"+right[j]);
            }
            }
        }
        System.out.println();
        //checking for each element how much water is trapped
        int rain;
        int sum=0;
        for(i=0;i<a.length;i++){
            rain= Math.min(left[i],right[i])-a[i];
            System.out.println(rain);
            sum+=rain;

        }
        System.out.println("total no of water trapped is "+sum);


    }

    
}
