package Service;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class checkBracketsBalance {
	public static boolean checkBalance(Stack stack) {
		if(stack.size()%2 != 0)
			return false;
		Stack<Character> tempOpening = new Stack();
		Stack<Character> tempClosing = new Stack();
		Queue<Character> tempQue = new LinkedList<Character>();
		
		while (stack.empty() == false) {
			char ch =(char) stack.pop(); 
			
			if(ch == '{'||ch == '('||ch == '[') {
				tempOpening.add(ch);
				continue;
			}
			else {
			switch (ch) {
			case '}':
				ch= '{';
				break;
			case ']':
				ch= '[';
				break;
			case ')':
				ch= '(';
				break;
			case '{':
				ch= '}';
				break;
			case '[':
				ch= ']';
				break;
			case '(':
				ch= ')';
				break;
			default:
				break;
			}

				tempQue.add(ch);
			}
		}
		
		for (int i = 0; i <= tempQue.size()+1; i++) {
			tempClosing.add(tempQue.remove());	
		}
		
		while (stack.empty() == false)
	    {
	        // If the top elements of both stacks
	        // are same
	        if (stack.peek() == tempClosing.peek())
	        {
	            // Pop top of both stacks
	            stack.pop();
	            tempClosing.pop();
	        }
	        else
	        {
	            // Otherwise, set flag to false
	            return false;
	        }
		
		
	}
		return true;
	}

}
