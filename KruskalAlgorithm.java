//21BCE9784 VADDI AKHIL LAB-9 KRUSKAL ALGORITHM
import java.util.*;
public class KruskalAlgorithm {
  class Edge implements Comparable<Edge> {
    int source, destination, weight;
    public int compareTo(Edge edgeToCompare) {
      return this.weight - edgeToCompare.weight;
    }
  }
  class Subset {
    int parent, value;
  }
  int vertices, edges;
  Edge edgeArray[];
  KruskalAlgorithm(int vertices, int edges){
    this.vertices = vertices; this.edges = edges;
    edgeArray = new Edge[this.edges];
    for (int i = 0; i < edges; ++i){
      edgeArray[i] = new Edge();
    }
  }
  String[] chars = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
  void kruskalAlgorithm() {
  Edge finalResult[] = new Edge[vertices];
  int newEdge = 0;
  int index = 0;
  for (index = 0; index < vertices; ++index) {
  finalResult[index] = new Edge();
  }
  Arrays.sort(edgeArray);
  Subset subsetArray[] = new Subset[vertices];
  for (index = 0; index < vertices; ++index)
  subsetArray[index] = new Subset();
  for (int vertex = 0; vertex < vertices; ++vertex) {
  subsetArray[vertex].parent = vertex;
  subsetArray[vertex].value = 0;
  }
  index = 0;
  while (newEdge < vertices - 1) {
    Edge nextEdge = new Edge();
    nextEdge = edgeArray[index++];
    int nextSource = findSetOfElement(subsetArray, nextEdge.source);
    int nextDestination = findSetOfElement(subsetArray, nextEdge.destination);
    if (nextSource != nextDestination) {
      finalResult[newEdge++] = nextEdge;
      performUnion(subsetArray, nextSource, nextDestination);
    }
  }
  int costOfMST = 0;
  System.out.println("\n\nThe minium spanning tree contains : ");
  System.out.printf("%-10s%-6s\n","Edges","weight");
  for (index = 0; index < newEdge; ++index) {
    System.out.printf("%s <-> %s\t%4d\n", chars[finalResult[index].source], chars[finalResult[index].destination],
    finalResult[index].weight);
    costOfMST += finalResult[index].weight;
  }
  System.out.println("\nTotal cost of Minium spanning tree is " + costOfMST);
}
  int findSetOfElement(Subset subsetArray[], int i) {
    if (subsetArray[i].parent != i)
    subsetArray[i].parent = findSetOfElement(subsetArray, subsetArray[i].parent);
  return subsetArray[i].parent;
  }
  void performUnion(Subset subsetArray[], int sourceRoot, int destinationRoot) {
    int nextSourceRoot = findSetOfElement(subsetArray, sourceRoot);
    int nextDestinationRoot = findSetOfElement(subsetArray, destinationRoot);
    if (subsetArray[nextSourceRoot].value < subsetArray[nextDestinationRoot].value) {
      subsetArray[nextSourceRoot].parent = nextDestinationRoot;
    }
    else if (subsetArray[nextSourceRoot].value > subsetArray[nextDestinationRoot].value) {
      subsetArray[nextDestinationRoot].parent = nextSourceRoot;
    }
    else {
      subsetArray[nextDestinationRoot].parent = nextSourceRoot; subsetArray[nextSourceRoot].value++;
    }
  }
  void printGraph() {
    System.out.println("\nThe edges and corresponding weight of given graph is : ");
    System.out.printf("%-10s\t%-6s\n","Edge", "Weight");
    for (int i = 0; i < edgeArray.length; i++) {
      System.out.printf("%s <-> %s\t\t%d\n",chars[edgeArray[i].source], chars[edgeArray[i].destination],
      edgeArray[i].weight);
    }
  }
  public static void main(String[] args) {
    int v = 8, e = 15;
    KruskalAlgorithm graph = new KruskalAlgorithm(v, e);
    graph.edgeArray[0].source = 0;
    graph.edgeArray[0].destination = 1;
    graph.edgeArray[0].weight = 8;
    graph.edgeArray[1].source = 0;
    graph.edgeArray[1].destination = 5;
    graph.edgeArray[1].weight = 10;
    graph.edgeArray[2].source = 0;
    graph.edgeArray[2].destination = 7;
    graph.edgeArray[2].weight = 4;
    graph.edgeArray[3].source = 1;
    graph.edgeArray[3].destination = 2;
    graph.edgeArray[3].weight = 4;
    graph.edgeArray[4].source = 1;
    graph.edgeArray[4].destination = 4;
    graph.edgeArray[4].weight = 10;
    graph.edgeArray[5].source = 1;
    graph.edgeArray[5].destination = 5;
    graph.edgeArray[5].weight = 7;
    graph.edgeArray[6].source = 1;
    graph.edgeArray[6].destination = 7;
    graph.edgeArray[6].weight = 9;
    graph.edgeArray[7].source = 2;
    graph.edgeArray[7].destination = 3;
    graph.edgeArray[7].weight = 3;
    graph.edgeArray[8].source = 2;
    graph.edgeArray[8].destination = 5;
    graph.edgeArray[8].weight = 3;
    graph.edgeArray[9].source = 3;
    graph.edgeArray[9].destination = 4;
    graph.edgeArray[9].weight = 25;
    graph.edgeArray[10].source = 3;
    graph.edgeArray[10].destination = 6;
    graph.edgeArray[10].weight = 2;
    graph.edgeArray[11].source = 4;
    graph.edgeArray[11].destination = 5;
    graph.edgeArray[11].weight = 2;
    graph.edgeArray[12].source = 4;
    graph.edgeArray[12].destination = 6;
    graph.edgeArray[12].weight = 7;
    graph.edgeArray[13].source = 5;
    graph.edgeArray[13].destination = 3;
    graph.edgeArray[13].weight = 18;
    graph.edgeArray[14].source = 6;
    graph.edgeArray[14].destination = 7;
    graph.edgeArray[14].weight = 3;
    graph.printGraph();
    graph.kruskalAlgorithm();
  }
}