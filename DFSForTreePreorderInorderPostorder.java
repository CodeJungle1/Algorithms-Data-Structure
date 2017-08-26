package RePracticeAlgo;

public class DFSForTreePreorderInorderPostorder {
	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	// Tree DFS Inorder Preorder postorder
	public void preorderTravrsal(Tree root) {
		if (root == null)
			return;
		System.out.print(root.value + ",");
		preorderTravrsal(root.left);
		preorderTravrsal(root.right);
	}

	public void inorderTravrsal(Tree root) {
		if (root == null)
			return;
		inorderTravrsal(root.left);
		System.out.print(root.value + ",");
		inorderTravrsal(root.right);
	}

	public void postorderTravrsal(Tree root) {
		if (root == null)
			return;
		postorderTravrsal(root.left);
		postorderTravrsal(root.right);
		System.out.print(root.value + ",");
	}

	public static void main(String arg[]) {
		DFSForTreePreorderInorderPostorder dfs = new DFSForTreePreorderInorderPostorder();
		Tree root = new Tree();
		root.value = 1;
		
		root.left = new Tree();
		root.left.value = 2;
		root.right = new Tree();
		root.right.value = 3;
		
		root.left.left = new Tree();
		root.left.left.value = 4;
		root.left.right = new Tree();
		root.left.right.value = 5;
		
		root.right.left = new Tree();
		root.right.left.value = 6;
		root.right.right = new Tree();
		root.right.right.value = 7;
		System.out.println("Preorder : ");
		dfs.preorderTravrsal(root);
		System.out.println("");
		System.out.println("Inorder : ");
		dfs.inorderTravrsal(root);
		System.out.println("");
		System.out.println("Postorder : ");
		dfs.postorderTravrsal(root);
	}
}
