import java.util.ArrayList;
import java.util.Stack;
// strong connected component called KosaRaju Algorithm 
// changing the direction of the edges i.e calling dfs in reverse order
public class KosaRajuAlgo {
    static class Edge{
        int src;
        int dest;

        public Edge(int s,int d) {
            this.src = s;
            this.dest = d;
            
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }      
        
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        
        graph[1].add(new Edge(1, 0));
    
        graph[2].add(new Edge(2, 1));
        
        graph[3].add(new Edge(2, 1));
        
    }
    public static void topsort(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);

            if(!vis[e.dest]){
             topsort(graph, e.dest, vis,s);
            }
        }
        s.push(curr);

    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
        vis[curr]=true;
        System.out.print(curr+" ");
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }     
        }
    }
    public static void Kosaraju(ArrayList<Edge> graph[], int V){
        //step 1 O(V+E)
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topsort(graph, i, vis, s);
            }
        }
        //step 2 O(V+E)
        ArrayList<Edge> transpose[] = new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            vis[i]=false;
            transpose[i]= new ArrayList<Edge>();
        }
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest,e.src));
            }
        } 
        //step 3 //O(V+E)
        while(!s.isEmpty()){
            int curr = s.pop();
            if(!vis[curr]){
                dfs(transpose,curr,vis);
                System.out.println();
            }
           
        }      
    }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        Kosaraju(graph,V);
    }   
}
