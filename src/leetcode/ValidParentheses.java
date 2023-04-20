package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
	    Stack<Character> stack = new Stack<>();
	    for (char c : s.toCharArray()) {
	        if (c == '(' || c == '{' || c == '[') {
	            stack.push(c);
	        } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
	            stack.pop();
	        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
	            stack.pop();
	        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
	            stack.pop();
	        } else {
	            return false;
	        }
	    }
	    return stack.isEmpty();
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Bracket/s: ");
		String sts = in.nextLine(); // Capture user input

		ValidParentheses isValid = new ValidParentheses(); // Create an object of RomanToInt class
		System.out.println(isValid.isValid(sts)); // Call romanToInt() method on the object

		in.close();

	}

}
