public class llimplementstack {
  public static class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
  }
  public static class Stack{
    Node head = null;
    void push(int x){
        Node y = new Node(x);
        y.next = head;
        head = y;
    }
    int pop(){
        if(head == null) return -1;
        int top = head.val;
        head = head.next;
        
        return top;
    }
    int peek(){
        if(head == null) return -1;
        return head.val;

    }
    void displayreverse(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;

        }
        System.out.println();

    }
    void displayr(Node head){
        Node temp = head;
        if(temp == null) return;
        displayr(temp.next);
        System.out.println(temp.val +"");

    }
    void display(){
        displayr(head);
        
    }











  }   
  public static void main(String[] args) {
      Stack st = new Stack();
      st.push(3);
      st.push(4);
      st.push(5);
      st.push(6);
      //st.displayreverse();
     // st.display();
     //System.out.println(st.peek());
     st.pop();
    // System.out.println(st.peek());
     st.pop();
     st.pop();
     st.pop();
     System.out.println(st.peek());
     st.displayreverse();
  } 
}
