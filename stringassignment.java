
public class stringassignment {
    public static void main(String[] args) {
        
    
        
        
      
        
       
        //enetring various strings 
        /*System.out.println("enter the limit:");
        int n=scn.nextInt();
        scn.nextLine();
        String orig;
        for(int j=0;j<n;j++){
            System.out.println("enter the string:");
            orig=scn.nextLine();
           
            System.out.println("original string is "+orig);
            int length=orig.length();
            String rev="";

            for(int i=length-1;i>=0;i--){
                rev+=orig.charAt(i);
            }
            System.out.println("reversed string is :"+rev);
            if(orig.equals(rev)){
                System.out.println("yes" +orig+ "is a pallindrome");
            }
            else{
                System.out.println("no" +orig+ "is not a pallindrome");
            }

        }*/


       /*  String s1=scn.nextLine();
        String s2=scn.nextLine();
        //using string builder
        StringBuilder str=new StringBuilder();
        str.append("hello");
        str.append(" ");
        str.append(s1);
        str.append(s2);
        String s3=str.toString();
        System.out.println(s3);



        
       
        

    }
    
}*/
// FIND MAX STRING 
/*String str=scn.nextLine();
//int length=str.length();
String[] words=str.split(" ");
int maxlen=0;
String maxstr=" ";

for(int i=0;i<words.length;i++){
    System.out.print(words[i]+"\t" + words[i].length());
    System.out.println();
    if(words[i].length()>maxlen){
        maxlen=words[i].length();
        maxstr=words[i];
    }
}
    System.out.println("max str is:"+maxstr);


    }
}*/
//CONVERT TO UPPER CASE  IN STRINGS
/*String str=scn.nextLine();
String uppercase=" ";
for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
if(ch>='a' && ch<='z'){
    ch=(char)(ch-32);
}
uppercase+=ch;

}
System.out.println("uppercasestring is:"+uppercase);
    }
}*/

/*String str=scn.nextLine();
//printing charachter wise
for(int i=0;i<str.length();i++){
    char ch=str.charAt(i);
    System.out.println(ch);
}
    }
}*/
//Substring in strings
/*String s= scn.nextLine();
int len=s.length();
System.out.println(s.substring(0,len));
System.out.println(s.substring(1));
    }
}*/
/*String str=scn.nextLine();
int len=str.length();
for(int i=0;i<len;i++){
    //char ch1=str.charAt(i);
    for(int j=i+1;j<=len;j++){
       // char ch2=str.charAt(j);
        System.out.println(str.substring(i,j));

    }
    System.out.println();
}
    }
}*/
/*String str=scn.nextLine();
int i=0;

while(i<str.length()){
    int j=i+1;
    //char ch1=str.charAt(i);
    while (j<=str.length()) {
        //char ch2=str.charAt(j);
        System.out.println(str.substring(i,j)); 
        j++;
        
    }
    System.out.println();
    i++;

}
    }
}*/
/*String str=scn.nextLine();
String [] parts=str.split(",");
for(int i=0;i<parts.length;i++){
    System.out.println(parts[i]);
}
    }
}*/


//CHECKING PALLINDROMIC SUBSTRING

/*public static void main(String[] args) {
/*Scanner scn=new Scanner(System.in);
String str=scn.nextLine();
System.out.println(str);
str.charAt[0]='Z';//will not work immutable
System.out.println(str);

/*for all substrings
int len=str.length();
for(int i=0;i<len;i++){
    for(int j=i+1;j<=len;j++){
      String ss=(str.substring(i,j));
      if(ispalindrome(ss)){
        System.out.println(ss);
      }
      

    }
}*/
    
    /*public static boolean ispalindrome(String ss){
        int i=0;
        int j=ss.length()-1;
        while(i<=j){
            char ch1=ss.charAt(i);
            char ch2=ss.charAt(j);
            if(ch1!=ch2){
                return false;
            }
            else{
                i++;
                j--;
            }

        }
        return true;

    }*/
    /*public static boolean ispalindrome(String ss){
        String rev="";
        for(int i=ss.length()-1;i>=0;i--){
            char ch = ss.charAt(i);
            rev+=ch;
            if(rev.equals(ss)){
                return true;
            }
        }
        
            return false;
        }
    }*/
/*Scanner scn=new Scanner(System.in);
//String str=scn.nextLine();
StringBuffer buffer=new StringBuffer(scn.nextLine());  
        buffer.append(" "+"java");  
        System.out.println(buffer);      

//string builder
StringBuilder builder=new StringBuilder(scn.nextLine());  
        builder.append(" "+"java");  
        System.out.println(builder);  
}
}*/

/*String s="geeks";
String [] words=s.split("");
StringBuilder unique=new StringBuilder();
for(int i=0;i<words.length;i++){
    
        if(unique.indexOf(words[i])==-1){
            unique.append(words[i]);
        }
    }
    System.out.println(unique.toString());
    
}
}*/


       /*  String s = "geeks";
        StringBuilder unique = new StringBuilder();

        // Step 1: Count the frequency of each character
        int[] freq = new int[256]; // Assuming ASCII characters
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        // Step 2: Collect characters that appear only once
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] == 1) {
                unique.append(s.charAt(i));
            }
        }

        // Step 3: Output the result
       // System.out.println("Non-repeating characters: " + unique.toString());
        if(unique.length()>0){
            System.out.println(String.valueOf(unique.charAt(0))); 
}
   
    }

}*/

    }
}









