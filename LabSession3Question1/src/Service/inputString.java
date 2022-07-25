package Service;

import java.util.Scanner;
import java.util.Stack;

public class inputString {
	
	public static Stack acceptInput(String str) {
		// TODO Auto-generated method stub
		
		
		Stack<Character> stack = new Stack();
		 for (int i = 0; i < str.length(); i++)
		    {
			 char x = str.charAt(i);
		          if(x == '(' || x == '[' || x == '{' || x == ')' || x == ']' || x == '}') {
		        	  stack.push(x);
		                continue;
		          }
		          else
		          {
		        	  System.out.println("Either one or multiple characters are not a valid Bracket Character");
		        	  break;}
		    }
		
		
		 return stack;
		 
			 
	}
}
