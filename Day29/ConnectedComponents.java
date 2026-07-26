import java.util.*;

public class ConnectedComponents {

    static void dfs(int node, boolean vis[],
                    ArrayList<ArrayList<Integer>> graph){

        vis[node]=true;

        for(int x:graph.get(node))
            if(!vis[x])
                dfs(x,vis,graph);
    }

    public static void main(String args[]){

        int V=6;

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(2).add(3);
        graph.get(3).add(2);

        graph.get(4).add(5);
        graph.get(5).add(4);

        boolean vis[]=new boolean[V];

        int count=0;

        for(int i=0;i<V;i++){

            if(!vis[i]){
                dfs(i,vis,graph);
                count++;
            }
        }

        System.out.println("Connected Components = "+count);
    }
}