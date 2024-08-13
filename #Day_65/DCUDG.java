import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DCUDG {

    boolean bfs(int src,ArrayList<Integer>[] adjList,boolean[] vis){
        Queue<Integer> q= new LinkedList<>();
        q.add(src);
        while (q.size() != 0) {
            src=q.remove();

            if (vis[src]== true) return true;
            vis[src]= true;

            for (int nbr : adjList[src]) {
                if (src == nbr) return true; // self loop
                if (vis[nbr] == true) continue;
                    
                q.add(src);
            }
        }
        return
         false;
    }

    

    // Detect cycle in undirected graph
    boolean isCycle(ArrayList<Integer>[] adjList){
        int n= adjList.length;
        
        boolean[] vis= new boolean[n];

        for (int i = 0; i < n; i++) {
            if(vis[i] == true) continue; // same component
            if(bfs(i, adjList, vis) == true) return true;


        }
        return false;
    }
    public static void main(String[] args) {
        int V = 5; // Number of vertices
        ArrayList<Integer>[] adjList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    
        // Adding edges to the graph
        adjList[0].add(1);
        adjList[1].add(0);
        adjList[1].add(2);
        adjList[2].add(1);
        adjList[2].add(3);
        adjList[3].add(2);
        adjList[3].add(4);
        adjList[4].add(3);
        adjList[4].add(1); // This creates a cycle in the graph
        adjList[1].add(4);
    
        DCUDG graph = new DCUDG();
        if (graph.isCycle(adjList)) {
            System.out.println("Graph contains a cycle.");
        } else {
            System.out.println("Graph doesn't contain a cycle.");
        }  
    }
}