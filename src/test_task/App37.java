package test_task;

import java.util.ArrayList;
import java.util.Queue;

public class App37 {
    public static void main(String[] args) {
        // test case 1
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(3).add(4);
        int[] result = topoSort(V, adj);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];
        int[] topSort = new int[V];
        for (ArrayList<Integer> list : adj) {
            for (Integer node : list) {
                indegree[node]++;
            }
        }
        Queue<Integer> queue = new java.util.LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }
        int idx = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (Integer nbr : adj.get(curr)) {
                indegree[nbr]--;
                if (indegree[nbr] == 0) {
                    queue.add(nbr);
                }
            }
            topSort[idx] = curr;
            idx++;
        }
        return topSort;
    }
} // TC: O(V + E), SC: O(V)
