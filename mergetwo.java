
import java.util.Scanner;

public class mergetwo {

    // Merge sort function
    public static int[] mergesort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }
        int mid = (lo + hi) / 2;
        int[] fsh = mergesort(arr, lo, mid); // First sorted half
        int[] ssh = mergesort(arr, mid + 1, hi); // Second sorted half
        int[] fsa = mergetwosortedarrays(fsh, ssh); // Merge the two halves
        return fsa;
    }

    // Merging two sorted arrays
    public static int[] mergetwosortedarrays(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
            } else {
                res[k] = b[j];
                j++;
            }
            k++;
        }

        // Add remaining elements from `a`
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }

        // Add remaining elements from `b`
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }

        return res;
    }

    // Print function
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        int[] a = new int[n];

        // Input elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }

        // Perform merge sort
        int[] sortedArray = mergesort(a, 0, n - 1);

        // Print the sorted array
        System.out.println("Sorted Array:");
        print(sortedArray);

    
    }
}





        
    
    

