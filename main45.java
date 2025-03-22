//finding tarrget;s idx in rotated array using binary search;
public class main45 {
    static int index(int [] arr , int x){
        int n = arr.length;
        int st=0, end=n-1;
        int ans = -1;
        while(st<=end){
            int mid = st + (end - st)/2;
            if(arr[mid]< arr[end]){
                if( x > arr[mid] && x <= arr[end]){
                    ans = mid;
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }else{
                if(x >= arr[st] && x<arr[mid]){
                    ans = mid;
                    end = mid-1;
                }else{
                    end = mid -1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("IDX OF A GIVEN A NUMBER:");
        int [] arr = {3,4,5,1,2};
        int x = 5;
        System.out.println("YOUR ANS :"+index(arr, x));
    }
}
