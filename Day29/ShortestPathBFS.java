import java.util.*;

public class ShortestPathBFS {

    public static void main(String[] args) {

        int V=6;

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);
        graph.get(3).add(4);
        graph.get(4).add(5);

        int dist[]=new int[V];
        Arrays.fill(dist,-1);

        Queue<Integer> q=new LinkedList<>();

        dist[0]=0;
        q.offer(0);

        while(!q.isEmpty()){

            int node=q.poll();

            for(int neigh:graph.get(node)){

                if(dist[neigh]==-1){

                    dist[neigh]=dist[node]+1;
                    q.offer(neigh);
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}