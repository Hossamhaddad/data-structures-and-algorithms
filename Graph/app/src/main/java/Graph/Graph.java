package Graph;

import java.util.HashSet;
import java.util.Set;

public class Graph {
  Set <Node> nodes;
  Set <Edge> edges;
  public Graph(){
    nodes = new HashSet<>();
  }
  public Node addNode(int input){
    Node newNode = new Node(input);
    nodes.add(newNode);
    return newNode;
  }
  public boolean addEdge(Node src, Node dest){
    if (nodes.contains(src) && nodes.contains(dest)){
      src.addNeighbor(dest);
      dest.addNeighbor(src);
      return true;
    }
    return false;
  }
  public boolean addEdge(Node src, Node dest,int weight){
    if (nodes.contains(src) && nodes.contains(dest)){
      src.addNeighbor(dest,weight);
      dest.addNeighbor(src,weight);
      return true;
    }
    return false;

  }
  public Set<Node> getNodes(){
    if (nodes.isEmpty()){
      return null;
    }else {
      return nodes;
    }
  }

  public Set<Edge> getNeighbors(Node inputNode){
    return inputNode.neighbors;
  }

  public int size(){
    return nodes.size();
  }
}
