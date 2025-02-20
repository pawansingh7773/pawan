

//LARGEST INDEX IN ARRAY USING ITERATION AND RECURSION;
public class main19 {
    static int largest1(int []arr){
        int n = arr.length;
        int ans =0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]> arr[i+1]){
                ans = arr[i];
            }else{
                ans = arr[i+1];
            }
            
            
        }
        return ans;
        
    }
    static int largest2(int[]arr, int idx){
        int n = arr.length;
     if(idx == n) return -1;
       int curr= arr[idx];
       return Integer.max(largest2(arr, idx+1), curr);
    }
    public static void main(String[] args) {
        System.out.println("LARGEST ELEMENT IN ARRAY:");
        int [] arr = {9,8,75,4,87};
        System.out.println("REQUIRED NO."+largest1(arr));
        System.out.println("required no."+largest2(arr, 0));
    }
}
