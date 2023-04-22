// Write a java program to traverse a graph using depth first search (use
// Stack collection ).


package Assignment_2A;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q6 {

    public static void main(String[] args) {
        Q6 g = new Q6(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        System.out.print("DFS traversal: ");
        g.DFS(0);
    }

    private final int V; // number of vertices
    private final List<List<Integer>> adj; // adjacency list

    public Q6(int V) {
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

    public void DFS(int start) {
        boolean[] visited = new boolean[V]; // to mark visited vertices
        Stack<Integer> stack = new Stack<>(); // create a stack for DFS

        visited[start] = true; // mark start vertex as visited
        stack.push(start); // push the start vertex onto the stack

        while (!stack.isEmpty()) {
            int u = stack.pop(); // pop a vertex from the stack
            System.out.print(u + " ");

            // get all adjacent vertices of popped vertex u
            for (int v : adj.get(u)) {
                if (!visited[v]) {
                    visited[v] = true; // mark adjacent vertex as visited
                    stack.push(v); // push adjacent vertex onto the stack
                }
            }
        }
    }
}
