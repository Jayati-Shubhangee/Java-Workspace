
import java.util.Scanner;

public class buyandsellstock2 {
    public static void main(String[] args) {
        /*Scanner scn = new Scanner(System.in);
        int [] arr={100,180,260,310,40,535,695};
        int maxprofit=0;
        int profit=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<arr[i-1]&& arr[i]<arr[i+1]){
                int buy=arr[i];
                int index=i;
                maxprofit=0;
                for(int j=index+1;j<arr.length;j++){
                    if(arr[j]-buy>maxprofit){
                        maxprofit=arr[j]-buy;
                        
                    }

                }
                profit+=maxprofit;
            }
        }
        System.out.println("maxprofit is :"+profit);


    }
    
}*/
        Scanner scn = new Scanner(System.in);
        int[] arr = {100, 180, 260, 310, 40, 535, 695};
        int profit = 0; // Variable to store total profit

        for (int i = 0; i < arr.length - 1; i++) {
            // Find a local minima (buying point)
            if (i == 0 || (arr[i] < arr[i - 1] && arr[i] < arr[i + 1])) {
                int buy = arr[i]; // Set the buying price
                int maxprofit = 0;

                // Look for the best selling price after the buying point
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] - buy > maxprofit) {
                        maxprofit = arr[j] - buy;
                    }
                }

                // Add the maximum profit for this transaction to total profit
                profit += maxprofit;
            }
        }

        System.out.println("maxprofit is :" + profit);
    }
}

