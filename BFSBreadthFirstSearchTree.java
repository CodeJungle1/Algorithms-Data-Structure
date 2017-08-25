package RePracticeAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class BFSBreadthFirstSearchTree {
	static class Tree {
		int value;
		Tree left;
		Tree right;
	}

	public void traveresBFS(Tree root, Queue<Tree> queue) {
		if (queue.isEmpty())
			return;
		root = queue.element();
		queue.remove();
		System.out.print(root.value);
		if (root.left != null)
			queue.add(root.left);
		if (root.right != null)
			queue.add(root.right);
		traveresBFS(root, queue);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Tree> queue = new LinkedList<Tree>();
		BFSBreadthFirstSearchTree bfs = new BFSBreadthFirstSearchTree();
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
		
		queue.add(root);
		bfs.traveresBFS(root, queue);
	}

}
