import java.util.ArrayList;
import java.util.LinkedList;

public class q4_4{
	public static void main(String[] args){
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		TreeNode c = new TreeNode(3);
		TreeNode d = new TreeNode(4);
		TreeNode e = new TreeNode(5);
		TreeNode g = new TreeNode(6);
		TreeNode h = new TreeNode(7);
		
		a.setLeftChild(b);
		a.setRightChild(c);
		b.setLeftChild(d);
		b.setRightChild(e);
		d.setLeftChild(g);
		e.setLeftChild(h);
		
		ArrayList<LinkedList<TreeNode>> lists = createLevelLinkedList(a);
		
		for(LinkedList<TreeNode> ll : lists){
			for(TreeNode tn : ll){
				System.out.print(tn.data+" ");
			}
			System.out.println();
		}
	}
	
	public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root){
		//initial call
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLinkedList(root, lists, 0);
		return lists;
	}
	
	public static void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level){
		//base case
		if(root == null){
			return;
		}
		
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		if(lists.size() == level){
			//We haven't been this deep yet!
			lists.add(list);
		}
		else{
			//We already have a list on this level
			list = lists.get(level);
		}
		list.add(root);
		createLevelLinkedList(root.left, lists, level + 1);
		createLevelLinkedList(root.right, lists, level + 1);
	}
	
}