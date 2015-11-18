/*Create minimal BST from ordered int array*/
public class q4_3{
	public static void main(String[] args){
		int[] arr = {1,3,4,5,7,10};
		TreeNode tn = orderedArrayToBST(arr);
		System.out.println("Done");
	}
	public static TreeNode orderedArrayToBST(int[] arr){
		return orderedArrayToBST(arr, 0, arr.length-1);
	}
	public static TreeNode orderedArrayToBST(int[] arr, int start, int end){
		if(start > end){
			return null;
		}
		int mid = (start+end)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.setLeftChild(orderedArrayToBST(arr, start, mid-1));
		n.setRightChild(orderedArrayToBST(arr, mid+1, end));
		
		return n;
	}
}