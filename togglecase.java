public class togglecase {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("HelloWORldsgdjSDFJK!!");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                str.setCharAt(i, (char)(str.charAt(i) + 32)); // Modify the character

            }
            else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                str.setCharAt(i, (char)(str.charAt(i) - 32)); // Modify the character

            }
        }
        System.out.println("updated string is:"+str);
    }
    
}
