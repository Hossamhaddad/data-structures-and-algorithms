package Graph;

import java.util.HashSet;
import java.util.Set;

public class Node <T> {
T value;
  Set<Edge> neighbors;

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Node(T value) {
    this.value = value;
    this.neighbors=new HashSet<>();
  }
  public boolean addNeighbor(Node<T> node){
    Edge edge = new Edge(node);
    this.neighbors.add(edge);
    return true;
  }
  public boolean addNeighbor(Node<T>node, int weight){
    Edge edge = new Edge(node, weight);
    this.neighbors.add(edge);
    return true;
  }
  public int getCost(Node dest){
    for (Edge edge : this.neighbors){
      if (edge.node.equals(dest)){
        return edge.weight;
      }
    }
    return 0;
  }

}
