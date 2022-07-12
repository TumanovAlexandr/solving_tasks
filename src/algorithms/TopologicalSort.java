package algorithms;

import java.util.*;

public class TopologicalSort {

    static class Graph {

        int V;
        List<Integer>[] adj;

        public Graph(int v) {
            V = v;
            adj = new ArrayList[V];

            for (int i = 0; i < adj.length; i++) {
                adj[i] = new ArrayList<Integer>();
            }
        }

        public void addEdge(int u, int v) {
            adj[u].add(v); //1->2 //1->3 //1->2,3
        }

        public void topologicalSort() {
            int[] indegree = new int[V];

            for (int i = 0; i < V; i++) {
                ArrayList<Integer> temp = (ArrayList<Integer>) adj[i];

                //indegree
                for (int vertex : temp) {
                    indegree[vertex]++;
                }
            }

            // the vertex that we are selecting
            Queue<Integer> q = new LinkedList<>();

            for (int i = 0; i < V; i++) {
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }

            // keep track of the number selected vertices
            int c = 0;

            Vector<Integer> linearOrder = new Vector<>();

            while (!q.isEmpty()) {
                int x = q.poll();
                linearOrder.add(x);

                for (Integer vertex : adj[x]) {
                    if (--indegree[vertex] == 0)
                        q.add(vertex);
                }
                c++;
            }

            if (c != V) {
                System.out.println("Graph contains -ve cycle");
                return;
            }

            System.out.println("The Linear Order is :");
            for (int i : linearOrder) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {

        Graph g = new Graph(6);
        g.addEdge(1, 2);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(4, 2);
        g.addEdge(4, 3);
        g.addEdge(4, 5);

        g.topologicalSort();
    }
}
