//BINARY SEARCH IN ROTATED ARRAY;IDX OF MINIMUM ELEMENT;
public class main43 {
    static int minimum(int[] arr){
        int n = arr.length;
        int st =0, end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st +(end-st)/2;
            if(arr[mid]>arr[n-1]){
                st = mid+1;
            }else if(arr[mid]<=arr[n-1]){
                ans = mid;
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("FINDING MIN IDX IN ROTATED ARRAY:");
        int [] arr = {4,5,1,2,3};
        System.out.println("YOUR ANS :"+minimum(arr));
    }
}
