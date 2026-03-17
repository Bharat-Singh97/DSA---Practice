/*
Problem: Valid Parentheses

Approach:
- Stack का use किया है opening brackets store करने के लिए
- हर closing bracket पर check किया कि stack का top matching है या नहीं
- अगर mismatch मिला → false return
- अंत में stack empty होना चाहिए

Concept:
Stack (LIFO)

Time Complexity:
O(n)

Space Complexity:
O(n)
*/



import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '('  || ch == '{' || ch  =='['){
                stack.push(ch);
            }
            else{

                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();

                if((ch == ')' && top != '(') ||(ch == ']' && top != '[') || (ch == '}' && top != '{')){
                    return false;
                }
            }
        }
         return stack.isEmpty();
    }
}
