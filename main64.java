
//FINDING THE Nth NODE FROM THE END OF LINKED LIST;
//ALSO REVERSING A LINKED LIST USING RECURSION;

public class main64 {
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }
    static int end(Node head , int n){
        Node fast = head;
        Node slow = head;
        for(int i =1;i<=n ; i++){
           fast = fast.next;

        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;

    }
    static void display(Node head){
        if(head == null) return;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();

    }
    static Node reverse(Node head){
        if(head == null) return null;
        if(head.next == null) return head;
        Node nh = reverse(head.next);
        
        head.next.next = head;
        head.next = null;
        return nh;
    }
    public static Node displayr1(Node head){
        Node curr = head;
        Node agla = null;
        Node prev = null;
        while(curr!=null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
            
        }
        return prev;
    }
    public static Node display2(Node head){
        Node slow = head;
        Node fast = slow.next;
        while(fast!=null){//   
            fast.next = slow;
            fast = fast.next;/// NOW I KNOW WHY THIS CODE IS NOT WORKING ;
           if(slow == null)break;
           slow = slow.next;
            head.next = null;

        }
        return slow;
    }
    public static Node oddeven(Node head){
        Node temp = head;
        Node odd = new Node(0);
        Node tempo = odd;
        Node even = new Node(0);
        Node tempe = even;
        while(temp!=null){
            tempo.next = temp;
            tempo = temp;
            
            temp = temp.next;
            tempe.next = temp;
            tempe = temp;
            if(temp == null)break;
            temp  = temp.next;
        }
        odd = odd.next;
        even = even.next;
        tempo.next = even;
        return odd;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(5);
        Node c = new Node(6);
        Node d = new Node(7);
        Node e = new Node(8);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        int n = 5;
        System.out.println("ans :" +end(a, n));
      //
       //
       Node p = reverse(a);
       display(p);



    }
    
}
