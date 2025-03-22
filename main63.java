//IMPLEMENTATION OF LINKED LIST CLASS WITH SEVERAL METHODS;
public class main63 {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        node head = null;
        node tail = null;
        int size;
        void display(){
            node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void insertatend(int val){
            node temp = new node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }else{
                tail.next = temp;
                tail = temp;

            }
            size++;
        }
        void insertatbeg(int val){
            node temp = new node(val);
            if(head == null){
                insertatbeg(val);
            }else{
                tail = tail.next;
                tail = temp;
            }
            size++;
        }
        int getelement(int idx){
            node temp = head;
            for(int i =1;i<=idx;i++){
                temp = temp.next;
            }
            return temp.data;
        }
        void insert(int idx , int val){
            node t = new node(val);
            node temp = head;
            for(int i =1;i<=idx-1;i++){
                temp = temp.next;

            }
            t.next = temp.next;
            temp.next = t;
            size++;
                }
                void delete(int idx){
                    node temp = head;
                    for(int i =1;i<=idx-1;i++){
                        temp = temp.next;
                    }
                    temp.next = temp.next.next;
                    tail = temp;
                    size--;
                }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
      //  ll.insertatbeg(7);
        ll.insertatend(100);
        ll.insert(1, 24);
        ll.display();
        ll.getelement(1);
        ll.display();
        ll.delete(1);
        ll.display();
    }
    
}
