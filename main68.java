public class main68 {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val = val;
        }
    }
    public static void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node displayrev(node head){
        node slow = head;
        node fast = slow.next;
        while(fast!=null){
            fast.next = slow;
            fast = fast.next;
            slow = slow.next;
            head.next = null;
            head = slow;

        }
        return head;
    }
    public static node display2(node head){
        node curr = head;
        node prev = null;
        node agla = null;
        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;

        }
        return prev;

    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        node m = displayrev(a);
        display(m);
        node j = display2(a);
        display(j);
    }
    
}
