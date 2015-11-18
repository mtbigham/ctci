/*Check if binary tree is balanced.  Balanced tree = heights of two subtrees of any node never differ by >1*/

public class q4_1{
	public static void main(String[] args) {
			// Create balanced tree
		int[] array = {0, 1, 2, 3, 5, 6, 7, 8, 9, 10};
		TreeNode root = TreeNode.createMinimalBST(array);
	
			
		System.out.println("Is balanced? " + isBalanced(root));
			
		root.insertInOrder(4); // Add 4 to make it unbalanced
	
		System.out.println("Is balanced? " + isBalanced(root));
	}
	
	public static int checkHeight(TreeNode root){
		if(root == null){
			return 0;  //no height
		}
		
		//check left balance
		int leftHeight = checkHeight(root.left);
		if(leftHeight == -1){
			return -1;
		}
		
		//check right balance
		int rightHeight = checkHeight(root.right);
		if(rightHeight == -1){
			return -1;
		}
		
		//check current node's balance
		int diff = leftHeight-rightHeight;
		if(Math.abs(diff) > 1){
			return -1;
		}
		else{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	
	public static boolean isBalanced(TreeNode root){
		if(checkHeight(root) == -1){
			return false;
		}
		else{
			return true;
		}
	}
}