/**
 * 
 */
package org.example.Recursion;

import org.example.Tree.TreeNode;

/*
7. Problem: Maximum Depth of Binary Tree
Problem Description:
Given the root of a binary tree, find its maximum depth.
 * 
 * 
 * Solutions :
 * Time Complexity : O(N)
 * Space Complexity : O(H) , h = height of binary tree, skewed tree = O(N)
 * 
 * Time Complexity:
The time complexity of the maxDepth function is O(n), where n is the total number of nodes in the binary tree.
The function visits each node exactly once to calculate the depth of the left and right subtrees, making the time complexity proportional to the total number of nodes.
Space Complexity:
The space complexity is O(h), where h is the height of the binary tree.
This space is used by the call stack during recursion. In the worst case (for a skewed tree), the height h could be n, making the space complexity O(n). For a balanced tree, the height is log(n), so the space complexity would be O(log n).
Summary:
Time Complexity: O(n) — Linear time, where n is the number of nodes in the binary tree.
Space Complexity: O(h) — Linear space, where h is the height of the binary tree (O(log n) for a balanced tree and O(n) for a skewed tree).






 */
public class MaximumDepthOfBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode p = new TreeNode(10);
	 	p.left = new TreeNode(5);
        p.right = new TreeNode(15);
        p.left.left = new TreeNode(4);
        System.out.print("Count of nodes in given Binary Tree.: ");	
		
		System.out.print(" "+ maximumDepthOfBinaryTree(p)+" ");
	}
	
	public static int maximumDepthOfBinaryTree(TreeNode root) {
	    if (root == null) {
	        return 0;
	    }
	    int left = maximumDepthOfBinaryTree(root.left);
	    int right = maximumDepthOfBinaryTree(root.right);
	    
	    return 1 + Math.max(left,right);
	}

}
