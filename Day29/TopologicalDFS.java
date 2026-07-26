import java.util.*;

public class TopologicalDFS {

    static void topo(int node, boolean[] vis,
                     Stack<Integer> st,
                     ArrayList<ArrayList<Integer>> graph) {

        vis[node] = true;

        for (int neigh : graph.get(node))
            if (!vis[neigh])
                topo(neigh, vis, st, graph);

        st.push(node);
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());

        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        boolean vis[] = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<V;i++)
            if(!vis[i])
                topo(i,vis,st,graph);

        while(!st.empty())
            System.out.print(st.pop()+" ");
    }
}