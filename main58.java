

//implementing count sort method;
public class main58 {
    static int max(int [] a){
        int mx = Integer.MIN_VALUE;
        int n = a.length;
        for(int i =0 ; i <n;i++){
            if(a[i]> mx){
                mx = a[i];
            }
        }
        return mx;
    }
    static void   count(int [] arr ){
        int n = arr.length;
        int mx = max(arr);
        int [] ans = new int [mx+1];
        int [] out = new int [n];
        for(int i =0;i<n;i++){
        ans[arr[i]]++;}
        for(int i =1;i<ans.length;i++){
            ans[arr[i]] += ans[arr[i]-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx = ans[arr[i]]-1;
            out[idx] = arr[i];
            ans[arr[i]]--;
        }
         for(int i=0;i<n;i++){
            arr[i] = out[i];
         } 
            
        
    }
    public static void main(String[] args) {
        int [] arr = {5,43,6,7,2};
     System.out.println("max value :" +max(arr));
     count(arr);
        // count(arr);
    }
}
