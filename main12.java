public class main12 {
    static void reversearray(int []arr , int idx){
        int n = arr.length;
        if(idx== n) return;
        reversearray(arr, idx+1);
        System.out.println(arr[idx]);
    
    }
    public static void main(String[] args) {
        System.out.println("PRINTING A REVERSE ARRAY:");
        int [] arr = {1,2,3,4,5};
    
    reversearray(arr, 0);
    }
    
}
