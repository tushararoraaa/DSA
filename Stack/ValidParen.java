import java.util.*;

public class ValidParen {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch=='('|| ch=='{' || ch=='['){
                st.push(ch);
            }else if(st.size()==0){
                return false;
            }else if(ch==')'){
                if(st.peek()=='('){
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch=='}'){
                if(st.peek()=='{'){
                    st.pop();
                }else{
                    return false;
                }
            }else if(ch==']'){
                if(st.peek()=='['){
                    st.pop();
                }else{
                    return false;
                }
            }
            
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(isValid(s));
    }
}
