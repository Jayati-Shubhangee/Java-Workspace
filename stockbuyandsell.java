public class stockbuyandsell {
    public static void main(String[] args) {
        int [] price={7,1,5,3,6,4};
        int maxprofit=0;
        for(int i=0;i<price.length-1;i++){
            //int max=price[i];
            for(int j=i+1;j<=price.length-1;j++){
                int profit=price[j]-price[i];
                if(profit>maxprofit){
                    maxprofit=profit;
                }

                    }
                }
                System.out.println("max profit is:"+maxprofit);
                
            }


        }

    
    

