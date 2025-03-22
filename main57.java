public class main57 {
    static int method(int []  arr , int idx , int target){
        int n = arr.length;
        if(idx <= 0) return idx;
        idx = n-1;
        if(arr[idx] == target) return idx;
        return method(arr, idx-1, target);
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,2,2,2,3,3,3};
        int target = 2;
        System.out.println("YOUR ANS :"+method(arr, 0, target));
    }
    
    
}
