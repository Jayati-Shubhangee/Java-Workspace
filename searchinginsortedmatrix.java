
import java.util.Scanner;

public class searchinginsortedmatrix {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r1= scn.nextInt();
        int c1=scn.nextInt();
        int[][] arr= new int[r1][c1];
        //entering matrix elements
        for(int i=0;i<r1;i++){
            for(int j =0;j<c1;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        //printing the input matrix
        for(int i=0;i<r1;i++){
            for(int j =0;j<c1;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("enter the elemnt to be searched\n");
        int x= scn.nextInt();
        int j= c1-1;
        int i=0;
        //searching in sorted matrix
        while(i<r1 && j>=0){
            if (arr[i][j] == x) {
                System.out.println("Element found at index (" + i + ", " + j + ")");
                return; // Exit after finding the element
            } else if (x > arr[i][j]) {
                i++; // Move down if the target is greater
            } else {
                j--; // Move left if the target is smaller
            }
        }

        System.out.println("Element not found");


        }
       


    }

