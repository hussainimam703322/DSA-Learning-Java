import java.util.ArrayList;

public class classroom{
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s, int d ,int w){
            this.src = s;
            this.des = d;
            this.wt  = w;    
        }
    }
    public static void main(String[] args) {
        int v =5; 
        ArrayList<Edge>graph[] = new ArrayList[v];
        //null value store at every index
        for(int i=0;i<v;i++){  //go to each index
            graph[i] = new ArrayList<>();// reach at each index and make new array as empty
        } 
 

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));

        for(int i=0;i<graph[2].size();i++){
            Edge e = graph[2].get(i);
            System.out.print(e.des + " ");
        }
        

    }
}
/*    
      (5)
   0-------1
         /   \
   (1)  /     \ (3)
       /       \
      2---------3
      |   (1)
    (2)|
       |
       4
 */