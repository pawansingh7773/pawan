public class main51 {
    static void s(int [] arr , int idx ){
        
        if(idx == arr.length)  return;
        int ans =0;
        s(arr, idx+2);
        if(arr[idx] != arr[idx+1]){
             ans = arr[idx+1];

        }

    }
    static int single(int [] arr){

    }
    
}
