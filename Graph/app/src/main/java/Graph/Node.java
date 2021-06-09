package Graph;

import java.util.HashSet;
import java.util.Set;

public class Node  {
int value;
  Set<Edge> neighbors;

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node(int value) {
    this.value = value;
    this.neighbors=new HashSet<>();
  }
  public boolean addNeighbor(Node node){
    Edge edge = new Edge(node);
    this.neighbors.add(edge);
    return true;
  }
  public boolean addNeighbor(Node node, int weight){
    Edge edge = new Edge(node, weight);
    this.neighbors.add(edge);
    return true;
  }

}
