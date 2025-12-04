public class stringexample {
    public static void main(String[] args) {
        /*String s="aaaabbcccddaeef";
        int n= s.length();
        int count=1;
        for(int i=0;i<n;i++){
            if( i+1<n && s.charAt(i+1) == s.charAt(i)){
                count++;
            }
            else{
                if(count>1){
                    System.out.print(s.charAt(i)+""+count);
                }
                else{
                    System.out.print(s.charAt(i));
                }
             
             count=1;
            }
        }
    }
    
}*/
/*String s="aaaabbcccddaeef";
        int n= s.length();
        int count=1;
        for(int i=0;i<n;i++){
            if( i+1<n && s.charAt(i+1) == s.charAt(i)){
                count++;
            }
            else{
                if(count>=1){
                    System.out.print(s.charAt(i));
                }
             
             count=1;
            }
    
    
    
    
    
        }*/
      /*  int [] arr={8,14,9,17,8,6,42};
        //int index=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
            
            for(int j=i;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            n--;
            i--;
           
        }
    }
        //printing updated array
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+"\t");
        }




    }


    
}*/

int [] arr={8,14,9,17,8,6,42};
//int index=0;
int n=arr.length;
for(int i=n-1;i>=0;i--){
    int div=arr[i];
    for(int k=2;k*k<=div;k++){

        if(div%k!=0){
    
            for(int j=i;j<n-1;j++){
                arr[j]=arr[j-1];
            }
            n--;
            i--;
           
        }
    }
   
}
//printing updated array
for(int i=0;i<n;i++){
    System.out.println(arr[i]+"\t");
}




}



}

