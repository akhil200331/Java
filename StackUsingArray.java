public class StackUsingArray {
  protected int stack[]=new int[100];
  protected int top=-1;
  boolean empty() {
    if (top>=0) {
      return false;
    }
    else {
      return true;
    }
  }
  void push(int data) {
    if (empty()) {
      stack[top+1]=data;
      top+=1;
    }
    else if (top==99) {
      System.out.println("Stack is full");
    }
    else {
      stack[top+1]=data;
      top+=1;
    }
  }
  void peek() {
    if (empty()) {
      System.out.println("Stack is empty");
    }
    else {
      System.out.println(stack[top]);
    }
  }
  int pop() {
    if(empty()) {
      System.out.println("Not possible to pop the element");
      return 0;
    }
    else {
      int temp=stack[top];
      top-=1;
      return temp;
    }
  }
  void display() {
    if (empty()) {
      System.out.println("Stack is empty");
    }
    else {
      for (int i=0;i<=top;i++) {
        System.out.print(stack[i]+" ");
      }
    }
  }
  public static void main(String[] args) {
    StackUsingArray s=new StackUsingArray();
    s.push(3);
    s.push(89);
    s.push(8);
    s.push(6);
    s.push(7);
    s.pop();
    s.peek();
    s.display();
  }
}