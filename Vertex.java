import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Vertex{
    private int id;
    private List<Vertex> adjVertexList = new ArrayList<>();

    public int getId(){
        return id;
    }
    public Vertex(int id){
        this.id = id;
    }

    public void addEdge(Vertex w){
        adjVertexList.add(w);
    }
    public List<Integer> getAdj(){
        return adjVertexList.stream().map((vertex -> vertex.getId())).collect(Collectors.toList());
    }
}
