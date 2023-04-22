// Write a java program to traverse a graph using breadth first search (use
// ArrayDeque collection ).

package Assignment_2A;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Q5 {

    public static void main(String[] args) {
        Q5 g = new Q5(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.print("BFS traversal: ");
        g.BFS(0);
    }

    private final int V; // number of vertices
    private final List<List<Integer>> adj; // adjacency list

    public Q5(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; ++i) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[V]; // to mark visited vertices
        ArrayDeque<Integer> queue = new ArrayDeque<>(); // create a queue for BFS

        visited[start] = true; // mark start vertex as visited
        queue.add(start); // enqueue the start vertex

        while (!queue.isEmpty()) {
            int u = queue.poll(); // dequeue a vertex from the queue
            System.out.print(u + " ");

            // get all adjacent vertices of dequeued vertex u
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true; // mark adjacent vertex as visited
                    queue.add(v); // enqueue adjacent vertex
                }
            }
        }
    }
}

