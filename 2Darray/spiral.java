//package 2Darray;

import java.util.Scanner;

public class spiral {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r= scn.nextInt();
        int c = scn.nextInt();
        int[][] arr= new int[r][c];
        // filling the matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        spiral(arr);
    }
    public static void spiral(int[][]nums){
        int minc=0;
        int minr=0;
        int maxr=nums.length-1;
        int maxc=nums[0].length-1;
        int tne= nums.length*nums[0].length;
        int count=0;

        while(count<tne){
        //downward traversal
        for( int i=minr,j=minc;i<=maxr && count<tne;i++){
            System.out.println(nums[i][j]);
            count++;

        }
        minc++;//increment to leave boundary ele
        //right side
        for(int i=maxr,j=minc;j<=maxc && count<tne;j++){
        System.out.println(nums[i][j]);
        count++;
        }
        maxr--;
        //j=nums[0].length-1;
        //top traversal
        for(int i=maxr,j=maxc;i>=minr && count<tne;i--){
            System.out.println(nums[i][j]);
            count++;
        }
        maxc--;
        for(int i=minr,j=maxc;j>=minc && count<tne;j--){//left side traversal
            System.out.println(nums[i][j]);
            count++;
        }
        minr++;
    }
}
    
}
