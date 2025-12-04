public class addbinstrings {
    public static void main(String[] args) {
        /*StringBuilder sb1 =new StringBuilder("01001");
        StringBuilder sb2 =new StringBuilder("00101");
        int n1= sb1.length();
        int n2= sb2.length();
        int max=Math.max(n1,n2);
        
       /*  for(int i=0;i<n1;i++){
            for(int j=i;j<i+1;j++){
                if(sb1.charAt(i)==true){
                    continue;
                }
                else{
                    for(int index=1;index<i;index++){
                        sb1.setCharAt(i, sb2.charAt(i-1));
    
                    }

                }
                
            }
        }*/
         
        /*balanceStrings(sb1, sb2, max);

        System.out.println("Balanced sb1: " + sb1);
        System.out.println("Balanced sb2: " + sb2);

        // Initialize the result StringBuilder
        StringBuilder add = new StringBuilder("0".repeat(max + 1));

        //addition process
        char carry='0';
       // StringBuilder add=new StringBuilder();
        
        for(int i=max-1;i>=0;i--){
                    if(sb1.charAt(i)=='0'&& sb2.charAt(i)=='0'){
                        if(carry=='0'){
                            add.setCharAt(i+1,'0');
                        }
                        else{
                            add.setCharAt(i, '1');
                        }
                    }
                        if(sb1.charAt(i)=='0'&& sb2.charAt(i)=='1'){
                            if(carry=='0'){
                                add.setCharAt(i, '1');
                            }
                            else{
                                add.setCharAt(i, '0');
                                carry='1';
                            }
                        }
                            if(sb1.charAt(i)=='1'&& sb2.charAt(i)=='0'){
                                if(carry=='0'){
                                   add.setCharAt(i, '1');
                                }
                                else{
                                    add.setCharAt(i, '0');
                                    carry='1';
                                }
                            }
                                if(sb1.charAt(i)=='1'&& sb2.charAt(i)=='1'){
                                    if(carry=='0'){
                                        add.setCharAt(i, '0');
                                        carry='1';
                                    }
                                    else{
                                        add.setCharAt(i, '1');
                                        carry='1';
                                    }
                                }
                                System.out.println("result:"+add.toString());

                    }
                    public static void balanceStrings(StringBuilder sb1, StringBuilder sb2, int max) {
                        while (sb1.length() < max) {
                            sb1.insert(0, '0'); // Add zero to the beginning
                        }
                        while (sb2.length() < max) {
                            sb2.insert(0, '0'); // Add zero to the beginning
                        }
                    }
                }*/

                        StringBuilder sb1 = new StringBuilder("01001");
                        StringBuilder sb2 = new StringBuilder("00101");
                
                        // Calculate the maximum length
                        int maxLength = Math.max(sb1.length(), sb2.length());
                
                        // Balance the strings
                        balanceStrings(sb1, sb2, maxLength);
                
                        System.out.println("Balanced sb1: " + sb1);
                        System.out.println("Balanced sb2: " + sb2);
                
                        // Initialize the result StringBuilder
                        StringBuilder add = new StringBuilder("0".repeat(maxLength + 1));
                
                        // Perform binary addition
                        char carry = '0';
                        for (int i = maxLength - 1; i >= 0; i--) {
                            if (sb1.charAt(i) == '0' && sb2.charAt(i) == '0') {
                                if (carry == '0') {
                                    add.setCharAt(i + 1, '0');
                                } else {
                                    add.setCharAt(i + 1, '1');
                                    carry = '0';
                                }
                            } else if ((sb1.charAt(i) == '0' && sb2.charAt(i) == '1') || (sb1.charAt(i) == '1' && sb2.charAt(i) == '0')) {
                                if (carry == '0') {
                                    add.setCharAt(i + 1, '1');
                                } else {
                                    add.setCharAt(i + 1, '0');
                                    carry = '1';
                                }
                            } else if (sb1.charAt(i) == '1' && sb2.charAt(i) == '1') {
                                if (carry == '0') {
                                    add.setCharAt(i + 1, '0');
                                    carry = '1';
                                } else {
                                    add.setCharAt(i + 1, '1');
                                }
                            }
                        }
                
                        // Handle carry
                        if (carry == '1') {
                            add.setCharAt(0, '1');
                        }
                
                        // Print the result
                        System.out.println("Result: " + add.toString());
                    }
                
                    // Function to balance the lengths of two strings by prepending zeros
                    public static void balanceStrings(StringBuilder sb1, StringBuilder sb2, int maxLength) {
                        while (sb1.length() < maxLength) {
                            sb1.insert(0, '0'); // Add zero to the beginning
                        }
                        while (sb2.length() < maxLength) {
                            sb2.insert(0, '0'); // Add zero to the beginning
                        }
                    }
                }
                               
            


