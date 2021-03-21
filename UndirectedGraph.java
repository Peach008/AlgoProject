import java.util.List;

public class UndirectedGraph {
    private Vertex[] vertices;

    public  UndirectedGraph(int v){
        vertices = new Vertex[v];
        for (int i = 0; i <v; i++){
            vertices[i] = new Vertex(i);
        }
    }

    public void addEdge(int v, int w){
        vertices[v].addEdge(vertices[w]);
        vertices[w].addEdge(vertices[v]);
    }

    public List<Integer> getAdj(int v){
        return vertices[v].getAdj();
    }
    public static void main(String[] args){
        UndirectedGraph graph = new UndirectedGraph(3);

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(0,2);

        List<Integer> agj = graph.getAdj(2);
        for( Integer integer : agj){
            System.out.println(String.valueOf(integer));
        }
    }
}
