package com.practice.problem;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
	    // create the example binary tree
	    TreeNode root = new TreeNode(1);
	    root.right = new TreeNode(2);
	    root.right.left = new TreeNode(3);

	    // create an instance of the Solution class
	    Solution solution = new Solution();

	    // call the preorderTraversal function
	    List<Integer> result = solution.preorderTraversal(root);

	    // print the result
	    System.out.println(result); // [1, 2, 3]
	}

}
