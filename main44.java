//FINDING IDX OF MAX NO IN ROTATED ARAY;
public class main44 {
    static int max(int [] arr){
        int n = arr.length;
        int st=0,end=n-1;
        int ans = -1;
        while(st<=end){
            int mid = st+(end -st)/2;
            if(arr[mid]>arr[n-1]){
                ans = mid;
                st = mid +1;

            } else if(arr[mid] <= arr[n-1]){
                end = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("FINDING MAXIMUM ELEMENTS'S IDX");
        int [] arr = {3,4,5, 6,1,2};
        System.out.println("YOUR ANS:" +max(arr));
    }
    
}
