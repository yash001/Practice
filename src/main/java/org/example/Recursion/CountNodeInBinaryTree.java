/**
 * 
 */


package org.example.Recursion;
/**
 * Solutions :
 * Time Complexity : O(N)
 * Space Complexity : O(H) , h = height of binary tree, skewed tree = O(N)
 
 Time Complexity:
The time complexity of the countNodes function is O(n), where n is the total number of nodes in the binary tree.
The function visits each node exactly once, making the time complexity proportional to the total number of nodes.
Space Complexity:
The space complexity is O(h), where h is the height of the binary tree.
This is due to the space used by the call stack during recursion. In the worst case (for a skewed tree), the height h could be n, making the space complexity O(n). For a balanced tree, the height is log(n), so the space complexity would be O(log n).
Summary:
Time Complexity: O(n) — Linear time, where n is the number of nodes in the binary tree.
Space Complexity: O(h) — Linear space, where h is the height of the binary tree (O(log n) for a balanced tree and O(n) for a skewed tree).
 */

import org.example.Tree.TreeNode;

public class CountNodeInBinaryTree {

	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode p = new TreeNode(1);
	 	p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        System.out.print("Count of nodes in given Binary Tree.: ");	
		
		System.out.print(" "+ countNodes(p)+" ");
	}
	
	public static int countNodes(TreeNode root) {
	    if (root == null) {
	        return 0;
	    }
	    return 1 + countNodes(root.left) + countNodes(root.right);
	}

}
