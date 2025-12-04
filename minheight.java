
import java.util.Arrays;
import java.util.Scanner;

public class minheight {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int k=scn.nextInt();
        int [] arr={3,9,12,16,20};
        /*int mindiff=0;
        for(int i=0;i<height.length;i++){
            if(height[i]-k>0){
                height[i]=height[i]-k;
            }
            else{
                height[i]=height[i]+k;
            }
        }
        int max=height[0];
        int min=height[0];
        for(int i=0;i<height.length;i++){
            if(height[i]>max){
                max=height[i];
            }
            if(height[i]<min){
                min=height[i];
            }

            

        }
        mindiff=max-min;
        System.out.println("min height diff is:"+mindiff);
    }
    
}*/


// Initialize the difference between max and min


// Iterate through the sorted array to apply transformations
/*for (int i = 0; i < arr.length; i++) {
   
    if (arr[i] < 0) {
        arr[i] = Math.abs(arr[i]); // Convert negative numbers to positive
    }
}
Arrays.sort(arr);
int n = arr.length;
int mindiff =arr[n-1]-arr[0];
int pivot=0;
for(int i=0;i<n;i++){
    if (arr[i] - k < 0) {
        arr[i] = arr[i] +k; // Decrease by k if possible
    }
    else{
        pivot=i;
        break;
    }
}
        for(int j=pivot;j<n;j++){
            arr[j]=arr[j]-k;

        }

       // Otherwise, increase by k
    


// Find new max and min after transformations
int max = arr[0];
int min = arr[0];
for (int i = 0; i < n; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
    if (arr[i] < min) {
        min = arr[i];
    }
}

// Update mindiff
mindiff = max - min;

System.out.println(mindiff);
}
}*/

        // Step 1: Convert all negative numbers to positive
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = Math.abs(arr[i]);
            }
        }

        // Step 2: Sort the array
        Arrays.sort(arr);

        // Step 3: Initialize variables
        int n = arr.length;
        int mindiff = arr[n - 1] - arr[0];
        int pivot = 0;

        // Step 4: Apply transformations and calculate pivot
        for (int i = 0; i < n; i++) {
            if (arr[i] - k < 0) {
                arr[i] += k; // Increase by k if subtracting is invalid
            } else {
                pivot = i; // Mark pivot index
                break;
            }
        }

        // Step 5: Apply transformations after pivot
        for (int j = pivot; j < n; j++) {
            arr[j] -= k;
        }

        // Step 6: Find new max and min
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Step 7: Update mindiff
        mindiff = max - min;

        // Output the result
        System.out.println("Min height difference is: " + mindiff);
    }
}

