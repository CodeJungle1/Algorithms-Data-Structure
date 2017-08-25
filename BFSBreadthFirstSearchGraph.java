package RePracticeAlgo;

import java.util.LinkedList;
import java.util.Queue;

public class BFSBreadthFirstSearchGraph {
	public void TraverseBFS(int graph[][], int visited[], int source,
			Queue queue) {
		queue.add(source);
		while (!queue.isEmpty()) {
			source = (int) queue.element();
			visited[source] = 1;
			System.out.println(source + " ");
			queue.remove();
			for (int k = 0; k < graph.length; k++) {
				if (visited[k] != 1 && graph[source][k] == 1) {
					queue.add(k);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFSBreadthFirstSearchGraph bfs = new BFSBreadthFirstSearchGraph();
		Queue queue = new LinkedList();
		int graph[][] = new int[][] { 
				{ 0, 1, 1, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0 }, 
				};
		int visited[] = new int[graph.length];
		bfs.TraverseBFS(graph, visited, 1, queue);

	}

}
