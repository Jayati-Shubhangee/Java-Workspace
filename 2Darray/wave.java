//package 2Darray;

import java.util.Scanner;

public class wave {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r= scn.nextInt();
        int c= scn.nextInt();
        int[][] arr=new int[r][c];
        //filling the matrix
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        wavetraversal(arr);
    }
    public static void wavetraversal(int[][] nums){
        //wave traversal 
       int j=0,i;
        while( j <nums[0].length){
        //downward flow
        for(i=0;i<nums.length;i++){
            System.out.println(nums[i][j]);

        }
        j++;//increasing col value by 1 
        //upward flow
        for(i=(nums.length-1);i>=0;i--){
            System.out.println(nums[i][j]);

        }
        j++;

    }
    }

    
}
