package Driver;

import java.util.Scanner;
import java.util.Stack;

import Service.checkBracketsBalance;
import Service.inputString;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type 1 to enter a Bracket String");
		System.out.print("\n");
		System.out.print("Type 2 to accept default Bracket String");
		Integer num = sc.nextInt();
		
		Stack<Character> stack = new Stack();
		if (num == 1) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a String of Brackets: ");
		String str = scan.nextLine();
		inputString newString = new inputString();
		stack = newString.acceptInput(str);	 
		}
		else {
			String str = "({[]})";
			inputString newString = new inputString();
			stack = newString.acceptInput(str);
		}
		System.out.print("The stack is: " + stack);
		
		if(stack.empty()==false)
		{
		boolean result = checkBracketsBalance.checkBalance(stack);
		System.out.print("\n");
		if(result) {
			System.out.print("The String has Balanced Brackets ");

		}else {
			System.out.print("The String does not contain Balanced Brackets ");

		}
		}
	}

}
