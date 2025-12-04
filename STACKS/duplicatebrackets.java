import java.util.*;
public class duplicatebrackets {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
Stack<Character> st= new Stack<>();
String str= scn.nextLine();
/*for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);
    if(ch==')'){
       if (st.isEmpty()) { 
        System.out.println("false"); 
        break;
       }
        while(!st.isEmpty() && st.peek() != '('){
st.pop();
        }
        st.pop();
    }
    if(ch=='}'){
        if (st.isEmpty()) { 
        System.out.println("false"); 
        break;
        }
         while(!st.isEmpty() && st.peek() != '{'){
st.pop();
        }
        st.pop();

    }
     if(ch==']'){
       if (st.isEmpty()) { 
        System.out.println("false"); 
        break;
       }
        while(!st.isEmpty() && st.peek() != '['){
st.pop();
        }
        st.pop();
    }
else{
st.push(ch);
}
  }
  if(st.isEmpty()){
  System.out.println("true"); 
  }
  else{
    System.out.println("false");
  } 
}
}*/
for (int i = 0; i < str.length(); i++) {
    char ch = str.charAt(i);

    if (ch == ')') {
        if (st.isEmpty()) { 
            System.out.println("false"); 
            return;
        }
        while (!st.isEmpty() && st.peek() != '(') {
            st.pop();
        }
        if (st.isEmpty()) {
            System.out.println("false");
            return;
        }
        st.pop();
    } 
    else if (ch == '}') {
        if (st.isEmpty()) { 
            System.out.println("false"); 
            return;
        }
        while (!st.isEmpty() && st.peek() != '{') {
            st.pop();
        }
        if (st.isEmpty()) {
            System.out.println("false");
            return;
        }
        st.pop();
    } 
    else if (ch == ']') {
        if (st.isEmpty()) { 
            System.out.println("false"); 
            return;
        }
        while (!st.isEmpty() && st.peek() != '[') {
            st.pop();
        }
        if (st.isEmpty()) {
            System.out.println("false");
            return;
        }
        st.pop();
    } 
    else {
        st.push(ch);
    }
}
  }
}
  
