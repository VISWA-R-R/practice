package telegram.day15;

import java.util.Stack;

public class validbracket {
    public static boolean valid(String s){
        Stack<Character> sta=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                sta.push(c);
            }
            else if(c==')'){
                if(!sta.isEmpty() && sta.peek()=='('){
                    sta.pop();
                }
                else{
                    return false;
                }
            }
            else if(c==']'){
                if(!sta.isEmpty() && sta.peek()=='['){
                    sta.pop();
                }
                else{
                    return false;
                }
            }
            else if(c=='}'){
                if(!sta.isEmpty() && sta.peek()=='{'){
                    sta.pop();
                }
                else{
                    return false;
                }
            }
        }
        return sta.isEmpty();
    }
    public static void main(String[] args) {
        String bra="[({})]";
        System.out.println(valid(bra));

    }
}
