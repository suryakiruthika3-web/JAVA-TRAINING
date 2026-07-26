import java.util.*;

public class Bipartite {

    static boolean bfs(int src,int color[],
                       ArrayList<ArrayList<Integer>> graph){

        Queue<Integer> q=new LinkedList<>();

        q.offer(src);

        color[src]=0;

        while(!q.isEmpty()){

            int node=q.poll();

            for(int neigh:graph.get(node)){

                if(color[neigh]==-1){

                    color[neigh]=1-color[node];
                    q.offer(neigh);
                }

                else if(color[neigh]==color[node])
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args){

        int V=4;

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<V;i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        int color[]=new int[V];

        Arrays.fill(color,-1);

        boolean ans=true;

        for(int i=0;i<V;i++)
            if(color[i]==-1)
                ans&=bfs(i,color,graph);

        System.out.println(ans);
    }
}