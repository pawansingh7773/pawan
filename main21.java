//REVERSING AN ARRAY

public class main21 {
    static void reversearray(int [] arr , int idx){
        int n = arr.length;
        if(idx == n) return;
        reversearray(arr, idx+1);
        System.out.println(arr[idx]);
    
        
    }
    public static void main(String[] args) {
        System.out.println("REVERSING AN ARRAY:");
        int []arr = {1,2,3,4,5};
        int n = arr.length;
        //for(int i=arr.length-1;i>=0;i--){
       ///     System.out.println(arr[i]);
       // }
       reversearray(arr, 0);
      // for(int i=0;i<arr.length;i++){
      ////  System.out.println(arr[i]);
      // }
    }
}
