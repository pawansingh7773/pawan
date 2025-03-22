//BASIC LINKED LIST 
public class main62 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        node a = new node(3);
        node b = new node(4);
        node c = new node(6);
        node d = new node(7);
        node e = new node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println(a.data);
        System.out.println(a.next.data);
        System.out.println(a.next.next.data);
        System.out.println(a.next.next.next.data);
        System.out.println(a.next.next.next.next.data);
        System.out.println(e.next.next.next.next.next.data);
    }
}
