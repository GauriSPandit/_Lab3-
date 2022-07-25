package Driver;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Type 1 to enter a Sum Value");
		System.out.print("\n");
		System.out.print("Type 2 to consider sum Value 130");
		Integer selection = sc.nextInt();
		
		int sum=0;
		if (selection == 1) {
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the sum value");
			 sum = sc.nextInt();

		}else {
			 sum = 130;
		}
		int value;
		boolean status;
		Node root = null;
		int[] arr = { 40,20,50,60,10,30,70};
		for (int i = 0; i < arr.length; i++) {
		value = arr[i];
		if (root == null) {
		root = insert(root, value);
		} else {
		insert(root, value);
		}
		}

		findPair(root, sum);
	}

		static class Node {
			int key;
			Node left, right;
		};

		static Node newNode(int data)
		{
			Node temp = new Node();
			temp.key = data;
			temp.left = null;
			temp.right = null;
			return temp;
		}

		static Node insert(Node root, int key)
		{
			Node newnode = newNode(key);
			Node x = root;
			Node current_parent = null;
			while (x != null) {
			current_parent = x;
			if (key < x.key)
			x = x.left;
			else if (key > x.key)
			x = x.right;
			else {
			System.out.println("Value already exists!!!");
			return newnode;
			}
			}
			// If the root is null, the tree is empty.
			if (current_parent == null)
			current_parent = newnode;
			// assign new node node to the left child
			else if (key < current_parent.key)
				current_parent.left = newnode;
			// assign the new node to the right child
			else
			current_parent.right = newnode;
			// return pointer to new node
			return current_parent;

		}

		static boolean findpair(Node root, int sum,
									HashSet<Integer> set)
		{
			if (root == null)
				return false;

			if (findpair(root.left, sum, set))
				return true;

			if (set.contains(sum - root.key)) {
				System.out.println("Pair is found ("
								+ (sum - root.key) + ", "
								+ root.key + ")");
				return true;
			}
			else
				set.add(root.key);

			return findpair(root.right, sum, set);
		}

		static void findPair(Node root, int sum)
		{
			HashSet<Integer> set = new HashSet<Integer>();
			if (!findpair(root, sum, set))
				System.out.print("Nodes are not Found!"+ "\n");
		}

	}


