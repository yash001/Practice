/**
 * 
 */
package org.example.Tree;

/**
 * 
 */
public class BinaryTreeOperations {

	TreeNode root;
	public TreeNode insert(TreeNode root,int data) {
		// TODO Auto-generated method stub
		
		if(root == null) {
			return new TreeNode(data);
		
		} 
		
		if(data < root.data) {
			
			root.left = insert(root.left,data);
			
		}else if(data > root.data) {
			root.right = insert(root.right,data);
		}
		
		
		return root;
	}
	
	public void inorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root != null) {
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	public void preorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root != null) {
			System.out.print(root.data + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public boolean update(TreeNode root, int oldData, int newData) {
		 // TODO Auto-generated method stub
		 TreeNode node = search(root,oldData);
		 if (node != null) {
	            node.data = newData;
	            return true;
	     }
		 return false;
	}

	private TreeNode search(TreeNode root, int oldData) {
		if(root == null || root.data == oldData) {
			return root;
		}
		if(oldData < root.data) {
		 return search(root.left,oldData);
		}else {
		 return search(root.right,oldData);
		}
		
	}

	public TreeNode delete(TreeNode root, int data) {
		// TODO Auto-generated method stub
		if (root == null) {
            return null;
        }
		if(data < root.data) {
			root.left = delete(root.left,data);
			
		}else if(data > root.data){
			root.right = delete(root.right,data);
		} else {
            // Node to be deleted found

            // Node with only one child or no child

			if(root.left == null) {
				return root.right;
			}
			if(root.right == null) {
				return root.left;
			}
			
			/*
			// Node with two children
			root.data = minValue(root.right);
			root.right = delete(root.right,root.data);
			*/
			
			// Node with two children
				TreeNode node = minValueNode(root.right);
				root.data = node.data;
				root.right = delete(root.right,node.data);
			
		}
		
		
		return root;
	}

	/*
	private int minValue(TreeNode root) {
		// TODO Auto-generated method stub
		int minValue = root.data;
		if(root.left != null) {
			minValue = minValue(root.left);
			root = root.left;
		}
		return minValue;
	}

	*/
	public TreeNode minValueNode(TreeNode root){
        while(root.left!=null){
            root= root.left;
        }
        return root;
    }
	

}
