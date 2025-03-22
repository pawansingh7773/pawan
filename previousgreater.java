import java.util.*;
public class previousgreater {
    public static int[] previousgre(int [] arr){
        int n = arr.length;
        int [] result = new int[n];
        Stack<Integer> st = new Stack<>();
        result[0] = -1;
        st.push(arr[0]);
        for(int i =1 ; i<n ; i++){
            while(st.peek()<arr[i] && st.size()>0){
                st.pop();
                if(st.size()==0) st.push(arr[i]);
            }
            if(st.peek()>arr[i]){
                result[i] = st.peek();
                st.push(arr[i]);
            }else{
                result[i] = -1;
                st.push(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int [] arr = {100 , 80 , 60 ,70 , 60 , 75,85};
        int [] result = previousgre(arr);
        for(int val : result){
            System.out.print(val +" ");
        }
        System.out.println();
    }
    
}
