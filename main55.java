//FINDING IDX OF TARGET IN DUPICATE ROTTATED ARRAY;
public class main55 {
    static boolean  idx(int[] arr , int target){
        int n = arr.length;
        int st =0 , end = n-1;
       // int ans = -1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target) return true;
            if( arr[st] == arr[mid] && arr[mid] == arr[end]){
                st++;
                end--;

            }else if(arr[mid] <= arr[end]){
                if(target > arr[mid] && target<= arr[end]){
                    st = mid +1;
                }else{
                    end = mid -1;
                }
            }else {
                if(target >= arr[st] && target<arr[mid]){
                    end = mid-1;
                }else{
                    st = mid+1;
                }
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,0,1,1,1,1,2,0,0,0};
        int target = 6;
        System.out.println("YOUR ANS :" +idx(arr, target));
    }
    
}
