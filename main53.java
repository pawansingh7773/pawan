public class main53 {
static int min(int [] arr){
    int n = arr.length;
    int st=0, end=n-1;
    int ans = -1;
    while(st<=end){
        int mid = st + (end-st)/2;
        if(arr[mid]>arr[n-1]){
            st = mid +1;
        }else if(arr[mid] <= arr[n-1]){
            ans = mid;
            end = mid-1;

        }
    }
    return ans;
}    
public static void main(String[] args) {
    int [] arr = {3,4,5,1,2};
    System.out.println("YOUR ANS:"+min(arr));
}
}
