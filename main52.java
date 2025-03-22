//SECOND TIME MAX INDEX IN ROTATED ARRAY;
public class main52 {
    static int max(int [] arr){
        int n = arr.length;
        int st = 0, end = n-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end-st)/2;
        if(arr[mid]> arr[n-1]){
            ans = mid;
            st = mid+1;
            
        }else if( arr[mid] <= arr[n-1]){
            //ans = mid;
            end = mid -1;
        }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("MAX INDEX OF AN ELEMENT IN AN ARRAY:");
        int [] arr = {4,5,6,7,1,2,3};
        System.out.println("YOUR ANSWER:"+max(arr));

    }
    
}
