//VADDI AKHIL 21BCE9784 LAB-9 Q1+Q2 BFS+DFS
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
class Graphsdb {
  int nv;
  Map<Character,ArrayList<Character>> gp;
  public Graphsdb(int nvv) {
    this.nv=nvv;
    gp=new HashMap<>();
  }
  public void addVertex(char ch) {
    gp.put(ch, new ArrayList<>());
  }
  public void addEdge(char src,char des) {
    gp.get(src).add(des);
  }
  public void printgp() {
    System.out.println("Adjacency List:");
    StringBuilder b=new StringBuilder();
    for (Character c:gp.keySet()) {
      b.append(c.toString()+": ");
      for (Character v:gp.get(c)) {
        b.append(v.toString()+" ");
      }
      b.append("\n");
    }
    System.out.println(b.toString());
  }
  public void printBfs(char src) {
    Queue<Character> queue=new LinkedList<>();
    ArrayList<Character> list=new ArrayList<>();
    queue.add(src);
    list.add(src);
    System.out.println("BFS traversal order starting node as "+src);
    while (!queue.isEmpty()) {
      char curr=queue.poll();
      System.out.print(curr+" ");
      ArrayList<Character> arradj=gp.get(curr);
      for (int i=0;i<arradj.size();i++) {
        char curre=arradj.get(i);
        if (!(list.contains(curre))) {
          queue.add(curre);
        }
      }
    }
    System.out.println();
  }
  public void printDfs(char src) {
    Stack<Character> stack=new Stack<>();
    ArrayList<Character> list=new ArrayList<>();
    stack.push(src);
    list.add(src);
    System.out.println("DFS traversal order starting node as "+src);
    while (!(stack.isEmpty())) {
      char curr=stack.pop();
      System.out.print(curr+" ");
      ArrayList<Character> arradj=gp.get(curr);
      for (int i=0;i<arradj.size();i++) {
        char curre=arradj.get(i);
        if (!(list.contains(curre))) {
          stack.add(curre);
          list.add(curre);
        }
      }
    }
    System.out.println();
    }
}
public class GT {
  public static void main(String[] args) {
    Graphsdb p=new Graphsdb(8);
    p.addVertex('A');
    p.addVertex('B');
    p.addVertex('C');
    p.addVertex('D');
    p.addVertex('E');
    p.addVertex('F');
    p.addVertex('G');
    p.addVertex('H');
    p.addEdge('A', 'B');
    p.addEdge('D', 'C');
    p.addEdge('D', 'E');
    p.addEdge('D', 'F');
    p.addEdge('E', 'G');
    p.addEdge('F', 'C');
    p.addEdge('G', 'D');
    p.addEdge('G', 'H');
    p.addEdge('H', 'B');
    p.printgp();
    p.printBfs('A');
    p.printDfs('D');
  }
}
