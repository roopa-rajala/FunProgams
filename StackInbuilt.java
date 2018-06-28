import java.util.Stack;
public class Node{
int data;
Node next;
public Node(int data){
  this.data=data;
}
public static void main(String args[]){
  Stack<Node> stack=new Stack<Node>();  // stack with Node as an type of element
  Node node=new Node(1); //head Node
  stack.push(node);
  node.next=new Node(2);
  stack.push(node.next);
  System.out.println(stack.search(node));// gives 2 as this is the position of node 
  System.out.println(stack.search(node.next));// gives 1 as this is the position of node 
  System.out.println(stack.pop().data);// gives 2 as this is the top
  System.out.println(stack.push(new Node(3)).data);// gives 3
  System.out.println(stack.peek().data);// gives 3
  System.out.println(stack.empty());// gives false
}
}
