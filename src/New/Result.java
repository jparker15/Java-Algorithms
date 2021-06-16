package New;

import java.util.Stack;

public class Result {

    public static void main(String[] args) {
       System.out.println(getMin("(((((("));
    }

    public static int getMin(String s){
        //Init stack
        //iterate each char in input string
        //only two possible chars
        //if '(' or stack is empty add to stack
        // else
            // if peek == '(' pop stack
            // else add to stack
        //return stack.size()

        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(' || stack.empty() == true) {
                stack.add(c);
            }else{
                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.add(c);
                }
            }
        }

        return stack.size();
    }
}
