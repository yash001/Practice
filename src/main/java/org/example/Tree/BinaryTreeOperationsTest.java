/**
 * 
 */
package org.example.Tree;

/**
 * 
 */
public class BinaryTreeOperationsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeOperations tree = new BinaryTreeOperations();
		
		//
		//create
		tree.root = tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 32);
		tree.insert(tree.root, 48);
		tree.insert(tree.root, 46);
		tree.insert(tree.root, 49);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);
		tree.insert(tree.root, 80);
		
		//read
		/*
		//preorder traversal
		System.out.print("Pr-order traversal: ");
        tree.preorder(tree.root);
        System.out.println();
		*/
		
		//inorder traversal
		System.out.print("In-order traversal: ");
        tree.inorder(tree.root);
        System.out.println();

		//update
        boolean updated = tree.update(tree.root, 40, 45);
        if (updated) {
            System.out.print("After update (40 -> 45): ");
            tree.inorder(tree.root);
            System.out.println();
        } else {
            System.out.println("Update failed: Value 40 not found");
        }

        // Delete
        tree.delete(tree.root, 30);
        System.out.print("After deleting 20: ");
        tree.inorder(tree.root);
        System.out.println();	
	}

}
