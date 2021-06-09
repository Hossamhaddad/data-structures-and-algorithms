package Graph;

public class Edge {
  int weight;
  Node node;

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public Node getNode() {
    return node;
  }

  public void setNode(Node node) {
    this.node = node;
  }

  public Edge(Node node, int weight) {
    this.node = node;
    this.weight = weight;

  }
  public Edge(Node node){
    this.node=node;
  }
}
