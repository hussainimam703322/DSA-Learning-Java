import java.util.ArrayList;
import java.util.Stack;
//cycle detection directed graph
public class Iscycledetect {
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
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[3].add(new Edge(3, 0, 1));
        
        
    }
    static boolean Iscycledetected(ArrayList<Edge> graph[], boolean vis[],int curr, boolean Stack[]){
        vis[curr]= true;
        Stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(Stack[e.dest]){           /*  |0 | 1 | 2 | 3 | 4 |  */ 
                 return true;            /*  | |   | F | F | F |  */ 
                 //cycle exists
            }
            else if(!vis[e.dest] && Iscycledetected(graph, vis, e.dest, Stack)){
                return true;
            }
        }
        Stack[curr]=false;
        return false;
    } 
    public static void main(String[] args) {
         
        int V = 7;
        
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(Iscycledetected(graph, new boolean[V],0,new boolean[V]));
        
    }
}
/* 
                        0
                       /  \
                      /    \
                     /      \
                    2--------1   
                    \       /
                     \     /
                      \   /
                        3
*/
