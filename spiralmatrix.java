
import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    //int size= scn .nextInt();
    int r1=scn.nextInt();
    int c1=scn.nextInt();
    //int r2=scn.nextInt();
    //int c2=scn.nextInt();
    int [][] arr=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j =0;j<c1;j++){
            arr[i][j]=scn.nextInt();

        }
        
    }
    int minr=0;
    int minc=0;
    int maxr=r1-1;
    int maxc=c1-1;
    int tne= r1 *c1;
    int cnt=0;

    while(cnt<tne){
        //left wall
        for(int i=minr,j=minc;i<=maxr && cnt < tne;i++){
            
                System.out.println(arr[i][j]);
                cnt++;

            
        }
        minc++;
        //bottom wall
        for(int i=maxr,j=minc;j<=maxc && cnt < tne;j++){
            System.out.println(arr[i][j]);
            cnt++;

        }
        maxr--;
        // right wall
        for(int i=maxr,j=maxc;i>=minr && cnt < tne;i--){
            System.out.println(arr[i][j]);
            cnt++;

        }
        maxc--;

        // top wall
        for(int i=minr,j=maxc;j>=minc && cnt < tne;j--){
            System.out.println(arr[i][j]);
            cnt++;

        }
        minr++;

    }
}
}
   
