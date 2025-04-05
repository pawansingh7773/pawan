import java.util.*;
public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int [] arr = new int[q.size()];
        for(int i = 0 ; i < arr.length; i++){
            
            arr[i] = q.remove();
        }
        for(int i = arr.length-1 ; i>=0 ; i--){
            q.add(arr[i]);
        }
        int j =0;
          while(q.size()>0){
           System.out.println(q.peek());
            arr[j++] = q.remove();


        }
        

    }
    
}
