//checking something;
public class main56{
    static int peakfake(int [] arr ){
        int n = arr.length;
        int st=0, end = n-1;
        int ans = -1;
        while(st<= end){
            int mid = st + (end-st)/2;
            if(arr[mid]<arr[mid+1]){
                ans = mid;
           end = mid-1;
            }else{
                st = mid +1;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int [] arr = {0,4,1,0};
        System.out.println("your ans :" +peakfake(arr));
    }
}