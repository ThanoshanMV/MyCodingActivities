import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        Stack<Character> stack = new Stack<>();
        char lastPop;
        boolean isValid = true;
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '(') {
                stack.push('(');
            }
            else if (c == '[') {
                stack.push('[');
            }
            else if (c == ']') {
                lastPop = stack.pop();
                if (lastPop != '[') {
                    isValid = false;
                    break;
                }
            }
            else if (c == ')') {
                lastPop = stack.pop();
                if (lastPop != '(') {
                    isValid = false;
                    break;
                }
            }
        }
        
        if (isValid) {
            System.out.println("VALID");
        }
        else {
            System.out.println("INVALID");
        }
    }
}
