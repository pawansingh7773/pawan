public class stackwitharray {
    public static class Stack{
        int [] arr = new int[5];
        int idx = 0;
         void push(int x){
            if(isFull()){
                System.out.println(" Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int pop(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx-1]; 
            arr[idx-1] = 0;
            idx--;
            return top;

        }
        int peek(){
            if(idx == 0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx-1];
        }
        void display(){
            for(int i =0 ;i<=idx-1;i++){
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            else  return false;
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        st.display();
        st.pop();
        st.pop();
        st.display();
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}
