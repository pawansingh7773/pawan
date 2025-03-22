//CIRCULER LINKED LIST;
public class main66 {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
        }
    }
    public static void display(node head){
        node temp = head.next;
        System.out.print(head.val +" ");
        while(temp!=head){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(node head){
        node temp = head;
        while(temp.next!=head){
            temp = temp.next;

        }
        node t = temp;
        while(temp.next!=t){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node delete(node head){
        node temp = head;
        while(temp.next!= head){
            temp = temp.next;
        }
        head = head.next;
        temp.next = temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        node a  = new node(2);
        node b  = new node(3);
        node c  = new node(4);
        node d = new node(5);
        node e  = new node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = a;
       display(a);
     // displayrev(a);
     node m = delete(a);
     display(m);
    }
    
}
