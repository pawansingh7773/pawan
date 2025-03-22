
public class main65 {
    public static class node{
        int val;
        node next;
        node prev;
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
    public static void displayrev(node head){
        node temp = head;
        while(temp.next!= null){
            temp = temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val +" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayr(node random){
        node temp = random;
        while(temp.prev!=null){
           // if(temp == null) break;
            temp = temp.prev;
        }
        while(temp!= null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static node insertatidx(node head , int idx , int x){
        node temp = head;
        for(int i =1 ; i<=idx-1;i++){
            temp = temp.next;
        }
        node h = new node(x);
        node t = h;
        t.next = temp.next;
        t.prev = temp;
        temp.next = t;
        t.next.prev = t;
        return head;
    }
    public static node insertathead(node head , int x){
        node temp = head;
        node h = new node(x);
        node t = h;
        temp.prev = t;
        t.next = temp;
        t.prev = null;
        return h;
        
    }
    public static node insertattail(node head , int x){
        node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        node t = new node(x);
        node temp1 = t;
        temp.next = temp1;
        temp1.prev = temp;
        temp1.next = null;
        return t;

    }
    public static boolean ispalindrome(node head){
        node temp1 = head;
        node temp2 = head;
        while(temp2.next!=null){
            temp2 = temp2.next;
        }
        while(temp1!=temp2){
            if(temp1.val == temp2.val) return true;
            temp1 = temp1.next;
            temp2 = temp2.prev;

        }
        return false;
    }
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(3);
        node e = new node
        (2);
       node f = new node(1);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = f;
        f.prev = e;

       // display(a);
       // displayrev(a);
      // displayr(e);
      // node r = insertathead(a, 30);
      // display(r);
      // node m = insertattail(a, 30);
      // display(m);
      // node n = insertatidx(a, 2, 40);
      // display(n);
      System.out.println("is palindrome: " +ispalindrome(a));

    }
}
