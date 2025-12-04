import java.util.*;
public class ngetr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
          arr[i]= sc.nextInt()  ;
        }
        Stack<Integer> st = new Stack<>();
        
        int[] res= new int[n];
        st.push(arr[n-1]);
            res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            
            
                //if(st.isEmpty()){
                   // res[i]=-1;
                //}
                while(!st.isEmpty() && arr[i]>=st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                 res[i]=st.peek();
                }
                else{
                res[i]=-1;
                }
                
                st.push(arr[i]);
            }
        
        //printing the op array
        for(int i=0;i<res.length;i++){
            System.err.println(res[i]+"\t");
        }

    }
}
