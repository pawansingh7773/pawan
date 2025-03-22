public class main61{
    static int min(int [] arr){
        int n = arr.length;
        int ans = -1;
        int st = 0 , end = n-1;
        while(st<=end){
            int mid = st +(end - st)/2;
            if(arr[mid]>arr[end]){
                st = mid+1;
              //  ans = mid;
            }else if(arr[mid]<=arr[end]){
                end = mid -1;
                ans = mid;
                
            }

        }
        return ans ;
    }
    public static void main(String[] args) {
        int []arr = {3,4,5,1,2};
        System.out.println(" YOUR ANS :" +min(arr));
    }
}