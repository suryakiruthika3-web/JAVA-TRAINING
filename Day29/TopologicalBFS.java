import java.util.*;

public class TopologicalBFS {

    public static void main(String[] args) {

        int V=6;

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());

        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);

        int indegree[]=new int[V];

        for(int i=0;i<V;i++)
            for(int j:graph.get(i))
                indegree[j]++;

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<V;i++)
            if(indegree[i]==0)
                q.offer(i);

        while(!q.isEmpty()){

            int node=q.poll();
            System.out.print(node+" ");

            for(int neigh:graph.get(node)){
                indegree[neigh]--;

                if(indegree[neigh]==0)
                    q.offer(neigh);
            }
        }
    }
}