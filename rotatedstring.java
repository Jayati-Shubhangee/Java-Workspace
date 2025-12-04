public class rotatedstring {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        StringBuilder sb1= new StringBuilder("abcd");
        StringBuilder temp=new StringBuilder(sb1.append(sb1));
        StringBuilder rotated= new StringBuilder("bdac");
        if(temp.toString().contains(rotated.toString())){
            System.out.println("yes its a roation ");
        }
        
        else{
            System.out.println("no");
        }
        long endTime = System.nanoTime(); // End timing
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("Execution time: " + duration + " ms");
       //System.out.println(System.currentTimeMillis()); 
    }

    
}
/*public class  rotatedstring {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); // Start timing

        StringBuilder sb1 = new StringBuilder("abcd");
        StringBuilder rotated = new StringBuilder("bcda");
        StringBuilder temp = new StringBuilder(sb1).append(sb1);

        if (temp.indexOf(rotated.toString()) != -1) {
            System.out.println("Yes, it's a rotation.");
        } else {
            System.out.println("No");
        }

        long endTime = System.nanoTime(); // End timing
        long duration = (endTime - startTime) / 1_000_000; // Convert to milliseconds
        System.out.println("Execution time: " + duration + " ms");
    }
}*/
StringBuilder sb1= new StringBuilder(s1);
        StringBuilder temp=new StringBuilder(sb1.append(sb1));
        StringBuilder rotated= new StringBuilder(s2);
        if (temp.indexOf(rotated.toString()) != -1) {
        return true;
        } else {
           return false;
        }

        String temp =s1+s1;
       if(temp.contains(s2)){
           return true;
       }
           return false;
       
