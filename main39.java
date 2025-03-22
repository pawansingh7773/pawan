//Binary search ques 2;
public class main39 {
    static int binaryindex(int [] arr , int x){
        int n = arr.length;
        int st =0, end = n-1;
        int ans = -1;
        while(st<= end){
            int mid = st + (end-st)/2;
            if(arr[mid] == x){
                ans = mid;
                st = mid+1;
            }else if(arr[mid]>x){
                end = mid -1;

            }else{
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("FINDING LAST IDX OF AN ELEMENT:");
        int [] arr = {1,2,2,2,2,4,4,4,6};
        int x = 5;
        System.out.println("YOUR ANS IS :"+binaryindex(arr, x));
    }
    

}
