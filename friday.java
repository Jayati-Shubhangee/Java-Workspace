import java.util.Scanner;

public class friday {
    public static void main(String[] args) {
        /*Scanner scn =new Scanner(System.in);
        System.out.println("enter the max size of array");
        int size=scn.nextInt();
        int [] arr=new int[size];
        //inputting array
        System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=size-1;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
    }
}*/
/*Scanner scn =new Scanner(System.in);
        System.out.println("enter the max size of array");
        int size=scn.nextInt();
        int [] arr=new int[size];
        int max=arr[0];
        int smax=0;
        //inputting array
        System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        //checking for largest ele
        for(int i =0;i<size;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("max ele is :"+max);
        //checking for second largest
        for(int i=0;i<size;i++){
                if(arr[i]<max && arr[i]>smax){
                    smax=arr[i];
                }
        }
        System.out.println("second lasrgest ele is"+smax);
    }
}*/

//linear search
/*Scanner scn =new Scanner(System.in);
        System.out.println("enter the max size of array");
        int size=scn.nextInt();
        int [] arr=new int[size];
        int found=0;

        //inputting array
        System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        //searching for the particular value
        System.out.println("value to be searched");
        int value=scn.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==value){
                
                System.out.println(value+"found at index"+i);
                found=1;
                break;

            }
        }
            if(found==0){
        System.out.println("invalid input");
        }
        
    }
}*/

/*Scanner scn =new Scanner(System.in);
        System.out.println("enter the max size of array");
        int size=scn.nextInt();
        int [] arr=new int[size];
        int start;
        int end;
        int mid=0;

        //inputting array
        System.out.println("enter array ele");
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        //printing the array ele
        System.out.println("array is:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        //binary search
        System.out.println("enter the value to be searched");
        int value=scn.nextInt();
        start=0;
        end=size-1;
        
        while(start<=end){
            mid=(start+end)/2;

        
        if(arr[mid]==value){
            System.out.println(value+"found at index"+mid);
            break;

        }
        else if(arr[mid]>value){
            end=mid-1;
            
           
        }
        else{
            start=mid+1;
           
           
        }

    }
if(start>end){
    System.out.println("invalid input entered");
}
}
}*/
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int[] arr = new int[n];

// Reading the array
for (int i = 0; i < n; i++) {
    arr[i] = scn.nextInt();
}

int sum = 0;

// Find sum of max elements of all subarrays
for (int i = 0; i < n; i++) {
    int max = Integer.MIN_VALUE;
    for (int j = i; j < n; j++) {
        max = Math.max(max, arr[j]);
        sum += max;
    }
}

System.out.println(sum);
}
}



