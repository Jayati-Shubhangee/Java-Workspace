import java.util.Scanner;

public class hcflacm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        int n2= scn.nextInt();
        int[] arr = lcmAndGcd(n1, n2);
        for(int i=0;i<arr.length;i++){
            //System.out.print(arr[i]+"\t");
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        
    }
    public static int[] lcmAndGcd(int a, int b) {
       // Scanner scn =new Scanner(System.in);
        int max;
        int[] res=new int[2];
        if(a>b){
            max=a;
        }
        else{
            max=b;
        }
        int hcf=0;
        for(int i=1;i<=max;i++){
            if(a%i==0 && b%i==0){
                if(i>hcf){
                    hcf=i;
                }
            }
        }
        
        
int lcm= (a*b)/hcf;
res[0]=(lcm);
res[1]=(hcf);
return res;   
}
}
