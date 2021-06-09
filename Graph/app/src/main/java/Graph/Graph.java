package Graph;

import java.util.*;

public class Graph <T>{
  Set <Node> nodes;
  Set <Edge> edges;
  public Graph(){
    nodes = new HashSet<>();
  }
  public Node addNode(T input){
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
  public List<Node> breadthTraversal(Node node){
    if (node == null){
      throw new NullPointerException("input can not be null.");
    }

    List<Node> order = new ArrayList<>();
    Set<Node> visited = new HashSet<>();

    Queue<Node> queue = new LinkedList<>();

    visited.add(node);
    queue.add(node);

    while(queue.size() != 0){
      Node front = queue.poll();
      order.add(front);

      for(Edge neighbor :(Set<Edge>) front.neighbors){
        if (visited.add(neighbor.node)){
          queue.add(neighbor.node);
          visited.add(neighbor.node);
        }
      }
    }
    return order;
  }
  public String getEdge(Graph g, String[] cities){
    if (cities.length > nodes.size()||cities.length < 2){
      throw new IllegalArgumentException("wrong input");
    }

    int total = 0;
    for (int i = 0;i < cities.length-1; i++) {
      int j = i + 1;
      Node next = g.getPresentNode(cities[j]);
      Node current = g.getPresentNode(cities[i]);

      if (current.neighbors.contains(next)){
        total = total + current.getCost(next);
      }else{
        break;
      }
    }

    if (total == 0){
      return "false " + 0;
    }else{
      return "true " + total;
    }
  }
  public Node getPresentNode(T value){
    for(Node node : nodes){
      if (node.value == value){
        return node;
      }
    }
    return null;
  }
}
