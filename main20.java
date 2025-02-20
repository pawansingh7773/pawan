//IF A ARRAY IS SORTED OR NOT;
public class main20 {
    static boolean yesorno(int []arr){
        int n = arr.length;
        boolean ans = false;
     for (int i = 0; i <n-1; i++){
        if(arr[i]>arr[i+1]){
            ans = false;
        }else{
            ans = true;
        }

     }  
     return ans;
         
         
     
    }
    static boolean sorted(int[]arr, int idx){
        int n = arr.length;
        if(idx == n-1) return true;
        
        if(arr[idx]>arr[idx+1]) return false;
        return sorted(arr, idx+1);
    }
    public static void main(String[] args) {
        System.out.println("CHECKING IF ARRAY IS SORTED OR NOT:");
        int []arr = {1,2,3,4};
        if(sorted(arr, 0)){
   System.out.println("yes");

        }else{
            System.out.println("no");
        }
    }
}
