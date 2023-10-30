import java.util.*;
public class Topologysort {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        
        graph[2].add(new Edge(2, 3, 1));
        
        graph[3].add(new Edge(3, 1, 1));
        
        graph[4].add(new Edge(4, 0, 1));
        graph[4].add(new Edge(4, 1, 1));
        
        graph[5].add(new Edge(5, 0, 1));
        graph[5].add(new Edge(5, 2, 1));
    }
    
    public static void topsortUtil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> stack){
        vis[curr]=true;
                                   
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
             topsortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(curr);

    }
    public static void topsort(ArrayList<Edge>[] graph,int V){
        boolean vis[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                 topsortUtil(graph, i, vis, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topsort(graph, V);
    }
    

}

