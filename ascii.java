public class ascii {
    public static void main(String[] args) {
        String str="abcdgcA!@";
        for(int i=1;i<str.length();i++){
            char ch1=str.charAt(i);
            char ch2=str.charAt(i-1);
            int asciidiff=(int)ch1-(int)ch2;
            System.out.print(ch2 +""+asciidiff);

        }
    }
    
}
